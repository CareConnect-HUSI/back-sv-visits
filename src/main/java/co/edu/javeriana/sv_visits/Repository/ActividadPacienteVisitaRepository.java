package co.edu.javeriana.sv_visits.Repository;

import co.edu.javeriana.sv_visits.Entity.ActividadPacienteVisitaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActividadPacienteVisitaRepository extends JpaRepository<ActividadPacienteVisitaEntity, Long> {
}