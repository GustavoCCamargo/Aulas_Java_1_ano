package trabalhos;

import libs.Entrada;
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

       Vetores.mostrarInteiros(uniaoVetores(new int[] {1, 2, 3, 4, 5, 6, 7}, new int[] {5, 6, 7, 8, 9, 10}));
    }

    public static void mostrarInteiros(int [] vet, char a) {
        
        System.out.print(vet[0] + "" + a);

        for(int i = 1; i<vet.length-1; i++){
            
            System.out.print(vet[i] + "" + a);
        }

        System.out.print(vet[vet.length-1]);

        System.out.println();
    }

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

    public static boolean [] aplicarELogico(boolean [] v, boolean [] w){

        boolean [] vet_result = new boolean[v.length];

        for(int i = 0; i<v.length; i++){

            vet_result[i] = v[i] && w[i];

        }
        
        return vet_result;

    }


    public static boolean [] aplicarOuLogico(boolean [] v, boolean [] w){

        boolean [] vet_result = new boolean[v.length];

        for(int i = 0; i<v.length; i++){

            vet_result[i] = v[i] || w[i];

        }
        
        return vet_result;

    }


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


    public static int [] uniaoVetores(int [] a, int [] b){

        int [] vet_uniao = new int[a.length + b.length];
        
        int index = 0;
        int conta_repe = 0;
        

        for(int i =0; i <a.length;i++){

            vet_uniao [index] = a[i];
            index++;
        }

        for(int i =0; i <b.length;i++){

            vet_uniao [index] = b[i];
            index++;
        }

        int cont = 1;

        for(int i = 0; i<vet_uniao.length;i++){
            for(int j = cont;j<vet_uniao.length;j++){

                if (vet_uniao[i]==vet_uniao[j]) {
                    conta_repe++;
                }
            }
            cont++;
        }

        int [] vet_conjunto = new int[vet_uniao.length-conta_repe];
        int Index = 0;
       
        for(int i = 0; i<vet_conjunto.length;i++){

            for(int j = i;j<vet_uniao.length;j++){

                // if (vet_conjunto[i] != vet_uniao[j]) {
                //     vet_conjunto[Index] = vet_uniao[j];
                //     Index++;
                //     break;
                // }
                // if (vet_conjunto[i]==vet_uniao[j]) {
                //    break;
                // }

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


        

        System.out.println(conta_repe);
    
        return vet_uniao;
    }



    
}