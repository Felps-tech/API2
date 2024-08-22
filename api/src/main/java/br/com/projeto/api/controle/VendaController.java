package br.com.projeto.api.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import br.com.projeto.api.modelo.Venda;
import br.com.projeto.api.servico.VendaService;

@RestController
@RequestMapping("/api/vendas")
public class VendaController {

    @Autowired
    private VendaService vendaService;

    @GetMapping
    public List<Venda> listarTodasVendas() {
        return vendaService.listarTodasVendas();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Venda> buscarPorId(@PathVariable String id) {
        return vendaService.buscarPorId(id)
            .map(ResponseEntity::ok)
            .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Venda salvarVenda(@RequestBody Venda venda) {
        return vendaService.salvarVenda(venda);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarVenda(@PathVariable String id) {
        vendaService.deletarVenda(id);
        return ResponseEntity.noContent().build();
    }
}

