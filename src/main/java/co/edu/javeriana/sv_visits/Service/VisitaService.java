package co.edu.javeriana.sv_visits.Service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
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

    public Page<VisitaEntity> getAllVisits(int page, int size, LocalDate fechaVisita) {
        PageRequest pageable = PageRequest.of(page, size);
        if (fechaVisita != null) {
            return visitaRepository.findByFechaVisita(fechaVisita, pageable);
        }
        return visitaRepository.findAll(pageable);
    }

    // public List<VisitaEntity> findByPaciente(Long idPaciente) {
    //     return visitaRepository.findByIdPaciente(idPaciente);
    // }
    public VisitaEntity findById(Long id) {
        return visitaRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Visita no encontrada con ID: " + id));
    }

    public List<VisitaEntity> findByEnfermeraId(Long enfermeraId) {
        return visitaRepository.findByEnfermeraId(enfermeraId);
    }
}
