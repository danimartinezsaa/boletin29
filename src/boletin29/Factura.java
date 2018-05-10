/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin29;

/**
 *
 * @author dani
 */
public class Factura{
    public static void crear(Barco b, int dias){
        int total=b.precio(dias);
        System.out.println("Factura\n"
                + "Precio="+total+"\n"
                + "Matrícula="+b.getMatricula()+"\n"
                + "Eslora="+b.getEslora());
    }
}
