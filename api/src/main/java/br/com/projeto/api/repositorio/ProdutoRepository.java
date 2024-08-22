package br.com.projeto.api.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.projeto.api.modelo.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, String> {
}
