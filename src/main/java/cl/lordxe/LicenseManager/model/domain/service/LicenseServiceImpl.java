package cl.lordxe.LicenseManager.model.domain.service;

import cl.lordxe.LicenseManager.model.persistence.repository.LicenseRepository;
import cl.lordxe.LicenseManager.model.domain.dto.License;
import cl.lordxe.LicenseManager.model.persistence.mapper.LicenseMapper;
import org.springframework.stereotype.Service;
import cl.lordxe.LicenseManager.web.service.LicenseService;

import java.util.List;
import java.util.Optional;

@Service
public class LicenseServiceImpl implements LicenseService {

    private final LicenseRepository repository;
    private final LicenseMapper mapper;

    public LicenseServiceImpl(LicenseRepository repository, LicenseMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public Optional<List<License>> findAll() {
        return Optional.of(mapper.toLicenses(repository.findAll()));
    }

    @Override
    public Optional<License> findById(int id) {
        return repository.findById(id).map(mapper::toLicenseDto);
    }

    @Override
    public String generateLicense(int id) {
        return "";
    }

    @Override
    public Optional<License> create(License license) {
        return Optional.of(mapper.toLicenseDto(repository.save(mapper.toLicenseEntity(license))));
    }

    @Override
    public Optional<License> update(License license) {
        return Optional.of(mapper.toLicenseDto(repository.save(mapper.toLicenseEntity(license))));
    }

    @Override
    public void delete(int id) {
        repository.deleteById(id);
    }
}
