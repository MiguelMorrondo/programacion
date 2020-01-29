package dados;
public class Dados {
    public static void main(String[] args) {
        int lanzamientos=100000000;
        int n=13;
        int[] posibilidades;
        posibilidades=new int[n];
        tirarDados(lanzamientos, posibilidades);
        estadisticas(lanzamientos, posibilidades);
    }
    public static void tirarDados(int lanzamientos, int[] posibilidades){
        int dado1,dado2,resultado;
        for(int i=0;i<lanzamientos;i++){
            dado1=(int)(Math.random()*6)+1;
            dado2=(int)(Math.random()*6)+1;
            resultado=dado1+dado2;
            posibilidades[resultado]++;
        }
    }
    public static void estadisticas(int lanzamientos, int[] posibilidades){
        int j;
        for(int i=2;i<posibilidades.length;i++){
            System.out.println("El porcentaje de "+i+" es "+(posibilidades[i]/(double)lanzamientos*100)+"%");
        }
    }
    
}
