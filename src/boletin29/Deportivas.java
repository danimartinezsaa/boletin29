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
public class Deportivas extends Barco{
    int potencia;

    public Deportivas(int potencia, int eslora, String matricula){
        super(eslora, matricula);
        this.potencia=potencia;
    }

    @Override
    public String toString(){
        return super.toString()+"potencia="+potencia;
    }

    public int getPotencia(){
        return potencia;
    }

    public void setPotencia(int potencia){
        this.potencia=potencia;
    }

    @Override
    public int precio(int dias){
        return (10*eslora*dias+potencia);
    }
}
