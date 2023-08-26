package cl.lordxe.LicenseManager.model.persistence.repository;

import cl.lordxe.LicenseManager.model.persistence.entity.LogEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LogRepository extends JpaRepository<LogEntity,Integer> {
}
