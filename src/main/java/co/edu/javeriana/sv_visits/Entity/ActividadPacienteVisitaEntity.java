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
@Table(name = "actividad_paciente_visita")
public class ActividadPacienteVisitaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "paciente_id", nullable = false)
    private Long pacienteId;

    @NotNull
    @Column(name = "actividad_id", nullable = false)
    private Long actividadId;

    @Column(name = "dosis")
    private Integer dosis;

    @Column(name = "frecuencia")
    private Integer frecuencia;

    @Column(name = "dias_tratamiento")
    private Integer diasTratamiento;

    @Column(name = "fecha_inicio")
    private LocalDate fechaInicio;

    @Column(name = "fecha_fin")
    private LocalDate fechaFin;

    @Column(name = "hora")
    private LocalTime hora;

    @Column(name = "duracion_visita")
    private Integer duracionVisita;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPacienteId() {
        return pacienteId;
    }

    public void setPacienteId(Long pacienteId) {
        this.pacienteId = pacienteId;
    }

    public Long getActividadId() {
        return actividadId;
    }

    public void setActividadId(Long actividadId) {
        this.actividadId = actividadId;
    }

    public Integer getDosis() {
        return dosis;
    }

    public void setDosis(Integer dosis) {
        this.dosis = dosis;
    }

    public Integer getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(Integer frecuencia) {
        this.frecuencia = frecuencia;
    }

    public Integer getDiasTratamiento() {
        return diasTratamiento;
    }

    public void setDiasTratamiento(Integer diasTratamiento) {
        this.diasTratamiento = diasTratamiento;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public Integer getDuracionVisita() {
        return duracionVisita;
    }

    public void setDuracionVisita(Integer duracionVisita) {
        this.duracionVisita = duracionVisita;
    }
}