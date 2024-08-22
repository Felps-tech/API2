package br.com.projeto.api.modelo;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Categoria extends PeonEntity {

    @Column(nullable = false)
    private String nome;

    @ManyToMany(mappedBy = "categorias")
    private Set<Produto> produtos = new HashSet<>();
}

