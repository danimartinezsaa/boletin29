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
public class Veleros extends Barco{
    int mastiles;

    public Veleros(int eslora, String matricula){
        super(eslora, matricula);
    }

    @Override
    public String toString(){
        return super.toString()+"mastiles="+mastiles;
    }

    public int getMastiles(){
        return mastiles;
    }

    public void setMastiles(int mastiles){
        this.mastiles=mastiles;
    }

    @Override
    public int precio(int dias){
        return (10*eslora*dias+mastiles);
    }

    
}
