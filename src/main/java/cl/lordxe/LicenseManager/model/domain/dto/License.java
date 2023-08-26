package cl.lordxe.LicenseManager.model.domain.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
public @Data class License {

    private int id;
    private String licenseKey;
    private String hwid;
    private String owner;
    private int active;
    private int banned;
    private Date created;
    private int logins;
    private String type;
    private String lastIp;
    private Date expiresAt;

}
