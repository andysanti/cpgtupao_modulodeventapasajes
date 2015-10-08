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
public class CVenta {
    
    CItinerario itinerario;
    CCliente cliente;
    String fechaVenta;
    boolean reserva;
    double Total;

    public CItinerario getItinerario() {
        return itinerario;
    }

    public void setItinerario(CItinerario itinerario) {
        this.itinerario = itinerario;
    }

    public CCliente getCliente() {
        return cliente;
    }

    public void setCliente(CCliente cliente) {
        this.cliente = cliente;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public boolean isReserva() {
        return reserva;
    }

    public void setReserva(boolean reserva) {
        this.reserva = reserva;
    }

    public double getTotal() {
        return Total;
    }

    public void setTotal(double Total) {
        this.Total = Total;
    }

    public CVenta() {
    }

    public CVenta(CItinerario itinerario, CCliente cliente, String fechaVenta, boolean reserva, double Total) {
        this.itinerario = itinerario;
        this.cliente = cliente;
        this.fechaVenta = fechaVenta;
        this.reserva = reserva;
        this.Total = Total;
    }
    
    
    
}
