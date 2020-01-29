/*
 * 36000 lanzamientos de 2 dados.
    Crea un array con las sumas.
 */
package com.mycompany.dados;

public class Dados {
    public static void main(String[] args) {
        int lanzamientos=36000;
        //capacidad Array
        int n=13;
        
        //daclaro array
        int posibilidades[];
        
        //creao array.
        posibilidades=new int[n];
        
        //metodos
        tirarDados(lanzamientos,posibilidades);
        estadisticas(lanzamientos, posibilidades);
        
    }
    //CREAMOS EL METODO DE tiraDados
    public static void tirarDados(int lanzamientos,int[]posibilidades){
        int dado1,dado2,resultado;
        for (int i = 0; i < lanzamientos; i++) {
            dado1=(int)(Math.random()*6)+1;
            dado2=(int)(Math.random()*6)+1;
            
            resultado=dado1+dado2;
            
            posibilidades[resultado]++;
        }
    }
    
    //CREAMOS EL METODO DE estadisticas.
    public static void estadisticas(int lanzamientos,int[] posibilidades){
        for (int i = 2; i <posibilidades.length ; i++) {
            System.out.println("El porcdentaje de "+i+" es "+(posibilidades[i]/(double)lanzamientos*100)+"%");
        }
    }
}
