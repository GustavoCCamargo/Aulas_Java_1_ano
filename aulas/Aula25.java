package aulas;

import libs.Entrada;

public class Aula25 {

    public static void aula() {
        exercicioDoisLista();
    }

    //EXERCÍCIO 5 LISTA
    public static void paresDepoisImpares() {

        int [] va, vb;
        int i;
        int n = 10, index;
        va = new int[n];
        vb = new int[n];

        Entrada.abrir();

        System.out.println("Vetores: ");

        for(i = 0; i<n; i++){
            va[i] = Entrada.LerInt();
        }

        index = 0;

        for(i = 0 ; i<n; i++){

            if (va[i] % 2 ==0) {
                vb[index] = va[i];
                index ++;
            }

        }

        for(i = 0; i<n; i++){
            if (va[i]%2 !=0) {
                vb[index] = va[i];
                index ++ ;
            }
        }

        for(i = 0; i<n; i++){
            System.out.print(vb[i] + " ");
        }

        System.out.println(" ");

        Entrada.Fechar();
        
    }


    //Questão 2 da prova;
    public static void retornaFraseNaVertical(String frase , int x) {


        for(int i= 0; i<x; i++){


            for(int j = i; j< frase.length(); j = j+x ){

                System.out.print(frase.charAt(j));


            }

        }
        System.out.println(" ");
        
    }

    public static void exercicioDoisLista() {
        int [] va, vb, vc;
        va = new int[10];
        vb = new int[10];
        vc = new int[10];

        System.out.println("Vetores: ");
        Entrada.abrir();
        for(int i = 0; i< 10; i++){

            va[i] = Entrada.LerIntMsg("VetA = ");
            vb[i] = Entrada.LerIntMsg("VetB = ");
            
        }


        for(int i =0; i<10; i++){
            if (i % 2 == 0) {
                vc[i] = va[i] + vb [i];
            }

            if (i % 2 != 0) {
                vc[i] = va[i] - vb [i];
            }
        }
        System.out.println("Vetor A");
        for(int i =0; i<10; i++){
            System.out.print(va[i] + " ");
        }
        System.out.println(" ");

        System.out.println("Vetor B");
        for(int i =0; i<10; i++){
            System.out.print(vb[i] + " ");
        }

        System.out.println(" ");

        System.out.println("Vetor C");
        for(int i =0; i<10; i++){
            System.out.print(vc[i] + " ");
        }

        System.out.println(" ");

    }



    
}