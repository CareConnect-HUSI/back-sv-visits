package co.edu.javeriana.sv_visits.Service;

import co.edu.javeriana.sv_visits.Entity.ActividadPacienteVisitaEntity;
import co.edu.javeriana.sv_visits.Repository.ActividadPacienteVisitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ActividadPacienteVisitaService {

    @Autowired
    private ActividadPacienteVisitaRepository repository;

    public Optional<ActividadPacienteVisitaEntity> getActividadPacienteVisitaById(Long id) {
        return repository.findById(id);
    }
}