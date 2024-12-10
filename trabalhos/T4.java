package trabalhos;
import libs.Tempo;
import libs.Vetores;

/* tam = 1000
 *  vetor_aleatorios = gerarValoresAleatorios();
 * vetor_copia = vetor_alea
 * tempo
 * bubleSort(vetor_copia)
 * vetor_copia
 * tempo
 * Insertion sort(vetor_copia)
 */


public class T4 {
    public static void main(){
        //ex01();
       // ex02();
        //ex03();
      // ex04();
        ex05();
        //ex06();
    }


    public static void ex01(){

        int [] v = new int[100];

        v = Vetores.gerarValoresAleatorios(100, 0, 1000000);

        int [] v_copia1 = new int[v.length];
        v_copia1 = Vetores.copiarInt(v);

        //bubble

        long tempo_inicio = Tempo.medirTempoIniciar();
        Vetores.ordenarBubbleSort(v_copia1);
        double tempo_segundos = Tempo.medirTempoFinalizarSegundos(tempo_inicio);

        
        System.out.printf("Tempo de ordenar usando bubble Sort : %.4f \n ", tempo_segundos  );

        // Insertion

        int [] v_copia2 = new int[v.length];
        v_copia2 = Vetores.copiarInt(v);

        long tempo_inicio1 = Tempo.medirTempoIniciar();
        Vetores.ordenarInsertionSort(v_copia2);
        double tempo_segundos1 = Tempo.medirTempoFinalizarSegundos(tempo_inicio1);

        System.out.printf("Tempo de ordenar usando Insertion Sort : %.4f \n ", tempo_segundos1  );

        // Quick Sort

        int [] v_copia3 = new int[v.length];
        v_copia3 = Vetores.copiarInt(v);

        long tempo_inicio2 = Tempo.medirTempoIniciar();
        Vetores.quickSort(v_copia3, 0, v_copia3.length-1);
        double tempo_segundos2 = Tempo.medirTempoFinalizarSegundos(tempo_inicio2);

        System.out.printf("Tempo de ordenar usando Quick Sort : %.4f \n ", tempo_segundos2  );

        // Merge Sort

        int [] v_copia4 = new int[v.length];
        v_copia4 = Vetores.copiarInt(v);

        long tempo_inicio3 = Tempo.medirTempoIniciar();
        Vetores.mergeSort(v_copia4);
        double tempo_segundos3 = Tempo.medirTempoFinalizarSegundos(tempo_inicio3);
        System.out.printf("Tempo de ordenar usando Merge Sort : %.4f \n ", tempo_segundos3  );

        // radix sort

        int [] v_copia5 = new int[v.length];
        v_copia5 = Vetores.copiarInt(v);
        long tempo_inicio4 = Tempo.medirTempoIniciar();
        Vetores.radixSort(v_copia5);
        double tempo_segundos4 = Tempo.medirTempoFinalizarSegundos(tempo_inicio4);
        System.out.printf("Tempo de ordenar usando Radix Sort : %.4f \n ", tempo_segundos4  );

        // selection sort

        int [] v_copia6 = new int[v.length];
        v_copia6 = Vetores.copiarInt(v);
        long tempo_inicio5 = Tempo.medirTempoIniciar();

        Vetores.ordenarSelectorSort(v_copia6);
        double tempo_segundos5 = Tempo.medirTempoFinalizarSegundos(tempo_inicio5);
        System.out.printf("Tempo de ordenar usando Selection Sort : %.4f \n ", tempo_segundos5  );



    }


