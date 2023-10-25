package com.cartilladidactica.cartilladidactica.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="pregunta")
@Data
public class Pregunta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="descripcion")
    private String descripcion;
    @Column(name="categoria")
    private String categoria;
    @Column(name="respuesta")
    private String respuesta;

    // Constructores, Getters y Setters (también puedes generarlos automáticamente en tu IDE)

}
