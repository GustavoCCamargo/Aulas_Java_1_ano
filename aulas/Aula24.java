package aulas;


import java.util.Random;

import libs.Entrada;

public class Aula24 {

    public static void aula() {

        System.out.println("++++ Vetores ++++");
        //MostrarMaioresMedia();
        CalculaPontos();
    }

    public static void MostrarMaioresMedia(){

        int [] nota;
        float media;
        int soma = 0, n_valores;

        Entrada.abrir();

        n_valores = Entrada.LerIntMsg("Digite a quantidade de valores: ");

        nota = new int[n_valores];

        for(int i = 0; i< nota.length; i++){

            nota[i] = Entrada.LerIntMsg("Nota: ");
            soma += nota[i];
        }

        media = soma/nota.length;

        for(int i = 0; i<nota.length; i++){
            if (nota[i] > media) {
                System.out.println("Nota " + (i+1) + " acima da média da turma.");
            }

            if (nota[i] < media) {
                System.out.println("Nota " + (i+1) + " abaixo da média da turma.");
            }
        }


        Entrada.Fechar();

    }

    public static void CalculaPontos() {
        int [] vet1, vet2;
        int pontos = 0;
        vet1 = new int[10];
        vet2 = new int[5];

        Entrada.abrir();

        for(int i = 0; i<vet1.length; i++){

            vet1[i] = Entrada.sorteio(0, 50);
            System.out.println(vet1[i]);
        }

        
        System.out.println("DIGITE 5 NÚMEROS PARA O SORTEIO!");
        for( int i = 0; i < vet2.length; i++){

            vet2[i] = Entrada.LerIntMsg("Digite o número de 0 a 50 para sorteio: ");

        }

        for(int i = 0; i<vet1.length; i++){

            for(int a = 0; a<vet2.length; a++){

                if (vet2[a] == vet1[i]) {
                    pontos ++;
                    System.out.println("+1 ponto");
                    break;
                }

                

            }
        }

        
        
        System.out.println("Você teve um acerto de " + pontos+ " pontos;");

        Entrada.Fechar();
    }

}    