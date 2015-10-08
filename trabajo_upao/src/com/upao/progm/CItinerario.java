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
public class CItinerario {
    int codigo;
    String origen;
    String destino;
    String fechaIda;
    String fechaVuelta;
    String horaSalida;
    String horaLlegada;
    double duracion;
    CServicio tipoServicio;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getFechaIda() {
        return fechaIda;
    }

    public void setFechaIda(String fechaIda) {
        this.fechaIda = fechaIda;
    }

    public String getFechaVuelta() {
        return fechaVuelta;
    }

    public void setFechaVuelta(String fechaVuelta) {
        this.fechaVuelta = fechaVuelta;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    public String getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(String horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public CServicio getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(CServicio tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    public CItinerario() {
    }

    public CItinerario(int codigo, String origen, String destino, String fechaIda, String fechaVuelta, String horaSalida, String horaLlegada, double duracion, CServicio tipoServicio) {
        this.codigo = codigo;
        this.origen = origen;
        this.destino = destino;
        this.fechaIda = fechaIda;
        this.fechaVuelta = fechaVuelta;
        this.horaSalida = horaSalida;
        this.horaLlegada = horaLlegada;
        this.duracion = duracion;
        this.tipoServicio = tipoServicio;
    }
    
    
}
