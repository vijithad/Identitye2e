package com.identity.e2e.helpers;

import com.identity.e2e.model.Vehicle;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by I316082 on 19/05/2018.
 */
public class VehicleTestData {

    /**
     * Note: Not to be used directly in the test
     * @param fileLocation
     * @return
     * @throws Exception
     */
    public static List<Vehicle> getVehiclesfromCSV(String fileLocation) throws Exception {
        FileUtil<Vehicle> parser = new FileUtil<>();
        List<List<String>> vehicles_from_validation_file = parser.parse(fileLocation, '\t', '\"');
        return vehicles_from_validation_file.stream().skip(1)// skip headeer
                .map(line -> new Vehicle(line.get(0), line.get(1),line.get(2))).collect(Collectors.toList());
    }

}
