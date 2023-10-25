package com.cartilladidactica.cartilladidactica.services;

import com.cartilladidactica.cartilladidactica.models.Categoria;
import com.cartilladidactica.cartilladidactica.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public Categoria crearCategoria(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    public Categoria actualizarCategoria(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    public void eliminarCategoria(Long id) {
        categoriaRepository.deleteById(id);
    }

    public List<Categoria> listarCategorias() {
        return categoriaRepository.findAll();
    }
}
