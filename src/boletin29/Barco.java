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
public abstract class Barco{
    int eslora;
    String matricula;

    public Barco(int eslora, String matricula){
        this.eslora=eslora;
        this.matricula=matricula;
    }

    public Barco(){
    }

    public int getEslora(){
        return eslora;
    }

    public void setEslora(int eslora){
        this.eslora=eslora;
    }

    public String getMatricula(){
        return matricula;
    }

    public void setMatricula(String matricula){
        this.matricula=matricula;
    }

    @Override
    public String toString(){
        return "eslora="+eslora+", matricula="+matricula;
    }
    
    public abstract int precio(int dias);
}
