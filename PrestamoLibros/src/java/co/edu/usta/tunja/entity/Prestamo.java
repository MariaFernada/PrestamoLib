/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usta.tunja.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Maria Fernanda
 */
@Entity
@Table(name = "prestamo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Prestamo.findAll", query = "SELECT p FROM Prestamo p"),
    @NamedQuery(name = "Prestamo.findByIdPrestamo", query = "SELECT p FROM Prestamo p WHERE p.idPrestamo = :idPrestamo"),
    @NamedQuery(name = "Prestamo.findByFechaInicial", query = "SELECT p FROM Prestamo p WHERE p.fechaInicial = :fechaInicial"),
    @NamedQuery(name = "Prestamo.findByFechaVencimiento", query = "SELECT p FROM Prestamo p WHERE p.fechaVencimiento = :fechaVencimiento")})
public class Prestamo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_prestamo")
    private Integer idPrestamo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_inicial")
    @Temporal(TemporalType.DATE)
    private Date fechaInicial;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_vencimiento")
    @Temporal(TemporalType.DATE)
    private Date fechaVencimiento;
    @JoinColumn(name = "id_estado_prestamo", referencedColumnName = "id_estado")
    @ManyToOne(optional = false)
    private Libro idLibroPrestamo;
    @JoinColumn(name = "codigo_persona_prestamo", referencedColumnName = "codigo")
    @ManyToOne(optional = false)
    private Persona codigoPersonaPrestamo;

    public Prestamo() {
    }

    public Prestamo(Integer idPrestamo) {
        this.idPrestamo = idPrestamo;
    }

    public Prestamo(Integer idPrestamo, Date fechaInicial, Date fechaVencimiento) {
        this.idPrestamo = idPrestamo;
        this.fechaInicial = fechaInicial;
        this.fechaVencimiento = fechaVencimiento;
    }

    public Integer getIdPrestamo() {
        return idPrestamo;
    }

    public void setIdPrestamo(Integer idPrestamo) {
        this.idPrestamo = idPrestamo;
    }

    public Date getFechaInicial() {
        return fechaInicial;
    }

    public void setFechaInicial(Date fechaInicial) {
        this.fechaInicial = fechaInicial;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public Libro getIdLibroPrestamo() {
        return idLibroPrestamo;
    }

    public void setIdLibroPrestamo(Libro idLibroPrestamo) {
        this.idLibroPrestamo = idLibroPrestamo;
    }

    public Persona getCodigoPersonaPrestamo() {
        return codigoPersonaPrestamo;
    }

    public void setCodigoPersonaPrestamo(Persona codigoPersonaPrestamo) {
        this.codigoPersonaPrestamo = codigoPersonaPrestamo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPrestamo != null ? idPrestamo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Prestamo)) {
            return false;
        }
        Prestamo other = (Prestamo) object;
        if ((this.idPrestamo == null && other.idPrestamo != null) || (this.idPrestamo != null && !this.idPrestamo.equals(other.idPrestamo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.usta.tunja.edu.entity.Prestamo[ idPrestamo=" + idPrestamo + " ]";
    }
    
}
