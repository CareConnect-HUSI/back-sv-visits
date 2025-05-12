package co.edu.javeriana.sv_visits.Repository;

import java.time.LocalDate;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.javeriana.sv_visits.Entity.VisitaEntity;

public interface VisitaRepository extends JpaRepository<VisitaEntity, Long> {
    // List<VisitaEntity> findByIdPaciente(Long paciente_id);
    Page<VisitaEntity> findByFechaVisita(LocalDate fechaVisita, Pageable pageable);
}

