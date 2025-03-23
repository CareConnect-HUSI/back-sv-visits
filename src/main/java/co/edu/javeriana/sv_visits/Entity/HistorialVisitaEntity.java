package co.edu.javeriana.sv_visits.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "historial_visita")
public class HistorialVisitaEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "idVisita", nullable = false)
    private Long idVisita;
    private String observaciones;

    public HistorialVisitaEntity() {
    }

    public HistorialVisitaEntity(Long id, Long idVisita, String observaciones) {
        this.id = id;
        this.idVisita = idVisita;
        this.observaciones = observaciones;
    }

    public Long getId() {
        return id;
    }

    public Long getIdVisita() {
        return idVisita;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setIdVisita(Long idVisita) {
        this.idVisita = idVisita;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
}
