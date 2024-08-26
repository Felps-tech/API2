package br.com.projeto.api.modelo;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Version;
import lombok.Data;

@MappedSuperclass
@Data
public abstract class PeonEntity implements Serializable {

    @Id
    @Column(updatable = false, nullable = false, unique = true, length = 36)
    private String uuid = UUID.randomUUID().toString();
    
    @Version
    private int version;

    @CreationTimestamp
    @Column(nullable = false, updatable = false)
    private LocalDateTime dataCriacao;

    @UpdateTimestamp
    @Column(nullable = false)
    private LocalDateTime dataAlteracao;
}