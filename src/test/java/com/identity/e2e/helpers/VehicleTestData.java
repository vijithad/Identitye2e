package com.identity.e2e.helpers;

import com.identity.e2e.model.Vehicle;
import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by I316082 on 19/05/2018.
 */
public class VehicleTestData {

    /**
     * Note: This Utility class parse the csv file and map the data to Vehicle List
     * @param fileLocation
     * @return
     * @throws Exception
     */
    public static List<Vehicle> getVehiclesfromCSV(String fileLocation) throws Exception {
        List<List<String>> vehicles_from_validation_file = parse(fileLocation, '\t', '\"');
        return vehicles_from_validation_file.stream().skip(1)// skip headeer
                .map(line -> new Vehicle(line.get(0), line.get(1),line.get(2))).collect(Collectors.toList());
    }

    /**
     * Parses delimited files in List of rows and arrays of columns for each rows.
     * @param fileName
     * @param delimiter e.g. '\t'  or ','
     * @param escapeChar  e.g. double quote (") or single quote (').
     * @return
     * @throws Exception
     */
    public static List<List<String>> parse(String fileName, char delimiter, char escapeChar) throws Exception {
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

}
