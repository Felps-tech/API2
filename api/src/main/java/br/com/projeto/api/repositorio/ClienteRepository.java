package br.com.projeto.api.repositorio;
import br.com.projeto.api.modelo.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, String> {
}