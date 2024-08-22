package br.com.projeto.api.servico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import br.com.projeto.api.modelo.ItemVenda;
import br.com.projeto.api.repositorio.ItemVendaRepository;

@Service
public class ItemVendaService {

    @Autowired
    private ItemVendaRepository itemVendaRepository;

    public List<ItemVenda> listarTodosItensVenda() {
        return itemVendaRepository.findAll();
    }

    public Optional<ItemVenda> buscarPorId(String id) {
        return itemVendaRepository.findById(id);
    }

    public ItemVenda salvarItemVenda(ItemVenda itemVenda) {
        return itemVendaRepository.save(itemVenda);
    }

    public void deletarItemVenda(String id) {
        itemVendaRepository.deleteById(id);
    }
}
