/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.upao.datos;

import com.upao.progm.CServicio;
import java.util.ArrayList;

/**
 *
 * @author AndySanti
 */
public class ListServicio {
    private final ArrayList<CServicio> listaservicios;
    public ListServicio(){
        this.listaservicios=new ArrayList<>();
        ListOmnibus omnibus=new ListOmnibus();
        CServicio servicio=new CServicio(10,omnibus.ObtenerOmnibuses().get(0),150);
        listaservicios.add(servicio);
        CServicio servicio1=new CServicio(15,omnibus.ObtenerOmnibuses().get(1),150);
        listaservicios.add(servicio1);
        CServicio servicio2=new CServicio(20,omnibus.ObtenerOmnibuses().get(2),150);
        listaservicios.add(servicio2);
    }
     public ArrayList<CServicio> ObtenerServicios(){
        
        return listaservicios;
    }
}
