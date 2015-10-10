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
    private int codigo;
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
     public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public CVenta() {
    }

    public CVenta(int codigo,CItinerario itinerario, CCliente cliente, String fechaVenta, boolean reserva, double Total) {
        this.codigo=codigo;
        this.itinerario = itinerario;
        this.cliente = cliente;
        this.fechaVenta = fechaVenta;
        this.reserva = reserva;
        this.Total = Total;
    }
   
}