    public static void ex02(){

        int [] v = new int[1000];

        v = Vetores.gerarValoresAleatorios(1000, 0, 10000000);

        int [] v_copia1 = new int[v.length];
        v_copia1 = Vetores.copiarInt(v);

        //bubble

        long tempo_inicio = Tempo.medirTempoIniciar();
        Vetores.ordenarBubbleSort(v_copia1);
        double tempo_segundos = Tempo.medirTempoFinalizarSegundos(tempo_inicio);

        System.out.println("Tempo de ordenar usando Bubble Sort: " + tempo_segundos + " segundos");

        // Insertion

        int [] v_copia2 = new int[v.length];
        v_copia2 = Vetores.copiarInt(v);

        long tempo_inicio1 = Tempo.medirTempoIniciar();
        Vetores.ordenarInsertionSort(v_copia2);
        double tempo_segundos1 = Tempo.medirTempoFinalizarSegundos(tempo_inicio1);

        System.out.println("Tempo de ordenar usando Insertion Sort: " + tempo_segundos1 + " segundos");

        // Quick Sort

        int [] v_copia3 = new int[v.length];
        v_copia3 = Vetores.copiarInt(v);

        long tempo_inicio2 = Tempo.medirTempoIniciar();
        Vetores.quickSort(v_copia3, 0, v_copia3.length-1);
        double tempo_segundos2 = Tempo.medirTempoFinalizarSegundos(tempo_inicio2);

        System.out.println("Tempo de ordenar usando Quick Sort: " + tempo_segundos2 + " segundos");

        // Merge Sort

        int [] v_copia4 = new int[v.length];
        v_copia4 = Vetores.copiarInt(v);

        long tempo_inicio3 = Tempo.medirTempoIniciar();
        Vetores.mergeSort(v_copia4);
        double tempo_segundos3 = Tempo.medirTempoFinalizarSegundos(tempo_inicio3);
        System.out.println("Tempo de ordenar usando Merge Sort: " + tempo_segundos3 + " segundos");

        // radix sort

        int [] v_copia5 = new int[v.length];
        v_copia5 = Vetores.copiarInt(v);
        long tempo_inicio4 = Tempo.medirTempoIniciar();
        Vetores.radixSort(v_copia5);
        double tempo_segundos4 = Tempo.medirTempoFinalizarSegundos(tempo_inicio4);
        System.out.println("Tempo de ordenar usando Radix Sort: " + tempo_segundos4 + " segundos");

        // selection sort

        int [] v_copia6 = new int[v.length];
        v_copia6 = Vetores.copiarInt(v);
        long tempo_inicio5 = Tempo.medirTempoIniciar();

        Vetores.ordenarSelectorSort(v_copia6);
        double tempo_segundos5 = Tempo.medirTempoFinalizarSegundos(tempo_inicio5);
        System.out.println("Tempo de ordenar usando Selection Sort: " + tempo_segundos5 + " segundos");
        


    }

    public static void ex03(){

        int [] v = new int[10000];

        v = Vetores.gerarValoresAleatorios(10000, 0, 10000000);

        int [] v_copia1 = new int[v.length];
        v_copia1 = Vetores.copiarInt(v);

        //bubble

        long tempo_inicio = Tempo.medirTempoIniciar();
        Vetores.ordenarBubbleSort(v_copia1);
        double tempo_segundos = Tempo.medirTempoFinalizarSegundos(tempo_inicio);

        System.out.println("Tempo de ordenar usando Bubble Sort: " + tempo_segundos + " segundos");

        // Insertion

        int [] v_copia2 = new int[v.length];
        v_copia2 = Vetores.copiarInt(v);

        long tempo_inicio1 = Tempo.medirTempoIniciar();
        Vetores.ordenarInsertionSort(v_copia2);
        double tempo_segundos1 = Tempo.medirTempoFinalizarSegundos(tempo_inicio1);

        System.out.println("Tempo de ordenar usando Insertion Sort: " + tempo_segundos1 + " segundos");

        // Quick Sort

        int [] v_copia3 = new int[v.length];
        v_copia3 = Vetores.copiarInt(v);

        long tempo_inicio2 = Tempo.medirTempoIniciar();
        Vetores.quickSort(v_copia3, 0, v_copia3.length-1);
        double tempo_segundos2 = Tempo.medirTempoFinalizarSegundos(tempo_inicio2);

        System.out.println("Tempo de ordenar usando Quick Sort: " + tempo_segundos2 + " segundos");

        // Merge Sort

        int [] v_copia4 = new int[v.length];
        v_copia4 = Vetores.copiarInt(v);

        long tempo_inicio3 = Tempo.medirTempoIniciar();
        Vetores.mergeSort(v_copia4);
        double tempo_segundos3 = Tempo.medirTempoFinalizarSegundos(tempo_inicio3);
        System.out.println("Tempo de ordenar usando Merge Sort: " + tempo_segundos3 + " segundos");

        // radix sort

        int [] v_copia5 = new int[v.length];
        v_copia5 = Vetores.copiarInt(v);
        long tempo_inicio4 = Tempo.medirTempoIniciar();
        Vetores.radixSort(v_copia5);
        double tempo_segundos4 = Tempo.medirTempoFinalizarSegundos(tempo_inicio4);
        System.out.println("Tempo de ordenar usando Radix Sort: " + tempo_segundos4 + " segundos");

        // selection sort

        int [] v_copia6 = new int[v.length];
        v_copia6 = Vetores.copiarInt(v);
        long tempo_inicio5 = Tempo.medirTempoIniciar();

        Vetores.ordenarSelectorSort(v_copia6);
        double tempo_segundos5 = Tempo.medirTempoFinalizarSegundos(tempo_inicio5);
        System.out.println("Tempo de ordenar usando Selection Sort: " + tempo_segundos5 + " segundos");
        


    }

