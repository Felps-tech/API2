package br.com.projeto.api.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.projeto.api.modelo.ItemVenda;

@Repository
public interface ItemVendaRepository extends JpaRepository<ItemVenda, String> {
}
