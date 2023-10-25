package com.cartilladidactica.cartilladidactica.controllers;

import com.cartilladidactica.cartilladidactica.models.Respuesta;
import com.cartilladidactica.cartilladidactica.services.RespuestaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/respuestas")
public class RespuestaController {
    @Autowired
    private RespuestaService respuestaService;

    @PostMapping
    public Respuesta crearRespuesta(@RequestBody Respuesta respuesta) {
        return respuestaService.crearRespuesta(respuesta);
    }

    @PutMapping
    public Respuesta actualizarRespuesta(@RequestBody Respuesta respuesta) {
        return respuestaService.actualizarRespuesta(respuesta);
    }

    @DeleteMapping("/{id}")
    public void eliminarRespuesta(@PathVariable Long id) {
        respuestaService.eliminarRespuesta(id);
    }

    @GetMapping
    public List<Respuesta> listarRespuestas() {
        return respuestaService.listarRespuestas();
    }
}
