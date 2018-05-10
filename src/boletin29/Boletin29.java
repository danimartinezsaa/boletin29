/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin29;

import java.util.ArrayList;

/**
 *
 * @author dani
 */
public class Boletin29{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        Barco barco1=new Yate(100,2,20,"asb1234");
        Barco barco2=new Deportivas(200,15,"ert5435");
        Barco barco3=new Veleros(30,"ehh6700");
        Barco barco4=new Yate(120,4,30,"acb4434");
        Barco barco5=new Veleros(40,"dwq341");
        
        ArrayList<Barco> barcos=new ArrayList();
        barcos.add(barco5);
        
        Factura.crear(barco3, 2);
    }
    
}
