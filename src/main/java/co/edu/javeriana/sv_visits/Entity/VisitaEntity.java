package co.edu.javeriana.sv_visits.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "visita")
public class VisitaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "actividad_paciente_visita_id", nullable = false)
    private Long actividadPacienteVisitaId;

    @NotNull
    @Column(name = "enfermera_id", nullable = false)
    private Long enfermeraId;

    @Column(name = "fecha_visita")
    private LocalDate fechaVisita;

    @Column(name = "hora_inicio_ejecutada")
    private LocalTime horaInicioEjecutada;

    @Column(name = "hora_fin_ejecutada")
    private LocalTime horaFinEjecutada;

    @Column(name = "estado")
    private String estado;

    @Column(name = "hora_inicio_calculada")
    private LocalTime horaInicioCalculada;

    @Column(name = "hora_fin_calculada")
    private LocalTime horaFinCalculada;

    // Constructor vacío
    public VisitaEntity() {
    }

    // Constructor con todos los campos
    public VisitaEntity(Long id, Long actividadPacienteVisitaId, Long enfermeraId, LocalDate fechaVisita,
                        LocalTime horaInicioEjecutada, LocalTime horaFinEjecutada, String estado,
                        LocalTime horaInicioCalculada, LocalTime horaFinCalculada) {
        this.id = id;
        this.actividadPacienteVisitaId = actividadPacienteVisitaId;
        this.enfermeraId = enfermeraId;
        this.fechaVisita = fechaVisita;
        this.horaInicioEjecutada = horaInicioEjecutada;
        this.horaFinEjecutada = horaFinEjecutada;
        this.estado = estado;
        this.horaInicioCalculada = horaInicioCalculada;
        this.horaFinCalculada = horaFinCalculada;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getActividadPacienteVisitaId() {
        return actividadPacienteVisitaId;
    }

    public void setActividadPacienteVisitaId(Long actividadPacienteVisitaId) {
        this.actividadPacienteVisitaId = actividadPacienteVisitaId;
    }

    public Long getEnfermeraId() {
        return enfermeraId;
    }

    public void setEnfermeraId(Long enfermeraId) {
        this.enfermeraId = enfermeraId;
    }

    public LocalDate getFechaVisita() {
        return fechaVisita;
    }

    public void setFechaVisita(LocalDate fechaVisita) {
        this.fechaVisita = fechaVisita;
    }

    public LocalTime getHoraInicioEjecutada() {
        return horaInicioEjecutada;
    }

    public void setHoraInicioEjecutada(LocalTime horaInicioEjecutada) {
        this.horaInicioEjecutada = horaInicioEjecutada;
    }

    public LocalTime getHoraFinEjecutada() {
        return horaFinEjecutada;
    }

    public void setHoraFinEjecutada(LocalTime horaFinEjecutada) {
        this.horaFinEjecutada = horaFinEjecutada;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public LocalTime getHoraInicioCalculada() {
        return horaInicioCalculada;
    }

    public void setHoraInicioCalculada(LocalTime horaInicioCalculada) {
        this.horaInicioCalculada = horaInicioCalculada;
    }

    public LocalTime getHoraFinCalculada() {
        return horaFinCalculada;
    }

    public void setHoraFinCalculada(LocalTime horaFinCalculada) {
        this.horaFinCalculada = horaFinCalculada;
    }
}