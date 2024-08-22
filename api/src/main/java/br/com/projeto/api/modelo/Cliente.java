package br.com.projeto.api.modelo;
import org.hibernate.validator.constraints.br.CPF;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cliente extends PeonEntity {

    @Column(nullable = false)
    private String nome;

    @CPF
    @Column(nullable = false, unique = true)
    private String cpf;
}