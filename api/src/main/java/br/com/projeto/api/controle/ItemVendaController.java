package br.com.projeto.api.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import br.com.projeto.api.modelo.ItemVenda;
import br.com.projeto.api.servico.ItemVendaService;

@RestController
@RequestMapping("/api/itens-venda")
public class ItemVendaController {

    @Autowired
    private ItemVendaService itemVendaService;

    @GetMapping
    public List<ItemVenda> listarTodosItensVenda() {
        return itemVendaService.listarTodosItensVenda();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ItemVenda> buscarPorId(@PathVariable String id) {
        return itemVendaService.buscarPorId(id)
            .map(ResponseEntity::ok)
            .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ItemVenda salvarItemVenda(@RequestBody ItemVenda itemVenda) {
        return itemVendaService.salvarItemVenda(itemVenda);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarItemVenda(@PathVariable String id) {
        itemVendaService.deletarItemVenda(id);
        return ResponseEntity.noContent().build();
    }
}

