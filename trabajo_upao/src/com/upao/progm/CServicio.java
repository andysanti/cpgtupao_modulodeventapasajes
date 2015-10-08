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
public class CServicio {
    int codigo;
    COmnibus flota;
    double precio;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public COmnibus getFlota() {
        return flota;
    }

    public void setFlota(COmnibus flota) {
        this.flota = flota;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public CServicio() {
    }

    public CServicio(int codigo, COmnibus flota, double precio) {
        this.codigo = codigo;
        this.flota = flota;
        this.precio = precio;
    }
    
    
}
