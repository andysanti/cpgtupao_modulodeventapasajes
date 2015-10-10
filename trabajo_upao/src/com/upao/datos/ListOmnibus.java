/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.upao.datos;

import com.upao.progm.COmnibus;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Victor Ramirez
 */
public class ListOmnibus{
    private final ArrayList<COmnibus> listaomnibus;

    public ListOmnibus() {
        this.listaomnibus=new ArrayList<>();
        LIstAsientos asientos =new LIstAsientos();
        asientos.ObtenerAsientos();
 
         COmnibus bus = new COmnibus(1,"NB-8012","Bus Suite",1,50,asientos.ObtenerAsientos());
         listaomnibus.add(bus);
         COmnibus bus1 = new COmnibus(2,"DG-2536","Bus Presidencial",2,50,asientos.ObtenerAsientos());
         listaomnibus.add(bus1);
         COmnibus bus2 = new COmnibus(3,"JU-3215","Bus Suite",2,50,asientos.ObtenerAsientos());
         listaomnibus.add(bus2);
         COmnibus bus3 = new COmnibus(4,"CR-3654","Bus Cama Presidencial",2,50,asientos.ObtenerAsientos());
         listaomnibus.add(bus3);
         
  
    }
    public List<COmnibus> ObtenerOmnibuses(){
       
        return listaomnibus;
    }
    public void AgregarCliente(COmnibus om){
        if(om!=null)
        listaomnibus.add(om);  
    }
    public COmnibus BuscarOmnibusByPlaca(String placa){
        COmnibus cli=new COmnibus();
        for(int i=0;i<listaomnibus.size();i++){
            if(listaomnibus.get(i).getPlaca().equals(placa)){
                cli = listaomnibus.get(i);
                break;
            }                
        }
        return cli;
    }
     public boolean modificarOmnibus(int indice, COmnibus cu) {
        if(cu!=null) {
            listaomnibus.set(indice, cu);//Modifica en la Coleccion
            return true;
        }
        else
            return false;
    }
     //Elimina el obj de la Coleccion mediante su indice
    public void eliminarOmnibus(int indice) {
         listaomnibus.remove(indice);//Elimina x indice
    }
}