    public static void ex04(){

        int [] v = new int[100000];

        v = Vetores.gerarValoresAleatorios(100000, 0, 10000000);

        int [] v_copia1 = new int[v.length];
        v_copia1 = Vetores.copiarInt(v);

        //bubble

        long tempo_inicio = Tempo.medirTempoIniciar();
        Vetores.ordenarBubbleSort(v_copia1);
        double tempo_segundos = Tempo.medirTempoFinalizarSegundos(tempo_inicio);

        System.out.println("Tempo de ordenar usando Bubble Sort: " + tempo_segundos + " segundos");

        // Insertion

        int [] v_copia2 = new int[v.length];
        v_copia2 = Vetores.copiarInt(v);

        long tempo_inicio1 = Tempo.medirTempoIniciar();
        Vetores.ordenarInsertionSort(v_copia2);
        double tempo_segundos1 = Tempo.medirTempoFinalizarSegundos(tempo_inicio1);

        System.out.println("Tempo de ordenar usando Insertion Sort: " + tempo_segundos1 + " segundos");

        // Quick Sort

        int [] v_copia3 = new int[v.length];
        v_copia3 = Vetores.copiarInt(v);

        long tempo_inicio2 = Tempo.medirTempoIniciar();
        Vetores.quickSort(v_copia3, 0, v_copia3.length-1);
        double tempo_segundos2 = Tempo.medirTempoFinalizarSegundos(tempo_inicio2);

        System.out.println("Tempo de ordenar usando Quick Sort: " + tempo_segundos2 + " segundos");

        // Merge Sort

        int [] v_copia4 = new int[v.length];
        v_copia4 = Vetores.copiarInt(v);

        long tempo_inicio3 = Tempo.medirTempoIniciar();
        Vetores.mergeSort(v_copia4);
        double tempo_segundos3 = Tempo.medirTempoFinalizarSegundos(tempo_inicio3);
        System.out.println("Tempo de ordenar usando Merge Sort: " + tempo_segundos3 + " segundos");

        // radix sort

        int [] v_copia5 = new int[v.length];
        v_copia5 = Vetores.copiarInt(v);
        long tempo_inicio4 = Tempo.medirTempoIniciar();
        Vetores.radixSort(v_copia5);
        double tempo_segundos4 = Tempo.medirTempoFinalizarSegundos(tempo_inicio4);
        System.out.println("Tempo de ordenar usando Radix Sort: " + tempo_segundos4 + " segundos");

        // selection sort

        int [] v_copia6 = new int[v.length];
        v_copia6 = Vetores.copiarInt(v);
        long tempo_inicio5 = Tempo.medirTempoIniciar();

        Vetores.ordenarSelectorSort(v_copia6);
        double tempo_segundos5 = Tempo.medirTempoFinalizarSegundos(tempo_inicio5);
        System.out.println("Tempo de ordenar usando Selection Sort: " + tempo_segundos5 + " segundos");
        


    }

