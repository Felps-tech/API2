package br.com.projeto.api.modelo;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Venda extends PeonEntity {

    @Column(nullable = false)
    private double desconto;

    @Column(nullable = false)
    private LocalDateTime data;

    @Column(nullable = false)
    private double valorTotal;

    @ManyToOne
    @JoinColumn(name = "cliente_id", referencedColumnName = "uuid", nullable = false, columnDefinition = "BINARY(16)")
    private Cliente cliente;

    @OneToMany(mappedBy = "venda")
    private Set<ItemVenda> itensVenda = new HashSet<>();
}
