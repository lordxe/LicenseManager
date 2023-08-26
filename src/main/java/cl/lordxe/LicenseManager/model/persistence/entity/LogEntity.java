package cl.lordxe.LicenseManager.model.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "logs")
@NoArgsConstructor
public @Data class LogEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int logId;
    private String ip;
    private Date time;
    private int success;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    private LicenseEntity license;
}
