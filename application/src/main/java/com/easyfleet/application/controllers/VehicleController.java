package com.easyfleet.application.controllers;

import com.easyfleet.api.dto.DeviceDTO;
import com.easyfleet.api.dto.PositionDTO;
import com.easyfleet.api.dto.VehicleDTO;
import com.easyfleet.api.enums.DeviceType;
import com.easyfleet.application.services.IVehicleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping("/api/v1/vehicles")
@RequiredArgsConstructor
public class VehicleController {
    private final IVehicleService service;

    @GetMapping("/{id}")
    public ResponseEntity<VehicleDTO> getOne(@PathVariable Long id) {
        VehicleDTO vehicleDTO = service.getOne(id);
        return new ResponseEntity<>(vehicleDTO, HttpStatus.OK);
    }


}
