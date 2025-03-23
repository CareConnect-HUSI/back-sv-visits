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

import co.edu.javeriana.sv_visits.Entity.HistorialVisitaEntity;
import co.edu.javeriana.sv_visits.Service.HistorialVisitaService;

@RestController
@RequestMapping("/historial-visitas")
public class HistorialVisitaController {

    @Autowired
    private HistorialVisitaService historialService;

    //http://localhost:8080/historial-visitas
    @PostMapping
    public ResponseEntity<HistorialVisitaEntity> create(@RequestBody HistorialVisitaEntity historial) {
        return ResponseEntity.ok(historialService.save(historial));
    }

    //http://localhost:8080/historial-visitas/visita/1
    @GetMapping("/visita/{idVisita}")
    public ResponseEntity<List<HistorialVisitaEntity>> getByVisita(@PathVariable Long idVisita) {
        return ResponseEntity.ok(historialService.findByVisita(idVisita));
    }
}

