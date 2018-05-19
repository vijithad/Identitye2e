package com.identity.e2e.controller;

import com.identity.e2e.model.Vehicle;
import com.identity.e2e.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VehicleController {

    @Autowired
    private FileService fileService;

    @GetMapping(value = "/",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Vehicle[] getVehicles() {
        return new Vehicle[]{};
    }
}
