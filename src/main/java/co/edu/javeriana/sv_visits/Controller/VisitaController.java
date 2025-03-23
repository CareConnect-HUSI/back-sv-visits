package co.edu.javeriana.sv_visits.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.javeriana.sv_visits.Entity.VisitaEntity;
import co.edu.javeriana.sv_visits.Service.VisitaService;

@RestController
@RequestMapping("/visitas")
public class VisitaController {

    @Autowired
    private VisitaService visitaService;

    //http://localhost:8080/visitas
    @PostMapping
    public ResponseEntity<VisitaEntity> create(@RequestBody VisitaEntity visita) {
        return ResponseEntity.ok(visitaService.save(visita));
    }

    //http://localhost:8080/visitas/paciente/1
    @GetMapping("/paciente/{idPaciente}")
    public ResponseEntity<List<VisitaEntity>> getByPaciente(@PathVariable Long idPaciente) {
        return ResponseEntity.ok(visitaService.findByPaciente(idPaciente));
    }
}
