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
public class CARRIL {
    private int DistNow=0;
    private final JUGADORES jg;
    private final int IdCarril;
    
    public CARRIL(JUGADORES jg){
        this.jg=jg;
        IdCarril=jg.getId();
    }
    public void setDist(int dist){
        DistNow+=dist;
    }
    public int DistNow(){
        return DistNow;
    }
    public int getIdCarril(){
        return IdCarril;
    }
}
