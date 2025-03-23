package co.edu.javeriana.sv_visits.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "visita")
public class VisitaEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "idPaciente", nullable = false)
    private Long idPaciente;
    @Column(name = "idEnfermera", nullable = false)
    private Long idEnfermera;
    private String fechaVisita;
    private String horaInicio;
    private String horaFin;
    private String estado;
    private String orden;

    public VisitaEntity() {
    }

    public VisitaEntity(Long id, Long idPaciente, Long idEnfermera, String fechaVisita, String horaInicio, String horaFin, String estado, String orden) {
        this.id = id;
        this.idPaciente = idPaciente;
        this.idEnfermera = idEnfermera;
        this.fechaVisita = fechaVisita;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.estado = estado;
        this.orden = orden;
    }

    public Long getId() {
        return id;
    }

    public Long getIdPaciente() {
        return idPaciente;
    }

    public Long getIdEnfermera() {
        return idEnfermera;
    }

    public String getFechaVisita() {
        return fechaVisita;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public String getHoraFin() {
        return horaFin;
    }

    public String getEstado() {
        return estado;
    }

    public String getOrden() {
        return orden;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setIdPaciente(Long idPaciente) {
        this.idPaciente = idPaciente;
    }

    public void setIdEnfermera(Long idEnfermera) {
        this.idEnfermera = idEnfermera;
    }

    public void setFechaVisita(String fechaVisita) {
        this.fechaVisita = fechaVisita;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setOrden(String orden) {
        this.orden = orden;
    }
}
