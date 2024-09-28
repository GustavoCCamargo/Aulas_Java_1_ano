package aulas;

import libs.Entrada;

//Primeira aula MATRIZES.
public class Aula27 {

    public static void aula() {

        ex05();
        
    }

    public static void ex01() {
        int [][] m1;
        int i, j;

        m1 = new int[5][5];
        Entrada.abrir();
        for(i = 0; i< m1.length; i++){

            for(j = 0; j< m1[i].length; j++){

                m1[i][j] = Entrada.LerIntMsg("Digite um número: ");
            }

        }

        System.out.println(" ");


        for(i = 0; i< m1.length; i++){

            for(j = 0; j< m1[i].length; j++){

                System.out.print( m1[i][j] + " ");;
            }

            System.out.println(" ");

        }


    }

    public static void ex02() {
        int [][] m1;
        int i, j;

        //Preencher a Matriz!!!
        m1 = new int[5][20];
        Entrada.abrir();

        for(i = 0; i< m1.length; i++){

            for(j = 0; j< m1[i].length; j++){

                if(i == 0 || i == m1.length-1 || j ==0 || j== m1[1].length-1 ){
                    m1[i][j] = 1;
                }
               
            }

        }

        System.out.println(" ");

        //Mostrar a Matriz;
        for(i = 0; i< m1.length; i++){

            for(j = 0; j< m1[i].length; j++){

                System.out.print( m1[i][j] + " ");;
            }

            System.out.println(" ");

        }


    }


    public static void ex03() {
        int [][] m1;
        int i, j, cont_menor = 0;

        m1 = new int[4][4];
        Entrada.abrir();
        for(i = 0; i< m1.length; i++){

            for(j = 0; j< m1[i].length; j++){

                m1[i][j] = Entrada.sorteio(0, 30);
            }

        }

        for(i = 0; i< m1.length; i++){

            for(j = 0; j< m1[i].length; j++){

                if (m1[i][j] < 10) {
                    cont_menor++;
                }
                
            }

        }

        System.out.println("Números menores que 10 na matriz = "+cont_menor);

    }


    public static void ex04() {
        int [][] m1;
        int i, j;

        m1 = new int[10][10];
        Entrada.abrir();

        for(i = 0; i< m1.length; i++){

            for(j = 0; j< m1[i].length; j++){

                m1[i][i] = 1;
                m1[i][m1[i].length-i-1] = 1;
                
            }

        }

        for(i = 0; i< m1.length; i++){

            for(j = 0; j< m1[i].length; j++){

                System.out.print( m1[i][j] + " ");;
            }

            

            System.out.println(" ");

        }

    }


    public static void ex05() {
        int [][] m1;
        int i, j;

        //Preencher a Matriz!!!
        m1 = new int[5][5];
        Entrada.abrir();

        for(i = 0; i< m1.length; i++){

            for(j = 0; j< m1[i].length; j++){

                if(i == 0 || i == m1.length-1 || j ==0 || j== m1[1].length-1 ){
                    m1[i][j] = 1;
                }

                if(i > 0 && i < m1.length-1 && j > 0 && j < m1[1].length-1 ){
                    m1[i][j] = 2;
                }

               
               
            }

        }

        System.out.println(" ");

        //Mostrar a Matriz;
        for(i = 0; i< m1.length; i++){

            for(j = 0; j< m1[i].length; j++){

                System.out.print( m1[i][j] + " ");;
            }

            System.out.println(" ");

        }


    }

    
}
