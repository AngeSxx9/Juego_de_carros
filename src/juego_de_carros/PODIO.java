/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego_de_carros;
import java.util.ArrayList;
/**
 *
 * @author sofia chamorro
 */
public class PODIO {
    private ArrayList<JUGADORES> jugador;
    private ArrayList<CARRO> carros;
    private String PrimerLugar=" ";
    private String SegundoLugar=" ";
    private String TercerLugar=" ";
    
    private int contador=0;
    public PODIO(ArrayList<JUGADORES> jugador,ArrayList<CARRO> carros){
        this.jugador=jugador;
        this.carros=carros;
    }
    public void Resultados(){
        System.out.println("1er lugar "+PrimerLugar);
        System.out.println("2do lugar "+SegundoLugar);
	System.out.println("3er lugar "+TercerLugar);
    }
    public void ganadores(int autos){
        if(carros.get(autos).getGanar() && carros.get(autos).getRunin()!=false){
            switch (contador) {
                case 0:
                    PrimerLugar=jugador.get(autos).getName();
                    carros.get(autos).setRunin(false);
                    break;
                case 1:
                    SegundoLugar=jugador.get(autos).getName();
                    carros.get(autos).setRunin(false);
                    break;
                    
                default:
                    TercerLugar=jugador.get(autos).getName();
                    carros.get(autos).setRunin(false);
                    break;
            }
            contador++;
        }       
    }
    public int getContador(){
        return contador;
    }
}
