package com.cartilladidactica.cartilladidactica.repositories;

import com.cartilladidactica.cartilladidactica.models.Respuesta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RespuestaRepository extends JpaRepository<Respuesta, Long> {
    // Puedes agregar consultas personalizadas aquí si es necesario
}