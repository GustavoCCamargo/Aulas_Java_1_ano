package aulas;

import libs.Entrada;
import libs.Vetores;

public class Aula26 {

    public static void aula(){

     int [] vetor = new int[6];
     int [] b; 
     
     vetor = Vetores.lerInteiros(6);
     Vetores.mostrarInteiros(vetor);   

     b = Vetores.obterIndicesInteiros(vetor, 2);

     Vetores.mostrarInteiros(b);

     

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
