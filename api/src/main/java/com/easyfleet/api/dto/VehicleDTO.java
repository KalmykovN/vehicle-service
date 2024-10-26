package com.easyfleet.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class VehicleDTO {
    private Long id;
    private String name;
    private String plate;
    @JsonProperty("device")
    private DeviceDTO deviceDTO;
    @JsonProperty("last_position")
    private PositionDTO positionDTO;
}
