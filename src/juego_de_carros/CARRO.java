/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego_de_carros;

/**
 *
 * @author sofia chamorro
 */
public class CARRO {
    public CARRO(JUGADORES jgd, int km){
        fin=km;
    }
    private boolean Runin=true;
    private int dist;
    private final int fin;
    private static boolean ganar=false;
    
    public void setDist(int dist){
        if(Runin)this.dist=dist;
    }
    public boolean getGanar(){
        if (Runin){
            ganar = this.dist>=fin;
        }
        return ganar;
    }
    public void setRunin(boolean Runin){
        this.Runin=Runin;
    }
    public boolean getRunin(){
        return Runin;
    }
}
