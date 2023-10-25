package com.cartilladidactica.cartilladidactica.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="categoria")
@Data
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "descripcion")
    private String descripcion;
}
