package cl.lordxe.LicenseManager.web.service;

import cl.lordxe.LicenseManager.model.domain.dto.License;

import java.util.List;
import java.util.Optional;

public interface LicenseService {
    Optional<List<License>> findAll();
    Optional<License> findById(int count);
    String generateLicense(int id);
    Optional<License> create(License license);
    Optional<License> update(License license);


    void delete(int id);
}
