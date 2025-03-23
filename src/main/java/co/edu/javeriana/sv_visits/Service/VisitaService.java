package co.edu.javeriana.sv_visits.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.javeriana.sv_visits.Entity.VisitaEntity;
import co.edu.javeriana.sv_visits.Repository.VisitaRepository;

@Service
public class VisitaService {

    @Autowired
    private VisitaRepository visitaRepository;

    public VisitaEntity save(VisitaEntity visita) {
        return visitaRepository.save(visita);
    }

    public List<VisitaEntity> findByPaciente(Long idPaciente) {
        return visitaRepository.findByIdPaciente(idPaciente);
    }
}
