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
public class Yate extends Barco{
    int potencia, camarotes;

    public Yate(int potencia, int camarotes, int eslora, String matricula){
        super(eslora, matricula);
        this.potencia=potencia;
        this.camarotes=camarotes;
    }

    public int getPotencia(){
        return potencia;
    }

    public void setPotencia(int potencia){
        this.potencia=potencia;
    }

    public int getCamarotes(){
        return camarotes;
    }

    public void setCamarotes(int camarotes){
        this.camarotes=camarotes;
    }

    @Override
    public String toString(){
        return super.toString()+"potencia="+potencia+", camarotes="+camarotes+'}';
    }

    @Override
    public int precio(int dias){
        return dias*(10*eslora)+(potencia+camarotes);
    }

    
    
}
