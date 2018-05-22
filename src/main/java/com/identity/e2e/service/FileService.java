package com.identity.e2e.service;

import com.identity.e2e.model.E2eFile;
import com.identity.e2e.model.FileTypeEnum;
import org.springframework.stereotype.Service;

import javax.activation.MimetypesFileTypeMap;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class FileService {
    /*
      * Service to scan the directory for the requested file type and return all the files of that matching type mapping to E2eFile
      * with details of name,extension,size,mimeType and File set.
      */
    final MimetypesFileTypeMap mimeTypesMap = new MimetypesFileTypeMap();

    public List<E2eFile> getFiles(FileTypeEnum fileType, String directory) throws Exception {

        return  Files.walk(Paths.get(directory))
                .filter(Files::isRegularFile)
                .filter(file -> file.getFileName().toString().endsWith(fileType.type))
                .map(path->{
                    File file = new File(path.toString());
                    long size   =file.length();
                    E2eFile e2eFile=  new E2eFile(
                            path.getFileName().toString(),
                            path.toFile().getName().substring(path.toFile().getName().length()-3, path.toFile().getName().length()),
                            size,
                            mimeTypesMap.getContentType(path.toFile().getName()), file
                    );
                    return  e2eFile;
                }
                ).collect(Collectors.toList());

                }

}