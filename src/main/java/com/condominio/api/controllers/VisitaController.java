package com.condominio.api.controllers;

import com.condominio.api.dtos.CrearVisitaDTO;
import com.condominio.api.entities.PreRegistroVisita;
import com.condominio.api.services.VisitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/visitas")
public class VisitaController {

    @Autowired
    private VisitaService visitaService;

    @PostMapping("/pre-registro")
    public ResponseEntity<PreRegistroVisita> crearPreRegistro(@RequestBody CrearVisitaDTO dto) {
        PreRegistroVisita nuevaVisita = visitaService.registrarVisita(dto);
        return ResponseEntity.ok(nuevaVisita);
    }
}
