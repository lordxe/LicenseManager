package cl.lordxe.LicenseManager.model.persistence.repository;

import cl.lordxe.LicenseManager.model.persistence.entity.LicenseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LicenseRepository extends JpaRepository<LicenseEntity, Integer> {
}
