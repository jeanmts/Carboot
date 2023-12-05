package com.br.concessionaria.carboot.controllers;

import com.br.concessionaria.carboot.vehicles.models.Vehicles;
import com.br.concessionaria.carboot.vehicles.repository.VehicleRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/vehicles")
public class VehicleController {

    @Autowired
    private VehicleRepository vehicleRepository;

    @GetMapping
    public List<Vehicles> listVehicle() {
        return vehicleRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<Object> register(@RequestBody @Valid Vehicles vehicles) {
        Vehicles newVehicle = vehicleRepository.save(vehicles);
        return new ResponseEntity<>(newVehicle, HttpStatus.CREATED);
    }

}

