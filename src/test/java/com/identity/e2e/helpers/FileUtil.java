package com.identity.e2e.helpers;

/**
 * Created by vijithad on 19/06/2017.
 */

import com.opencsv.CSVReader;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;
import org.hibernate.validator.HibernateValidator;

import javax.validation.Validation;
import javax.validation.Validator;
import javax.xml.bind.DatatypeConverter;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


/**
 *
 * FileUtil was primarily designed to parse  the value seperated files.
 * But it also provides methods to parse XMl files to Java Beans and write beans into  xml files vice-versa, Bean validations etc.
 *
 * When using Java Beans to parse value seperated files, java generic type <T>  is required
 * e.g. FileUtil<Bean.class>  pasrer = new ....
 *
 *
 **/

public class FileUtil<T> {
    public final static String FILE_FORMAT_ERROR = "File format error  ";

    private Validator validator = Validation.byProvider (HibernateValidator.class)
            .configure ()
            .failFast (true)
            .buildValidatorFactory ()
            .getValidator ();


    /**
     * Parses delimited files in List of rows and arrays of columns for each rows.
     * @param fileName
     * @param delimiter e.g. '\t'  or ','
     * @param escapeChar  e.g. double quote (") or single quote (').
     * @return
     * @throws Exception
     */
    public List<List<String>> parse(String fileName, char delimiter, char escapeChar) throws Exception {
        try (CSVReader reader = new CSVReader(new FileReader(fileName), delimiter, escapeChar)) {
            List<String[]> lines = reader.readAll();
            return lines.stream().map(line -> Arrays.asList(line))
                    .collect(Collectors.toList());
        } catch (IOException e) {
            throw new IOException(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception(e.getMessage());
        }
    }

    /**
     * Parses delimited files in List Of Java beans.  This allows validations using java beans.
     * @param fileName
     * @param delimiter e.g. '\t'  or ','
     * @param escapeChar e.g. double quote (") or single quote (').
     * @param columns Array of the actual column names in the raw file e.g. new String[]{"locCode", "ctryCode", "subdivisionCode"]
     * @param clazz The bean class e.g. Location.class
     * @param <T>  when creating the calling object , the Bean class need to pass as generic e.g. TemplateParser<Location> =  new ...
     * @return
     * @throws Exception
     */
    public <T> List<T> convertCSVToBean(String fileName, char delimiter, char escapeChar, String[] columns, Class<T> clazz) throws Exception {
        try (CSVReader reader = new CSVReader(new FileReader(fileName), delimiter, escapeChar, 1)) {
            ColumnPositionMappingStrategy<T> mappingStrategy = new ColumnPositionMappingStrategy<>();
            mappingStrategy.setType(clazz);
            mappingStrategy.setColumnMapping(columns);

            CsvToBean ctb = new CsvToBean();
            return ctb.parse(mappingStrategy, reader);
        }
    }



    /**
     * Generates the SYNC_GUID for Location.
     * @param ctry
     * @param subDiv
     * @param locCode
     * @param name
     * @return
     */
    public String generateGuidForLocRecord(String ctry, String subDiv, String locCode, String name)  {
        try {
            subDiv = (subDiv != null) ? ((subDiv.indexOf ("-") >= 0) ? subDiv.substring (subDiv.indexOf ("-") + 1) : subDiv) : null;
            String sourceString = ctry + subDiv + locCode + name.concat ("CONCUR");
            byte[] digest = MessageDigest.getInstance ("MD5").digest (sourceString.getBytes ());
            String hashedValue = DatatypeConverter.printHexBinary (digest).toUpperCase ();
            return hashedValue;
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException (e);
        }

    }


    /**Generates the SYNC_GUID for LocationName.
     *
     * @param ctry
     * @param subDiv
     * @param locCode
     * @param langcode
     * @param locationName
     * @param isdefault
     * @return
     */
    public String generateGuidForLocationName(String ctry, String subDiv, String locCode, String langcode,String locationName, String isdefault)  {
        try {
            String sourceString ;
            if(isdefault.equalsIgnoreCase ("Y")){
                sourceString = ctry + subDiv + locCode + langcode + "Y"  + "CONCUR";
            }
            else {
                sourceString = ctry + subDiv + locCode + langcode + locationName;
            }
            byte[] digest = MessageDigest.getInstance ("MD5").digest (sourceString.getBytes ());
            String hashedValue = DatatypeConverter.printHexBinary (digest).toUpperCase ();
            return hashedValue;
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException (e);
        }

    }


    /**
     * Read XML files to Bean
     * @param pathString   target file path
     * @param clazz   Bean class.
     * @param <T>   The calling object needs T types . e.g TemplateParser<Bean>  parser  = new ...
     * @return
     * @throws Exception
     */
    public <T> T readXMLFromFile(String pathString , Class<T> clazz) throws Exception {
        JAXBContext jc = JAXBContext.newInstance(clazz);
        Unmarshaller unmarshaller = jc.createUnmarshaller();
        return (T) unmarshaller.unmarshal(new File(pathString));
    }

    /**
     *
     * @param pathString  -output file path
     * @param objectsToWrite
     * @throws Exception
     */
    public void writeXMLToFile(String pathString, Object objectsToWrite) throws Exception {
        File file = new File(pathString);
        JAXBContext  jaxbContext= JAXBContext.newInstance(objectsToWrite.getClass());
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        jaxbMarshaller.marshal(objectsToWrite, file);
    }




    //TODO: TBW
    public String removeTrailingAndLeadingQuotationsFromWord(String word){
        word = word.trim ();
        if(word.startsWith ("\'")  || word.startsWith("\""))  word  =  word.substring (1,word.length () );
        if(word.endsWith ("\'")  || word.endsWith("\""))  word  =  word.substring (0,word.length ()-1 );
        return word;
    }
}



