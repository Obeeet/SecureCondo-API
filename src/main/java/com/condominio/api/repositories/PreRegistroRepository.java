package com.condominio.api.repositories;

import com.condominio.api.entities.PreRegistroVisita;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PreRegistroRepository extends JpaRepository<PreRegistroVisita, Long> {
    PreRegistroVisita findByCodigoAcceso(String codigoAcceso);
}
