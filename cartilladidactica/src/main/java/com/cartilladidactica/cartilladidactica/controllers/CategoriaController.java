package com.cartilladidactica.cartilladidactica.controllers;

import com.cartilladidactica.cartilladidactica.models.Categoria;
import com.cartilladidactica.cartilladidactica.services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {
    @Autowired
    private CategoriaService categoriaService;

    @PostMapping("/agregar")
    public Categoria crearCategoria(@RequestBody Categoria categoria) {
        return categoriaService.crearCategoria(categoria);
    }

    @PutMapping("/actualizar")
    public Categoria actualizarCategoria(@RequestBody Categoria categoria) {
        return categoriaService.actualizarCategoria(categoria);
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminarCategoria(@PathVariable Long id) {
        categoriaService.eliminarCategoria(id);
    }

    @GetMapping("/ver")
    public List<Categoria> listarCategorias() {
        return categoriaService.listarCategorias();
    }
}