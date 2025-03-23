package co.edu.javeriana.sv_visits.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.javeriana.sv_visits.Entity.HistorialVisitaEntity;

public interface HistorialVisitaRepository extends JpaRepository<HistorialVisitaEntity, Long> {
    List<HistorialVisitaEntity> findByIdVisita(Long idVisita);
}

