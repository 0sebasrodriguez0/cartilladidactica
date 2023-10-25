package com.cartilladidactica.cartilladidactica.repositories;
import com.cartilladidactica.cartilladidactica.models.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
    // Puedes agregar consultas personalizadas aquí si es necesario
}
