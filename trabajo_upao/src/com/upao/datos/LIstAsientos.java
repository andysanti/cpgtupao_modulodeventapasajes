/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.upao.datos;
import com.upao.progm.CAsiento;
import java.util.ArrayList;
/**
 *
 * @author Victor Ramirez
 */
public class LIstAsientos {
    private final ArrayList<CAsiento> listaasientos;

    public LIstAsientos() {
        this.listaasientos=new ArrayList<>();
          for(int i=0;i<10;i++){
             
              CAsiento asiento = new CAsiento(i+1,"VIP",150,"180 GRADOS",true);
              listaasientos.add(asiento);
         }
        for(int i=10;i<50;i++){
            
             
              CAsiento asiento = new CAsiento(i+1,"NORMAL",120,"160 GRADOS",true);
              listaasientos.add(asiento);
         }
    }
    public ArrayList<CAsiento> ObtenerAsientos(){
       
        
        return listaasientos;
    }
  
}


