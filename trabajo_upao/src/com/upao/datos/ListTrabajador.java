/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.upao.datos;

import com.upao.progm.CTrabajador;
import java.util.ArrayList;

/**
 *
 * @author Victor Ramirez
 */
public class ListTrabajador {
    private final ArrayList<CTrabajador> clientes;
    public ListTrabajador(){
        this.clientes=new ArrayList<>();
        CTrabajador trabajador=new CTrabajador("CONDUCTOR",3000,1,"45125744","SALAZAR VICENTE","JOSE EDUARDO","M","18-06-1980","955629797","vicentzala@gmail.com");
        clientes.add(trabajador);
        CTrabajador trabajador1=new CTrabajador("CO-PILOTO",2500,2,"14526554","GUERRA FERIA","MANUEL ","M","09-10-1978","252548966","feria_10@gmail.com");
        clientes.add(trabajador1);
        CTrabajador trabajador2=new CTrabajador("TERRAMOZO",1500,3,"63521835","CLAVIJO FARFAN","RANDY","M","18-06-93","652548947","randy1992@gmail.com");
        clientes.add(trabajador2);
        CTrabajador trabajador3=new CTrabajador("CONDUCTOR",3000,13,"25695814","HUERTO VITE","MANUEL","M","18-06-91","652548436","huerto_pony@gmail.com");
        clientes.add(trabajador3);
        CTrabajador trabajador4=new CTrabajador("TERRAMOZO",1500,14,"06184735","SILVA MORE","LUCINDA","F","10-10-92","652548934","luci_love@gmail.com");
        clientes.add(trabajador4);
        
    
    }
    public ArrayList<CTrabajador> ObtenerTrabajadores(){
       
       return clientes;
    }
}
