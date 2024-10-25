package trabalhos;

import libs.Entrada;
import libs.Matrizes;
import libs.Vetores;

public class T3 {

    public static void main() {

        // Teste exercício 1 

        //mostrarInteiros(new int [] {1,2,3,4,5,5,6,}, ',');

        // Teste exercício 2

        //filtraMaiores(new int [] {5,7,6,3,2,1,23,5,}, 2);

        // Teste exercício 3

        //filtraMenores(new int [] {5,7,6,3,2,1,23,5,}, 15);

        // Teste exercício 4 

        //aplicarELogico(new boolean[] {false,true,false,true}, new boolean[] {true,true,false,true});
        
        // Teste exercício 5

        //Vetores.mostrarlogico(aplicarOuLogico(new boolean[] {false,true,false,true}, new boolean[] {true,true,false,true}));

       // Teste exercício 6

       //Vetores.mostrarInteiros(aplicarMascara(new int[] {1,2,3,4,5,6,7,}, new boolean[]{true,false,true,false,false,true,false}));
        
       // Teste exercício 7

       //Vetores.mostrarInteiros(uniaoVetores(new int[] {1,1,1,1}, new int[] {2,2,2,2}));

       // Teste exercício 8

       // Vetores.mostrarInteiros(intersecaoVetor(new int[] {1,1,1,2}, new int[] {2,2,1,2}));

       // Teste exercício 9

       //Vetores.mostrarInteiros(DiferencaEntreVetores(new int[] {1,1,3,3,4}, new int[] {2,2,5,6,4}));

       //Vetores.mostrarInteiros(Vetores.retiraRepeticaoInt(DiferencaEntreVetores(new int[] {1,1,3,4}, new int[] {2,2,5,6})));

        // Teste exercício 10

        //Matrizes.mostrarMatriz(trianguloPascal(5));

        // Teste exercício 11

       //int matriz[][] = {{1,2}, {4,5}, {7,8}};
        //Matrizes.mostrarMatriz(matriz);

        //Matrizes.mostrarMatriz(matrizTranspor(matriz));
        

        // Teste exercício 12
        //int matriz[][] = {{1,2,3}, {4,5,6}, {7,8,9}};

        //Matrizes.mostrarMatriz(matrizPermutacaoLinhas(matriz, 0, 2));

        // Teste exercício 13
        int matriz[][] = {{3,4}, {1,0}};
        int matriZ[][] = {{5,1}, {0,1}};

        Matrizes.mostrarMatriz(matrizMultInt(matriz, matriZ));
    }

    // Teste exercício 1 
    public static void mostrarInteiros(int [] vet, char a) {
        
        System.out.print(vet[0] + "" + a);

        for(int i = 1; i<vet.length-1; i++){
            
            System.out.print(vet[i] + "" + a);
        }

        System.out.print(vet[vet.length-1]);

        System.out.println();
    }

    // Teste exercício 2
    public static int [] filtraMaiores(int [] vet, int a) {

         
        int cont = 0;
        for(int i = 0; i< vet.length; i++){

            if (a < vet[i]) {
                cont++;
            }
        }

        int [] vetor_result = new int[cont];
        int index = 0;

        for(int i = 0; i< vet.length; i++){

            if (a < vet[i]) {
                vetor_result[index] = vet[i];
                index++;
            }
        }


        return vetor_result;
    }

    // Teste exercício 3
    public static int [] filtraMenores(int [] vet, int a) {

         
        int cont = 0;
        for(int i = 0; i< vet.length; i++){

            if (a > vet[i]) {
                cont++;
            }
        }

        int [] vetor_result = new int[cont];
        int index = 0;

        for(int i = 0; i< vet.length; i++){

            if (a > vet[i]) {
                vetor_result[index] = vet[i];
                index++;
            }
        }


        return vetor_result;
    }

    // Teste exercício 4
    public static boolean [] aplicarELogico(boolean [] v, boolean [] w){

        boolean [] vet_result = new boolean[v.length];

        for(int i = 0; i<v.length; i++){

            vet_result[i] = v[i] && w[i];

        }
        
        return vet_result;

    }

    // Teste exercício 5
    public static boolean [] aplicarOuLogico(boolean [] v, boolean [] w){

        boolean [] vet_result = new boolean[v.length];

        for(int i = 0; i<v.length; i++){

            vet_result[i] = v[i] || w[i];

        }
        
        return vet_result;

    }

    // Teste exercício 6
    public static int[] aplicarMascara(int [] vet, boolean [] w){

        int [] vet_result;
        int cont = 0;

        for(int i = 0; i<w.length; i++){

            if (w[i] == true) {
                cont++;
            }
        }

        vet_result = new int[cont];

        int index = 0;

        for(int i = 0; i<w.length; i++){

            if (w[i] == true) {
                vet_result[index] = vet[i];
                index++;
            }
        }

        return vet_result;

    }

    // Teste exercício 7
    public static int [] uniaoVetores(int [] a, int [] b){

        int [] vet_uniao = new int[a.length + b.length];
      
        int index = 0;
        
        //Concatena os dois vetores em um só;
        for(int i =0; i <a.length;i++){

            vet_uniao [index] = a[i];
            index++;
        }

        for(int i =0; i <b.length;i++){

            vet_uniao [index] = b[i];
            index++;
        }

        //adiciona os valores sem repetição para um novo vetor.
      
        int [] vet_conjunto = new int[vet_uniao.length];
        int Index = 0;

       
        for(int i = 0; i<vet_conjunto.length;i++){

            for(int j = i;j<vet_uniao.length;j++){

                for(int c = 0; c<vet_conjunto.length;c++){
                    if (vet_uniao[j] == vet_conjunto[c]) {
                        break;
                    }

                    if (c == vet_conjunto.length-1) {
                        vet_conjunto[Index] = vet_uniao[j];
                        Index++;
                    }
                }
               
            }
            
        }

        //passa somente os valores para outro vetor, resolve o problema do tamanho do vetor.
        int [] vet_final = new int[Index];

        for(int i = 0; i<Index; i++){
            vet_final [i] = vet_conjunto[i];
        }

    
        return vet_final;
    }   

