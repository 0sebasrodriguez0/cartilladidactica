package com.cartilladidactica.cartilladidactica.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="respuesta")
@Data
public class Respuesta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="descripcion")
    private String descripcion;
    @Column(name="categoria")
    private String categoria;
    // Constructores, Getters y Setters (puedes generarlos automáticamente en tu IDE)
}
