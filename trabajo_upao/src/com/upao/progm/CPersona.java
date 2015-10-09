/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.upao.progm;

/**
 *
 * @author Victor Ramirez
 */
public class CPersona {
    
    int codigo;
    String dni;
    String apellidos;
    String nombres;
    String sexo;
    String fechaNac;
    String telefono;
    String email;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public CPersona() {
    }

    public CPersona(int codigo, String dni, String apellidos, String nombres, String sexo, String fechaNac, String telefono, String email) {
        this.codigo = codigo;
        this.dni = dni;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.sexo = sexo;
        this.fechaNac = fechaNac;
        this.telefono = telefono;
        this.email = email;
    }
    
}
