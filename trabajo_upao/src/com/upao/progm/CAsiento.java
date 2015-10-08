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
public class CAsiento {
    
    int nroAsiento;
    String tipo;
    double costo;
    String grados; // 145° . 160° . 180° 
    private boolean estado; // libre: true, ocupado : false
    
    /** tipo asientos
        Asientos Vip;
        Asientos Normales;
        Asientos de Oferta;
     * @return 
     **/

    public int getNroAsiento() {
        return nroAsiento;
    }

    public void setNroAsiento(int nroAsiento) {
        this.nroAsiento = nroAsiento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipoAsiento) {
        this.tipo = tipoAsiento;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getGrados() {
        return grados;
    }

    public void setGrados(String grados) {
        this.grados = grados;
    }
    
    public boolean isEstado() {
        return estado;
    }
    
    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public CAsiento() {
    }

    public CAsiento(int nroAsiento, String tipo, double costo, String grados,boolean estado) {
        this.nroAsiento = nroAsiento;
        this.tipo = tipo;
        this.costo = costo;
        this.grados = grados;
        this.estado = estado;
    }

    
}
