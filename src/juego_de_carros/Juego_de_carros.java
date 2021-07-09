/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego_de_carros;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author sofia chamorro
 */
public class Juego_de_carros {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings({"UnusedAssignment", "empty-statement"})
    public static void main(String[] args) {
        Scanner jugador = new Scanner(System.in);
        Scanner kilometros = new Scanner(System.in);
        int jgs = 0;
        int km;
        int I;
        String cont="si";
        ArrayList<JUGADORES> jugadores = new ArrayList<>(jgs);
        ArrayList<CARRO> carro = new ArrayList<>(jgs);
        ArrayList<CARRIL> Carril = new ArrayList<>(jgs);
        while(cont.equalsIgnoreCase("si")){
          System.out.println("Digite el número de jugadores (hasta 3 jugadores): ");
          jgs = jugador.nextInt();
          if (jgs<3)jgs=3;
          
           System.out.println();
           System.out.print("Digite los km de la pista que desea: ");
           km = kilometros.nextInt()*1000;
           if (km>1000)km=1000;
           
           for (I=0;I<jgs;I++){
               jugadores.add(new JUGADORES(I+1));
               Carril.add(new CARRIL(jugadores.get(I)));
               carro.add(new CARRO(jugadores.get(I),km));
           }
           
           PODIO podio = new PODIO(jugadores,carro);
           PISTA pista = new PISTA(jugadores,km/100);
           pista.Carrera();
           pista.salida();
           
           while(podio.getContador()<3){
               for(I=0;I<carro.size();I++){
                   Carril.get(I).setDist(jugadores.get(I).getDado());
                   carro.get(I).setDist(Carril.get(I).DistNow());
                   pista.setUbic(Carril.get(I).DistNow()/100,I,jugadores.get(I).getName());
                   if(carro.get(I).getRunin()!=false)pista.salida();
                   podio.ganadores(I);
               }
           }
           podio.Resultados();
           System.out.println("Desea Continuar (s/n): ");
           Scanner entrada=new Scanner(System.in);
           cont=entrada.next();
        }
    }
    
}
