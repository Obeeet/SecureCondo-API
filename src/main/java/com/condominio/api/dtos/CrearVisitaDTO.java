package com.condominio.api.dtos;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class CrearVisitaDTO {
    private String nombreVisitante;
    private String departamentoDestino;
    private LocalDateTime fechaEsperada;
}
