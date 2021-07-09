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
public class JUGADORES {
    private int IdJugador;
    private static int IdOtrojg = 1;
    private int nom;
    
    public JUGADORES(int nom){
        this.nom=nom;
        IdJugador=IdOtrojg;
        IdOtrojg++;
    }
    public int getId(){
        return IdJugador;
    }
    public String getName(){
        return "A"+nom;
    }
    public int getDado(){
        return (int)(Math.random()*6+1)*100;
    }
}
