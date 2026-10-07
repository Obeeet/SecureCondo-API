package com.condominio.api.entities;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "pre_registros")
public class PreRegistroVisita {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombreVisitante;
    private String departamentoDestino;
    private LocalDateTime fechaEsperada;
    private String codigoAcceso;
    private String estado;
}