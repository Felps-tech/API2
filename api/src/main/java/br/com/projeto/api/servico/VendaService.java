package br.com.projeto.api.servico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import br.com.projeto.api.modelo.Venda;
import br.com.projeto.api.repositorio.VendaRepository;

@Service
public class VendaService {

    @Autowired
    private VendaRepository vendaRepository;

    public List<Venda> listarTodasVendas() {
        return vendaRepository.findAll();
    }

    public Optional<Venda> buscarPorId(String id) {
        return vendaRepository.findById(id);
    }

    public Venda salvarVenda(Venda venda) {
        return vendaRepository.save(venda);
    }

    public void deletarVenda(String id) {
        vendaRepository.deleteById(id);
    }
}
