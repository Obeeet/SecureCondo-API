package com.condominio.api.services;

import com.condominio.api.dtos.CrearVisitaDTO;
import com.condominio.api.entities.PreRegistroVisita;
import com.condominio.api.repositories.PreRegistroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.UUID;

@Service
public class VisitaService {

    @Autowired
    private PreRegistroRepository repository;

    public PreRegistroVisita registrarVisita(CrearVisitaDTO dto) {
        PreRegistroVisita visita = new PreRegistroVisita();
        visita.setNombreVisitante(dto.getNombreVisitante());
        visita.setDepartamentoDestino(dto.getDepartamentoDestino());
        visita.setFechaEsperada(dto.getFechaEsperada());

        visita.setCodigoAcceso(UUID.randomUUID().toString().substring(0, 6).toUpperCase());
        visita.setEstado("PENDIENTE");

        return repository.save(visita);
    }
}
