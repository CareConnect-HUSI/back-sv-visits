package co.edu.javeriana.sv_visits.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.javeriana.sv_visits.Entity.VisitaEntity;

public interface VisitaRepository extends JpaRepository<VisitaEntity, Long> {
    List<VisitaEntity> findByIdPaciente(Long idPaciente);
}

