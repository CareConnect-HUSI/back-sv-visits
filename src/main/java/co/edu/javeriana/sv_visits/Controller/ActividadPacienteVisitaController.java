package co.edu.javeriana.sv_visits.Controller;

import co.edu.javeriana.sv_visits.Entity.ActividadPacienteVisitaEntity;
import co.edu.javeriana.sv_visits.Service.ActividadPacienteVisitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/actividad-paciente-visita")
public class ActividadPacienteVisitaController {

    @Autowired
    private ActividadPacienteVisitaService service;

    @GetMapping("/{id}")
    public ResponseEntity<ActividadPacienteVisitaEntity> getActividadPacienteVisitaById(@PathVariable Long id) {
        Optional<ActividadPacienteVisitaEntity> actividad = service.getActividadPacienteVisitaById(id);
        return actividad.map(ResponseEntity::ok)
                       .orElseGet(() -> ResponseEntity.notFound().build());
    }
}