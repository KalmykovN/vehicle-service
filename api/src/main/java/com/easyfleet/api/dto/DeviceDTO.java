package com.easyfleet.api.dto;

import com.easyfleet.api.enums.DeviceType;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class DeviceDTO {
    private Long id;

    private String name;

    private String serialNumber;

    private DeviceType type;
}
