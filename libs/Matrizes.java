package libs;

public class Matrizes {

    public static int[][] somaMatrizes(int [][] ma, int [][] mb){

        int i,j;
        int [] [] m_result;
        m_result = new int[ma.length][ma[0].length];

        for(i = 0; i<ma.length; i++){

            for(j=0; j<ma[i].length; j++){

                m_result[i][j] = ma[i][j] + mb[i][j];
            }

        }
  
        return m_result;
    }

    public static int [] [] novaidentidade(int n){

        int [][] m;
        m = new int[n][n];

        for(int i = 0; i< m.length; i++){

            m[i][i] = 1;
        }

        return m;
    }


    public static void mostrarMatriz(int[][] m){

        for(int i = 0; i<m.length; i++){
            for(int j = 0; j<m[i].length;j++){

                System.out.print(m[i][j] + " ");
            }

            System.out.println(" ");
        }

        System.out.println(" ");
    }

    public static boolean comparaMatrizes(int [][]ma, int[][] mb){

        if(ma.length != mb.length){
            return false;
        }

        if(ma[0].length != mb[0].length){
            return false;
        }

        for(int i = 0; i<ma.length; i++){
            for(int j = 0; j<ma[i].length; j++){
                if (ma[i][j] !=  mb[i][j] ) {
                    return false;
                }
            }
        }

        return true;
    }

    public static int[][] alocarInteiros(int linhas, int colunas){

        int [] [] m = new int[linhas][colunas];

        return m;
    }

    public static int [][] preencherInteiro( int [] [] m, int val){

        int [] [] ma = new int[m.length][m[0].length];

        for(int i = 0; i<ma.length; i++){

            for(int j = 0; j<ma[i].length; j++){
                ma[i][j] = val;
            }
        }

        return ma;
    }


    public static int[][] matrizLeiaInt(int [][] ma){

        int [][] m = new int[ma.length][ma[0].length];

        Entrada.abrir();

        for(int i = 0; i<m.length; i++){

            for(int j = 0; j<m[i].length; j++){
                m[i][j] = Entrada.LerIntMsg("Digite um número: ") ;
            }
        }

        Entrada.Fechar();

        return m;

    }


    public static int[] obterLinha(int [][]m1, int num){

        int [] vet = new int[m1[0].length];

        for(int j =0 ; j<m1[num].length;j++){
            vet[j] = m1[num][j];
        }

        return vet;
    }

    public static int[][] mutipliMamatriz(int [][]m1, int[][]m2){

        // Falta acabar!!!!
        int i,j;

        int [][] m = new int[m1.length][m2[0].length];

        if (m1.length != m2[0].length) {
            return new int[0][0];
        }


        for( i = 0; i<m1.length;i++){
            for( j = 0; j<m1[i].length;i++){

            }
        }

        return m;
    }






}
