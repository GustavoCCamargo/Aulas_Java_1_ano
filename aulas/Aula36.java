package aulas;
import libs.Vetores;
public class Aula36 {
    public static void aula() {
        System.out.println("Aula 36 - Insertion Sort, Selection Sort");
        //ex01();
        ex03();
    }

    public static void ex01(){
        int[] v = {0,17,18,30,20,2};

        
        Vetores.ordenarInsertionSort(v);
        Vetores.mostrarInteiros(v);
    }   

    // O selection sort pega os valores e vai verificando se tem algum menor q ele, se houver ele faz a troca ;
    public static void ex02(){
       
        int[] v = {0,17,18,30,20,2,1};

        Vetores.ordenarSelectorSort(v);
        
        Vetores.mostrarInteiros(v);
    }

    // Juntar dois vetores em um novo vetor ordenado MERGE SORT
    public static void ex03(){
        int [] va = {0,2,4,7,8};
        int [] vb = {1,3,5};

        Vetores.merge(va, vb);
        Vetores.mostrarInteiros(Vetores.merge(va, vb));
    }


}
