package cl.lordxe.LicenseManager.model.persistence.mapper;

import cl.lordxe.LicenseManager.model.domain.dto.License;
import cl.lordxe.LicenseManager.model.persistence.entity.LicenseEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface LicenseMapper {
    @Mappings({})
    License toLicenseDto (LicenseEntity license);
    List<License> toLicenses(List<LicenseEntity> licenses);
    @InheritInverseConfiguration
    LicenseEntity toLicenseEntity(License license);
}
