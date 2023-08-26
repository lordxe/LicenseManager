package cl.lordxe.LicenseManager.web.controller;

import cl.lordxe.LicenseManager.model.domain.dto.License;
import cl.lordxe.LicenseManager.web.service.LicenseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/license")
public class LicenseRest {
    private final LicenseService service;

    public LicenseRest(LicenseService service) {
        this.service = service;
    }

    @GetMapping("/all")
    public ResponseEntity<List<License>> findAll() {
        return service.findAll()
                .map(licence -> new ResponseEntity<>(licence, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
}
