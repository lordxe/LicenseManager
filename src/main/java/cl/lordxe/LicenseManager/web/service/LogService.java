package cl.lordxe.LicenseManager.web.service;

import cl.lordxe.LicenseManager.model.domain.dto.Log;

import java.util.List;
import java.util.Optional;

public interface LogService {
    Optional<List<Log>> findAll();
    Optional<Log> findById(int id);
    Optional<Log> create(Log log);
    Optional<Log> update(Log log);
    void delete(int id);
}
