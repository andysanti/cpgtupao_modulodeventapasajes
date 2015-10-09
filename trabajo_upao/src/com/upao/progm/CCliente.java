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
public class CCliente extends CPersona{
    
    boolean menor; // Persona menor de 18 años

    public boolean isMenor() {
        return menor;
    }

    public void setMenor(boolean menor) {
        this.menor = menor;
    }

    public CCliente() {
    }

    public CCliente(boolean menor, int codigo, String dni, String apellidos, String nombres, String sexo, String fechaNac, String telefono, String email) {
        super(codigo, dni, apellidos, nombres, sexo, fechaNac, telefono, email);
        this.menor = menor;
    }

    
}
