package cl.lordxe.LicenseManager.model.persistence.mapper;


import cl.lordxe.LicenseManager.model.domain.dto.Log;
import cl.lordxe.LicenseManager.model.persistence.entity.LogEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = LicenseMapper.class)

public interface LogMapper {

    @Mappings({
            @Mapping(source = "logId", target = "id"),
            @Mapping(source = "ip", target = "ip"),
            @Mapping(source = "time", target = "time"),
            @Mapping(source = "success", target = "success"),
            @Mapping(source = "license.id", target = "licenseId"),

    })
    Log toLogDto(LogEntity log);
    List<Log> toLogs(List<LogEntity> logs);
    @InheritInverseConfiguration
    LogEntity toLogEntity(Log log);

}
