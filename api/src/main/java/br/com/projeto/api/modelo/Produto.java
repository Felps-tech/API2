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
public class Produto extends PeonEntity {

    @Column(nullable = false, unique = true)
    private String codigo;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private int quantidade;

    @Column(nullable = false)
    private double valor;

    @ManyToMany
    @JoinTable(
        name = "categoria_produto",
        joinColumns = @JoinColumn(name = "produto_id"),
        inverseJoinColumns = @JoinColumn(name = "categoria_id")
    )
    private Set<Categoria> categorias = new HashSet<>();

    @OneToMany(mappedBy = "produto")
    private Set<ItemVenda> itensVenda = new HashSet<>();
}