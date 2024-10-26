package com.easyfleet.application.services;

import com.easyfleet.api.dto.VehicleDTO;

import java.util.List;

public interface IVehicleService {
    VehicleDTO getOne(Long vehicleId);

    List<VehicleDTO> findAll();
}
