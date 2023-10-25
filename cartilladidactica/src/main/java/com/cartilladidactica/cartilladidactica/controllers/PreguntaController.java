package com.cartilladidactica.cartilladidactica.controllers;

import com.cartilladidactica.cartilladidactica.models.Pregunta;
import com.cartilladidactica.cartilladidactica.services.PreguntaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/preguntas")
public class PreguntaController {
    @Autowired
    private PreguntaService preguntaService;

    @PostMapping
    public Pregunta crearPregunta(@RequestBody Pregunta pregunta) {
        return preguntaService.crearPregunta(pregunta);
    }

    @PutMapping
    public Pregunta actualizarPregunta(@RequestBody Pregunta pregunta) {
        return preguntaService.actualizarPregunta(pregunta);
    }

    @DeleteMapping("/{id}")
    public void eliminarPregunta(@PathVariable Long id) {
        preguntaService.eliminarPregunta(id);
    }

    @GetMapping
    public List<Pregunta> listarPreguntas() {
        return preguntaService.listarPreguntas();
    }
}
