package aulas;
import libs.Vetores;

public class Aula37 {
    public static void aula(){
        ex02();
    }

    public static void ex01(){
        System.out.println("Teste subvetor");
        int [ ] v ={4,1,7,0,8,5,2,9,6,3};

        int [] vet_esqr = Vetores.subVetores(v, 0, 5);
        int [] vet_direita = Vetores.subVetores(v, 5, 10);

        Vetores.mostrarInteiros(Vetores.subVetores(v, 0, 5));
    }

    public static void ex02(){

        
        int [ ] v ={4,1,7,0,8,5,2,9,6,3};

       Vetores.mostrarInteiros(v);

       int [] v_orde = Vetores.mergeSort(v);

        Vetores.mostrarInteiros(v_orde);
    }
}
