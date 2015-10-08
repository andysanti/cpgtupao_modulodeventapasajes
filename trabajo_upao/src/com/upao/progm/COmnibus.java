/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.upao.progm;

import java.util.ArrayList;

/**
 *
 * @author Victor Ramirez
 */
public class COmnibus {
    int codigo; 
    String placa;
    String flota; // Bus Suite . Bus presidencial . Bus cama presidencial

    int cantPisos;
    int cantAsientos; //Cantidad de asientos del bus
    
    ArrayList<CAsiento> vip;
    ArrayList<CAsiento> normal;
    ArrayList<CAsiento> oferta;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getFlota() {
        return flota;
    }

    public void setFlota(String flota) {
        this.flota = flota;
    }

    public int getCantPisos() {
        return cantPisos;
    }

    public void setCantPisos(int cantPisos) {
        this.cantPisos = cantPisos;
    }

    public int getCantAsientos() {
        return cantAsientos;
    }

    public void setCantAsientos(int cantAsientos) {
        this.cantAsientos = cantAsientos;
    }

    public ArrayList<CAsiento> getVip() {
        return vip;
    }

    public void setVip(ArrayList<CAsiento> vip) {
        this.vip = vip;
    }

    public ArrayList<CAsiento> getNormal() {
        return normal;
    }

    public void setNormal(ArrayList<CAsiento> normal) {
        this.normal = normal;
    }

    public ArrayList<CAsiento> getOferta() {
        return oferta;
    }

    public void setOferta(ArrayList<CAsiento> oferta) {
        this.oferta = oferta;
    }

    public COmnibus() {
    }

    public COmnibus(int codigo, String placa, String flota, int cantPisos, int cantAsientos, ArrayList<CAsiento> vip, ArrayList<CAsiento> normal, ArrayList<CAsiento> oferta) {
        this.codigo = codigo;
        this.placa = placa;
        this.flota = flota;
        this.cantPisos = cantPisos;
        this.cantAsientos = cantAsientos;
        this.vip = vip;
        this.normal = normal;
        this.oferta = oferta;
    }
    
    
}