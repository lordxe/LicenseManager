package cl.lordxe.LicenseManager.model.domain.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
public @Data class Log {

    private int id;
    private String ip;
    private Date time;
    private int success;
    private int licenseId;

}
