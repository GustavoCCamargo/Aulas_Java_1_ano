package aulas;

import libs.Entrada;
import libs.Vetores;

public class Aula26 {

    public static void aula(){
        int [] num = new int[5];
        int [] vet;
        num[0] = 1;
        num[1] = 2;
        num[2] = 3;
        num[3] = 4;
        num[4] = 5;
        vet = Vetores.subVetor(num, -20, 10);
        Vetores.mostrarInteiros(vet);

    }

    
    //exercício 6 lista!!
    public static void salvaPareImparfim() {
        int [] vet = new int[10];
        int par_index, impar_index, x;

        Entrada.abrir();
        par_index = 0;
        impar_index = vet.length-1;

        for(int i = 0; i<vet.length; i++){

            x = Entrada.LerIntMsg("Digite um número: ");

            if (x%2==0) {
                vet[par_index] = x;
                par_index++;

            }else{

                vet[impar_index] = x;
                impar_index --;
            }

        }

        for(int i = 0; i<vet.length; i++){

           System.out.print(vet[i] + " ");
        }
        System.out.println(" ");

        

        Entrada.Fechar();

        
    }
  
   
}
