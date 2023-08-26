package cl.lordxe.LicenseManager.model.domain.service;

import cl.lordxe.LicenseManager.model.domain.dto.Log;
import cl.lordxe.LicenseManager.model.persistence.mapper.LogMapper;
import cl.lordxe.LicenseManager.model.persistence.repository.LogRepository;
import org.springframework.stereotype.Service;
import cl.lordxe.LicenseManager.web.service.LogService;

import java.util.List;
import java.util.Optional;

@Service
public class LogServiceImpl implements LogService {

    private final LogRepository repository;
    private final LogMapper mapper;

    public LogServiceImpl(LogRepository repository, LogMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public Optional<List<Log>> findAll() {
        return Optional.of(mapper.toLogs(repository.findAll()));
    }

    @Override
    public Optional<Log> findById(int id) {
        return repository.findById(id).map(mapper::toLogDto);
    }

    @Override
    public Optional<Log> create(Log log) {
        return Optional.of(mapper.toLogDto(repository.save(mapper.toLogEntity(log))));
    }

    @Override
    public Optional<Log> update(Log log) {
        return Optional.of(mapper.toLogDto(repository.save(mapper.toLogEntity(log))));
    }

    @Override
    public void delete(int id) {
        repository.deleteById(id);
    }
}