    // Teste exercício 8
    public static int [] intersecaoVetor(int[] a, int[] b) {

        int [] vet_uniao = new int[a.length + b.length];
        int index = 0;
        
        //Concatena os dois vetores em um só;
        for(int i =0; i <a.length;i++){

            vet_uniao [index] = a[i];
            index++;
        }

        for(int i =0; i <b.length;i++){

            vet_uniao [index] = b[i];
            index++;
        }

        


        //adiciona os valores que estão presentes nos dois vetores, sem repetição para um novo vetor.
      
        int [] vet_conjunto = new int[vet_uniao.length];
        int Index = 0;

       
        

        for(int j = 0; j<vet_uniao.length;j++){

            for(int c = 0; j<vet_uniao.length; c++){

                if (vet_uniao[j] == vet_uniao[c]) {

                    for(int i = 0; i<vet_conjunto.length;i++){

                        if (vet_uniao[j] == vet_conjunto[i]) {
                            break;
                        }

                        if (i == vet_conjunto.length-1) {
                            vet_conjunto[Index] = vet_uniao[j];
                            Index++;
                        }
                    }
                    
                    break;
                }
            }
        }

        
        //passa somente os valores para outro vetor, resolve o problema do tamanho do vetor.
        int [] vet_final = new int[Index];

        for(int i = 0; i<Index; i++){
            vet_final [i] = vet_conjunto[i];
        }

        return vet_final;
    }

    // Teste exercício 9
    public static int [] DiferencaEntreVetores(int[] a, int[] b) {

        int [] vet_uniao = new int[a.length + b.length];
        int index = 0;
        
    
        //adiciona os valores que estão presentes nos dois vetores, sem repetição para um novo vetor.
      
        int [] vet_conjunto = new int[a.length];
        int Index = 0;

        //Passa pelo vetor a e b vendo se se os valores são diferentes;
        //Se forem diferentes é verificado se ele é diferente de todos os outros elementos;
        //se for ele é adicionado ao vetor_conjunto;
        for(int i = 0; i<a.length;i++){

            for(int j =0; j<b.length;j++){

                if (a[i]!= b[j]) {

                    for(int c = 0;c<b.length;c++){
                        if (a[i] == b[c]) {
                            break;
                        }

                        if (c == b.length-1) {

                            for(int d = 0; d<vet_conjunto.length;d++){

                                if (b[c] == vet_conjunto[d]) {
                                    break;
                                }

                                if (d == vet_conjunto.length-1) {
                                    vet_conjunto[Index] = a[i];
                                    Index++;
                                    
                                }

                                
                            }
                            
                        }
                        
                    }
                    
                    break;
                }

            }
        }
        

        Vetores.mostrarInteiros(vet_conjunto);

     

        
        //Utiliza a função retira repetição pra pegar o tamanho, declarando o tamanho do vetor final.
        //Em seguida o vetor final recebe os valores que a função retira repetição retorna.
        int [] vet_final = new int[Vetores.retiraRepeticaoInt(vet_conjunto).length];

        vet_final = Vetores.retiraRepeticaoInt(vet_conjunto);

        return vet_final;
    }

    // Teste exercício 10
    public static int [][] trianguloPascal(int n) {
        
        int [][] matriz = new int[n][n];

        for(int i = 0; i<matriz.length; i++){
            matriz[i][0] = 1;
            matriz[i][i] = 1;

            for(int j = 1 ; j<i; j++){

                matriz [i][j] = matriz[i-1][j-1] + matriz[i-1][j];

            }
        }

        return matriz;
    }

    // Teste exercício 11
    public static int[][] matrizTranspor(int[][] mat) {

        int [][] matriz_final = new int[mat[0].length][mat.length];

        for(int i = 0; i<mat.length;i++){

            for(int j=0; j<mat[0].length;j++){

                matriz_final [j][i] = mat[i][j];
            }
        }
        
        return matriz_final;
    }

    // Teste exercício 12
    public static int[][] matrizPermutacaoLinhas( int[][] matriz, int linha_a, int linha_b ){
        //Codigo aqui
        int[][] matriz_resultado = new int[matriz.length][matriz[1].length];

        for(int i = 0; i<matriz.length;i++){
            for(int j = 0; j<matriz[i].length;j++){

                if (i == linha_a) {
                    matriz_resultado[linha_b][j] = matriz[i][j];
                }
                if (i == linha_b) {
                    matriz_resultado[linha_a][j] = matriz[i][j];
                }

                if (i != linha_a && i != linha_b) {
                    matriz_resultado[i][j] = matriz[i][j];
                }
               
            }
        }

        return matriz_resultado;
    }

    // Teste exercício 13

    public static int[][] matrizMultInt(int[][] a, int[][] b) {

        int [][] M;
        int cont = 0;

        if (a.length == b.length && a[0].length == b[0].length) {
            
            M = new int[a.length][a[0].length];

            for(int i = 0; i<M.length;i++){

                for(int j = 0; j<M[i].length; j++){

                    for(int c = i; c<a.length; c++){

                        if (c == i) {

                            for(int d =0; d<a[c].length; d++){
                                 
                                cont += a[i][j] * b[i][j];
                            }
                        }
                    
                        if (c!=i) {
                            M[i][j] = cont;
                            cont = 0;
                            break;
                        }
                    }

                }

            }

            return M;
        }

        return new int[0][0];
    }
}

