package com.basedatos.basededatos.models;

import jakarta.persistence.*;

@Entity
@Table(schema = "profesor")
public class ProfesorModel {
    @Id
    @Column(name = "id",updatable = false, nullable = false,  unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "nombreP")
    private String nombreP;

    @Column(name = "apellidoP")
    private String apellidoP;

    @Column(name = "gmailP")
    private String gmailP;

    @Column(name = "telefonoP")
    private String telefonoP;

    @Column(name = "contraseñaP")
    private String contraseñaP;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public String getGmailP() {
        return gmailP;
    }

    public void setGmailP(String gmailP) {
        this.gmailP = gmailP;
    }

    public String getTelefonoP() {
        return telefonoP;
    }

    public void setTelefonoP(String telefonoP) {
        this.telefonoP = telefonoP;
    }

    public String getContraseñaP() {
        return contraseñaP;
    }

    public void setContraseñaP(String contraseñaP) {
        this.contraseñaP = contraseñaP;
    }
}
