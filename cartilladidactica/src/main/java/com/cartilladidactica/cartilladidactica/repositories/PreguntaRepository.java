package com.cartilladidactica.cartilladidactica.repositories;


import com.cartilladidactica.cartilladidactica.models.Pregunta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PreguntaRepository extends JpaRepository<Pregunta, Long> {
    // Puedes agregar consultas personalizadas aquí si es necesario
}
