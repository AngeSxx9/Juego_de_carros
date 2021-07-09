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
public class PISTA {
    private int vertical;
    private int horizontal;
    private String pista[][];
    ArrayList<JUGADORES> jugs;
    
    public PISTA(ArrayList<JUGADORES> jugs,int vertical){
        this.horizontal=jugs.size();
        this.vertical=vertical;
        this.jugs=jugs;
        pista=new String[vertical+1][horizontal];
    }  
    public void Carrera(){
        for(int I=0;I<=vertical;I++){
            for(int K=0;K<horizontal;K++){
                if(I==0){
                    pista[I][K]=jugs.get(K).getName();
                }else pista[I][K]="| ";
            }
        }
    }
    public void salida(){
        for( int I=0;I<=vertical;I++){
            for(int K=0;K<horizontal;K++){
                System.out.print(pista[I][K]);
            }
            System.out.println();
        }
        System.out.println("TTTTTTTTTTTT");
        
    }
    public void setUbic(int v,int h,String jg){
        if(v<=this.vertical & horizontal<=this.horizontal){
            this.suprim(jg,h);
            pista[v][h]=jg;
        }
        else{
            this.suprim(jg,h);
            pista[this.vertical][h]=jg;
        }
    }
    public void suprim(String jg,int h){
        for(int I=0;I<vertical;I++){
            if(pista[I][h].equals(jg))pista[I][h]="| ";
        }
    }
}