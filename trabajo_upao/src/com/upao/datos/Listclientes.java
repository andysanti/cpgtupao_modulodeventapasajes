/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.upao.datos;

import com.upao.progm.CCliente;
import java.util.ArrayList;

/**
 *
 * @author Victor Ramirez
 */
public class Listclientes {
    private ArrayList<CCliente> clientes;
    public Listclientes(){
        this.clientes=new ArrayList<>();
         CCliente cliente=new CCliente(true,10,"45125744","SANTI ALMEIDA","ANDY WILMAN","M","18-06-88","955629797");
        clientes.add(cliente);
        CCliente cliente1=new CCliente(true,11,"14526554","RAMIREZ DOMINGUEZ","VICTOR ARNALDO","M","09-10-1992","652548966");
        clientes.add(cliente1);
        CCliente cliente2=new CCliente(true,12,"63521895","SANTI ALMEIDA","ANDY WILMAN","M","18-06-88","652548947");
        clientes.add(cliente2);
        CCliente cliente3=new CCliente(true,13,"36874120","SANTI ALMEIDA","ANDY WILMAN","M","18-06-88","652548936");
        clientes.add(cliente3);
        CCliente cliente4=new CCliente(true,14,"06184762","SANTI ALMEIDA","ANDY WILMAN","M","18-06-88","652548925");
        clientes.add(cliente4);
    }
    public ArrayList<CCliente> ObtenerClientes(){
       
       
        return clientes;
    }
    public void AgregarCliente(CCliente cliente){
        if(cliente!=null)
        clientes.add(cliente);
       
    }
}
