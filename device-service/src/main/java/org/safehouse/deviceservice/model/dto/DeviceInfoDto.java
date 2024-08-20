package org.safehouse.deviceservice.model.dto;

import lombok.Data;
import org.safehouse.deviceservice.model.entity.DeviceType;

@Data
public class DeviceInfoDto {
	DeviceType type;
}
