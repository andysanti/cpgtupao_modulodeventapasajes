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
public class CTrabajador extends CPersona{
    
    String tipo; //Conductor Copiloto Terramoz@
    double sueldo;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public CTrabajador() {
    }

    public CTrabajador(String tipo, double sueldo, int codigo, String dni, String apellidos, String nombres, String sexo, String fechaNac, String telefono, String email) {
        super(codigo, dni, apellidos, nombres, sexo, fechaNac, telefono, email);
        this.tipo = tipo;
        this.sueldo = sueldo;
    }
    
}
