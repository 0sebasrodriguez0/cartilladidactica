package com.cartilladidactica.cartilladidactica.services;

import com.cartilladidactica.cartilladidactica.models.Respuesta;
import com.cartilladidactica.cartilladidactica.repositories.RespuestaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RespuestaService {
    @Autowired
    private RespuestaRepository respuestaRepository;

    public Respuesta crearRespuesta(Respuesta respuesta) {
        return respuestaRepository.save(respuesta);
    }

    public Respuesta actualizarRespuesta(Respuesta respuesta) {
        return respuestaRepository.save(respuesta);
    }

    public void eliminarRespuesta(Long id) {
        respuestaRepository.deleteById(id);
    }

    public List<Respuesta> listarRespuestas() {
        return respuestaRepository.findAll();
    }
}
