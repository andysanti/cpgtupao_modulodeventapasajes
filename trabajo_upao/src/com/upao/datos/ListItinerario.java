/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.upao.datos;

import com.upao.progm.CItinerario;
import java.util.ArrayList;

/**
 *
 * @author AndySanti
 */
public class ListItinerario {
    private final ArrayList<CItinerario> listaItinerario;
    public ListItinerario() {
        this.listaItinerario=new ArrayList<>();
        ListServicio servicios=new ListServicio();
        

        CItinerario itinerario=new CItinerario(1,"PIURA","LIMA","09-10-2015","10-10-2015","18:30","10:00",14,servicios.ObtenerServicios().get(0));
        listaItinerario.add(itinerario);
        CItinerario itinerario2=new CItinerario(2,"LIMA","PIURA","10-10-2015","11-10-2015","20:30","12:00",14,servicios.ObtenerServicios().get(1));
        listaItinerario.add(itinerario2);
        CItinerario itinerario3=new CItinerario(3,"PIURA","LIMA","09-10-2015","10-10-2015","19:30","11:00",14,servicios.ObtenerServicios().get(2));
        listaItinerario.add(itinerario3);
         
    }
    public ArrayList<CItinerario> ObtenerItinerarios(){
       
        
        return listaItinerario;
    }
    public void AgregarItinerario(CItinerario om){
        if(om!=null)
        listaItinerario.add(om);  
    }
    public CItinerario BuscarItinerarioByCodigo(int id){
        CItinerario cli=new CItinerario();
        for(int i=0;i<listaItinerario.size();i++){
            if(listaItinerario.get(i).getCodigo()==id){
                cli = listaItinerario.get(i);
                break;
            }                
        }
        return cli;
    }
     public boolean modificarItinerario(int indice, CItinerario cu) {
        if(cu!=null) {
            listaItinerario.set(indice, cu);//Modifica en la Coleccion
            return true;
        }
        else
            return false;
    }
     //Elimina el obj de la Coleccion mediante su indice
    public void eliminarItinerario(int indice) {
         listaItinerario.remove(indice);//Elimina x indice
    }
}