    public static void ex05(){

        int [] v = new int[1000000];

        v = Vetores.gerarValoresAleatorios(1000000, 0, 10000000);

        int [] v_copia1 = new int[v.length];
        v_copia1 = Vetores.copiarInt(v);

        //bubble

        long tempo_inicio = Tempo.medirTempoIniciar();
        Vetores.ordenarBubbleSort(v_copia1);
        double tempo_segundos = Tempo.medirTempoFinalizarSegundos(tempo_inicio);

        System.out.println("Tempo de ordenar usando Bubble Sort: " + tempo_segundos + " segundos");

        // Insertion

        int [] v_copia2 = new int[v.length];
        v_copia2 = Vetores.copiarInt(v);

        long tempo_inicio1 = Tempo.medirTempoIniciar();
        Vetores.ordenarInsertionSort(v_copia2);
        double tempo_segundos1 = Tempo.medirTempoFinalizarSegundos(tempo_inicio1);

        System.out.println("Tempo de ordenar usando Insertion Sort: " + tempo_segundos1 + " segundos");

        // Quick Sort

        int [] v_copia3 = new int[v.length];
        v_copia3 = Vetores.copiarInt(v);

        long tempo_inicio2 = Tempo.medirTempoIniciar();
        Vetores.quickSort(v_copia3, 0, v_copia3.length-1);
        double tempo_segundos2 = Tempo.medirTempoFinalizarSegundos(tempo_inicio2);

        System.out.println("Tempo de ordenar usando Quick Sort: " + tempo_segundos2 + " segundos");

        // Merge Sort

        int [] v_copia4 = new int[v.length];
        v_copia4 = Vetores.copiarInt(v);

        long tempo_inicio3 = Tempo.medirTempoIniciar();
        Vetores.mergeSort(v_copia4);
        double tempo_segundos3 = Tempo.medirTempoFinalizarSegundos(tempo_inicio3);
        System.out.println("Tempo de ordenar usando Merge Sort: " + tempo_segundos3 + " segundos");

        // radix sort

        int [] v_copia5 = new int[v.length];
        v_copia5 = Vetores.copiarInt(v);
        long tempo_inicio4 = Tempo.medirTempoIniciar();
        Vetores.radixSort(v_copia5);
        double tempo_segundos4 = Tempo.medirTempoFinalizarSegundos(tempo_inicio4);
        System.out.println("Tempo de ordenar usando Radix Sort: " + tempo_segundos4 + " segundos");

        // selection sort

        int [] v_copia6 = new int[v.length];
        v_copia6 = Vetores.copiarInt(v);
        long tempo_inicio5 = Tempo.medirTempoIniciar();

        Vetores.ordenarSelectorSort(v_copia6);
        double tempo_segundos5 = Tempo.medirTempoFinalizarSegundos(tempo_inicio5);
        System.out.println("Tempo de ordenar usando Selection Sort: " + tempo_segundos5 + " segundos");
        


    }

    public static void ex06(){

        int [] v = new int[10000000];

        v = Vetores.gerarValoresAleatorios(10000000, 0, 10000000);

        int [] v_copia1 = new int[v.length];
        v_copia1 = Vetores.copiarInt(v);

        //bubble

        // long tempo_inicio = Tempo.medirTempoIniciar();
        // Vetores.ordenarBubbleSort(v_copia1);
        // double tempo_segundos = Tempo.medirTempoFinalizarSegundos(tempo_inicio);

        // System.out.println("Tempo de ordenar usando Bubble Sort: " + tempo_segundos + " segundos");

        // Insertion

        // int [] v_copia2 = new int[v.length];
        // v_copia2 = Vetores.copiarInt(v);

        // long tempo_inicio1 = Tempo.medirTempoIniciar();
        // Vetores.ordenarInsertionSort(v_copia2);
        // double tempo_segundos1 = Tempo.medirTempoFinalizarSegundos(tempo_inicio1);

        // System.out.println("Tempo de ordenar usando Insertion Sort: " + tempo_segundos1 + " segundos");

        // Quick Sort

        int [] v_copia3 = new int[v.length];
        v_copia3 = Vetores.copiarInt(v);

        long tempo_inicio2 = Tempo.medirTempoIniciar();
        Vetores.quickSort(v_copia3, 0, v_copia3.length-1);
        double tempo_segundos2 = Tempo.medirTempoFinalizarSegundos(tempo_inicio2);

        System.out.println("Tempo de ordenar usando Quick Sort: " + tempo_segundos2 + " segundos");

        // Merge Sort

        int [] v_copia4 = new int[v.length];
        v_copia4 = Vetores.copiarInt(v);

        long tempo_inicio3 = Tempo.medirTempoIniciar();
        Vetores.mergeSort(v_copia4);
        double tempo_segundos3 = Tempo.medirTempoFinalizarSegundos(tempo_inicio3);
        System.out.println("Tempo de ordenar usando Merge Sort: " + tempo_segundos3 + " segundos");

        // radix sort

        int [] v_copia5 = new int[v.length];
        v_copia5 = Vetores.copiarInt(v);
        long tempo_inicio4 = Tempo.medirTempoIniciar();
        Vetores.radixSort(v_copia5);
        double tempo_segundos4 = Tempo.medirTempoFinalizarSegundos(tempo_inicio4);
        System.out.println("Tempo de ordenar usando Radix Sort: " + tempo_segundos4 + " segundos");

        // selection sort

        // int [] v_copia6 = new int[v.length];
        // v_copia6 = Vetores.copiarInt(v);
        // long tempo_inicio5 = Tempo.medirTempoIniciar();

        // Vetores.ordenarSelectorSort(v_copia6);
        // double tempo_segundos5 = Tempo.medirTempoFinalizarSegundos(tempo_inicio5);
        // System.out.println("Tempo de ordenar usando Selection Sort: " + tempo_segundos5 + " segundos");
        


    }






}
