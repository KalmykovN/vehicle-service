package com.easyfleet.application.controllers;

import com.easyfleet.api.dto.DeviceDTO;
import com.easyfleet.api.dto.PositionDTO;
import com.easyfleet.api.dto.VehicleDTO;
import com.easyfleet.api.enums.DeviceType;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping("/api/v1/vehicles")
public class VehicleController {
    @GetMapping("/{id}")
    public ResponseEntity<VehicleDTO> getOne(@PathVariable Long id) {
        PositionDTO positionDTO = new PositionDTO(1L, new BigDecimal("43.5453634"), new BigDecimal("11.3453634"), "Via XX Settembre");
        DeviceDTO deviceDTO = new DeviceDTO(1L, "device-1", "XXX-123", DeviceType.GPS);
        VehicleDTO vehicleDTO = new VehicleDTO(1L, "Fiat", "GB333CW", deviceDTO, positionDTO);
        return new ResponseEntity<>(vehicleDTO, HttpStatus.OK);
    }
}
