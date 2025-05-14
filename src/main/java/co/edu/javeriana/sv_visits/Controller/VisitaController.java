package co.edu.javeriana.sv_visits.Controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import co.edu.javeriana.sv_visits.Entity.VisitaEntity;
import co.edu.javeriana.sv_visits.Service.VisitaService;

@RestController
@RequestMapping("/visitas")
public class VisitaController {

    @Autowired
    private VisitaService visitaService;

    //http://localhost:8082/visitas
    @PostMapping
    public ResponseEntity<VisitaEntity> create(@RequestBody VisitaEntity visita) {
        return ResponseEntity.ok(visitaService.save(visita));
    }

    //http://localhost:8082/visitas?page=${page}&size=${size}&${currentDate}`
    @GetMapping
    public ResponseEntity<Page<VisitaEntity>> getAllVisits(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "100") int size,
            @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate fechaVisita) {
        Page<VisitaEntity> visits = visitaService.getAllVisits(page, size, fechaVisita);
        return ResponseEntity.ok(visits);
    }

    //http://localhost:8082/visitas/paciente/1
    // @GetMapping("/paciente/{idPaciente}")
    // public ResponseEntity<List<VisitaEntity>> getByPaciente(@PathVariable Long idPaciente) {
    //     return ResponseEntity.ok(visitaService.findByPaciente(idPaciente));
    // }

    // PUT /visitas/{id}
    @PutMapping("/{id}")
    public ResponseEntity<VisitaEntity> updateVisit(
        @PathVariable Long id,
        @RequestBody VisitaEntity updatedVisit
    ) {
        VisitaEntity existing = visitaService.findById(id);
        if (existing == null) {
            return ResponseEntity.notFound().build();
        }

        existing.setEnfermeraId(updatedVisit.getEnfermeraId());
        existing.setHoraInicioCalculada(updatedVisit.getHoraInicioCalculada());
        existing.setHoraFinCalculada(updatedVisit.getHoraFinCalculada());

        return ResponseEntity.ok(visitaService.save(existing));
    }

}
