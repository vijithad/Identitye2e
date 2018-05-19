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


    final MimetypesFileTypeMap mimeTypesMap = new MimetypesFileTypeMap();
///Users/I316082/Downloads/e2e/src/test/resource
///Users/I316082/Identitye2e//test//resource//RegistrationDetails.xlsx

    public List<E2eFile> getFiles(FileTypeEnum fileType, String directory) throws Exception {

//      return  Files.walk(Paths.get(directory),1)
//                .filter(Files::isRegularFile)
//                .filter(file -> file.endsWith(fileType.type))
//                .map(path ->
//
//                        new E2eFile(
//                                path.getFileName().toString(),
//                                path.toFile().getName().substring(path.toFile().getName().length() - 3, path.toFile().getName().length() - 1),
//                                path.toFile().length(),
//                                mimeTypesMap.getContentType(path.toFile().getName()),
//                                path.toFile())
//
//
//                )
//
//                .collect(Collectors.toList());

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