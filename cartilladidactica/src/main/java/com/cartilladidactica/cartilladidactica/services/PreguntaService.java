package com.cartilladidactica.cartilladidactica.services;

import com.cartilladidactica.cartilladidactica.models.Pregunta;
import com.cartilladidactica.cartilladidactica.repositories.PreguntaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PreguntaService {
    @Autowired
    private PreguntaRepository preguntaRepository;

    public Pregunta crearPregunta(Pregunta pregunta) {
        return preguntaRepository.save(pregunta);
    }

    public Pregunta actualizarPregunta(Pregunta pregunta) {
        return preguntaRepository.save(pregunta);
    }

    public void eliminarPregunta(Long id) {
        preguntaRepository.deleteById(id);
    }

    public List<Pregunta> listarPreguntas() {
        return preguntaRepository.findAll();
    }
}
