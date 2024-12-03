package aulas;

import libs.Vetores;

public class Aula38{

    public static void aula(){
        System.out.println("Radix Sort");
        ex01();
    }

    public static void ex01(){
        int[] a = {0,1,4,6,2,7};

        int[] a_ordenado = Vetores.ordenarCountingSort(a);

        Vetores.mostrarInteiros(a_ordenado);
    }   

    
}
