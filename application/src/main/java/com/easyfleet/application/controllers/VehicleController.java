package com.easyfleet.application.controllers;

import com.easyfleet.api.dto.VehicleDTO;
import com.easyfleet.application.services.IVehicleService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.core.env.Environment;
@RefreshScope
@RestController
@RequestMapping("/v1/vehicles")
@RequiredArgsConstructor
public class VehicleController {
    private final IVehicleService service;
    private final Environment environment;
    @Value("${environment.message}")
    private String env;

    @GetMapping("/ping")
    public ResponseEntity<String> ping() {
        return ResponseEntity.ok(env);
    }

    @GetMapping("/{id}")
    public ResponseEntity<VehicleDTO> getOne(@PathVariable Long id) {
        VehicleDTO vehicleDTO = service.getOne(id);
        return ResponseEntity.ok(vehicleDTO);
    }
}
