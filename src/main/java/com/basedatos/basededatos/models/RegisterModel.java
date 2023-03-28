package com.basedatos.basededatos.models;

import jakarta.persistence.*;

@Entity
@Table(schema = "register")
public class RegisterModel {
    @Id
    @Column(name = "id",updatable = false, nullable = false,  unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "usuario")
    private String usuario;

    @Column(name = "email")
    private String email;

    @Column(name = "contraseña")
    private String contraseña;

    @Column(name = "confirmar_contraseña")
    private String confirmar_Contraseña;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getConfirmar_Contraseña() {
        return confirmar_Contraseña;
    }

    public void setConfirmar_Contraseña(String confirmar_Contraseña) {
        this.confirmar_Contraseña = confirmar_Contraseña;
    }
}
