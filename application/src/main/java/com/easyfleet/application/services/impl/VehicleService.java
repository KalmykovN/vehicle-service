package com.easyfleet.application.services.impl;

import com.easyfleet.api.dto.VehicleDTO;
import com.easyfleet.application.services.IVehicleService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleService implements IVehicleService {
    @Override
    public VehicleDTO getOne(Long vehicleId) {
        return null;
    }

    @Override
    public List<VehicleDTO> findAll() {
        return List.of();
    }
}
