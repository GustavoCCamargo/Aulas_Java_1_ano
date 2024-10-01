package aulas;
import libs.Matrizes;
import libs.Vetores;

public class Aula28 {

    public static void aula() {
        ex01();
    }

    public static void ex01(){

     
       int [] [] m1;
       int [] vet;
       
       int n_linhas = 4;
       int n_colunas = 3;

       m1 = new int[n_linhas][n_colunas];
       vet = new int[n_linhas];

       m1[3][0] = 1;
       m1[3][1] = 2;
       m1[3][2] = 3;

        //m3 = Matrizes.somaMatrizes(m1,m2);

       // Matrizes.mostrarMatriz(m3);

       vet = Matrizes.obterLinha(m1, 2);

       Vetores.mostrarInteiros(vet);
    }

    
}
