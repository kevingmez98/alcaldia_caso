/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Usuario
 */
@Entity
@Table(name = "roles")
public class Secretaria implements Serializable{
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_rol")
    private Integer idSecretaria;
     
     @Column(name="nombre_secretaria")
    private String nombreSecretaria;
     
     @Column(name="nombre_secretario")
    private String nombreSecretario;
     
     @Column(name="direccion")
    private String direccion;
     
     @Column(name="telefono")
    private String telefono;
     
     @Column(name="codigo_secretaria")
    private Integer codigoSecretaria;
     
     @Column(name="contrasenia")
    private String contrasenia;

    public Integer getIdSecretaria() {
        return idSecretaria;
    }

    public void setIdSecretaria(Integer idSecretaria) {
        this.idSecretaria = idSecretaria;
    }

    public String getNombreSecretaria() {
        return nombreSecretaria;
    }

    public void setNombreSecretaria(String nombreSecretaria) {
        this.nombreSecretaria = nombreSecretaria;
    }

    public String getNombreSecretario() {
        return nombreSecretario;
    }

    public void setNombreSecretario(String nombreSecretario) {
        this.nombreSecretario = nombreSecretario;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Integer getCodigoSecretaria() {
        return codigoSecretaria;
    }

    public void setCodigoSecretaria(Integer codigoSecretaria) {
        this.codigoSecretaria = codigoSecretaria;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
     
     
    
}
