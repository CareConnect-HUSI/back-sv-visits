package co.edu.javeriana.sv_visits.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.javeriana.sv_visits.Entity.HistorialVisitaEntity;
import co.edu.javeriana.sv_visits.Repository.HistorialVisitaRepository;

@Service
public class HistorialVisitaService {

    @Autowired
    private HistorialVisitaRepository historialRepository;

    public HistorialVisitaEntity save(HistorialVisitaEntity historial) {
        return historialRepository.save(historial);
    }

    public List<HistorialVisitaEntity> findByVisita(Long idVisita) {
        return historialRepository.findByIdVisita(idVisita);
    }
}
