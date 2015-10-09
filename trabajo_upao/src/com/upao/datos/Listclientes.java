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
         CCliente cliente=new CCliente(true,10,"45125744","SANTI ALMEIDA","ANDY WILMAN","M","18-06-88","955629797","santi23@gmail.com");
        clientes.add(cliente);
        CCliente cliente1=new CCliente(true,11,"14526554","RAMIREZ DOMINGUEZ","VICTOR ARNALDO","M","09-10-1992","652548966","victor_ram@hmail.com");
        clientes.add(cliente1);
        CCliente cliente2=new CCliente(true,12,"63521895","SANTI ALMEIDA","ANDY WILMAN","M","18-06-88","652548947","santi23@gmail.com");
        clientes.add(cliente2);
        CCliente cliente3=new CCliente(true,13,"36874120","NAVARRO MENDOZA","OSCAR RUPENCIO WILMAN","M","18-06-88","652548936","oscarnm@gmail.com");
        clientes.add(cliente3);
        CCliente cliente4=new CCliente(true,14,"06184762","SILVA DE SANTI","LUCINDA","M","18-06-88","652548925","luci_love@gmail.com");
        clientes.add(cliente4);
    }
    public ArrayList<CCliente> ObtenerClientes(){
 
        return clientes;
    }
    public void AgregarCliente(CCliente cliente){
        if(cliente!=null)
        clientes.add(cliente);  
    }
    public CCliente BuscarClienteByDni(String dni){
        CCliente cli=new CCliente();
        for(int i=0;i<clientes.size();i++){
            if(clientes.get(i).getDni().equals(dni)){
                cli = clientes.get(i);
                break;
            }                
        }
        return cli;
    }
}
