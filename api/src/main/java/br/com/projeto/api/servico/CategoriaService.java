package br.com.projeto.api.servico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import br.com.projeto.api.modelo.Categoria;
import br.com.projeto.api.repositorio.CategoriaRepository;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public List<Categoria> listarTodasCategorias() {
        return categoriaRepository.findAll();
    }

    public Optional<Categoria> buscarPorId(String id) {
        return categoriaRepository.findById(id);
    }

    public Categoria salvarCategoria(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    public void deletarCategoria(String id) {
        categoriaRepository.deleteById(id);
    }
}
