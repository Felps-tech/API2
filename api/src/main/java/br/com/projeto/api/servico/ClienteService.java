package br.com.projeto.api.servico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import br.com.projeto.api.modelo.Cliente;
import br.com.projeto.api.repositorio.ClienteRepository;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> listarTodosClientes() {
        return clienteRepository.findAll();
    }

    public Optional<Cliente> buscarPorId(String id) {
        return clienteRepository.findById(id);
    }

    public Cliente salvarCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public void deletarCliente(String id) {
        clienteRepository.deleteById(id);
    }
}
