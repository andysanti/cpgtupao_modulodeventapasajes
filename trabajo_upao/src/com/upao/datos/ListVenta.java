/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.upao.datos;

import com.upao.progm.CCliente;
import com.upao.progm.CItinerario;
import com.upao.progm.CVenta;
import java.util.ArrayList;

/**
 *
 * @author AndySanti
 */
public class ListVenta {
    private final ArrayList<CVenta> ventas;
    public ListVenta(){
        this.ventas = new ArrayList<>();
        ListItinerario itinerarios=new ListItinerario();
        Listclientes clientes=new Listclientes();
        CVenta venta=new CVenta(1,itinerarios.ObtenerItinerarios().get(0),clientes.ObtenerClientes().get(0),"10-10-2015",true,150);
        ventas.add(venta);
         CVenta venta1=new CVenta(2,itinerarios.ObtenerItinerarios().get(1),clientes.ObtenerClientes().get(1),"10-10-2015",true,150);
         ventas.add(venta1);
         CVenta venta2=new CVenta(3,itinerarios.ObtenerItinerarios().get(2),clientes.ObtenerClientes().get(2),"10-10-2015",true,150);
         ventas.add(venta2);
    }
     public ArrayList<CVenta> ObtenerVentass(){
         
        return ventas;
    }
    public void AgregarVenta(CVenta om){
        if(om!=null)
        ventas.add(om);  
    }
    public CVenta BuscarVentaByCodigo(int id){
        CVenta cli=new CVenta();
        for(int i=0;i<ventas.size();i++){
            if(ventas.get(i).getCodigo()==id){
                cli = ventas.get(i);
                break;
            }                
        }
        return cli;
    }
     public boolean modificarVenta(int indice, CVenta cu) {
        if(cu!=null) {
            ventas.set(indice, cu);//Modifica en la Coleccion
            return true;
        }
        else
            return false;
    }
     //Elimina el obj de la Coleccion mediante su indice
    public void eliminarItinerario(int indice) {
         ventas.remove(indice);//Elimina x indice
    }
}
