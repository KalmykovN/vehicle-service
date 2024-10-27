package com.easyfleet.application.services.impl;

import com.easyfleet.api.dto.DeviceDTO;
import com.easyfleet.api.dto.PositionDTO;
import com.easyfleet.api.dto.VehicleDTO;
import com.easyfleet.api.enums.DeviceType;
import com.easyfleet.application.services.IVehicleService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class VehicleService implements IVehicleService {
    @Override
    public VehicleDTO getOne(Long vehicleId) {
        PositionDTO positionDTO = new PositionDTO(1L, new BigDecimal("43.5453634"), new BigDecimal("11.3453634"), "Via XX Settembre");
        DeviceDTO deviceDTO = new DeviceDTO(1L, "device-1", "XXX-123", DeviceType.GPS);
        return new VehicleDTO(1L, "Fiat", "GB333CW", deviceDTO, positionDTO);
    }

    @Override
    public List<VehicleDTO> findAll() {
        return List.of();
    }
}
