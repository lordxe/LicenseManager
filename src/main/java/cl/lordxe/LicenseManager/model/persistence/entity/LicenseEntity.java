package cl.lordxe.LicenseManager.model.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "license")
@NoArgsConstructor
public @Data class LicenseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "lickey")
    private String licenseKey;
    private String hwid;
    private String owner;
    private int active;
    private int banned;
    private Date created;
    private int logins;
    private String type;
    @Column(name = "lastip")
    private String lastIp;
    private Date expiresAt;

}
