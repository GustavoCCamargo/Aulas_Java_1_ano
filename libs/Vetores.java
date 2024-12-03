package libs;
import java.util.Arrays;
import java.util.Random;
public class Vetores {


    
    public static int[] alocarInteiros(int n) {

        int [] vet = new int[n];


        for(int i = 0 ; i<vet.length;i++){
            vet[i]=0;
        }
    
        return vet;
    }

    public static float[] alocarReais(int n) {

        float [] vet = new float[n];


        for(int i = 0 ; i<vet.length;i++){
            vet[i]= (float) 0.0;
        }
    
        return vet;
    }


    public static boolean[] alocarLogicos(int n) {

        boolean [] vet = new boolean[n];


        for(int i = 0 ; i<vet.length;i++){
            vet[i]= (boolean) false;
        }
    
        return vet;
    }

    public static char[] alocarCaracteres(int n) {

        char [] vet = new char[n];


        for(int i = 0 ; i<vet.length;i++){
            vet[i]= '\0';
        }
    
        return vet;
    }

    public static String[] alocarCadeiaCaracteres(int n) {

        String [] vet = new String[n];


        for(int i = 0 ; i<vet.length;i++){
            vet[i]= " ";
        }
    
        return vet;
    }

    public static void mostrarInteiros(int[] v){

        int i;

        System.out.print("{");

        for(i = 0; i<v.length;i++){
            
            

            if (i < v.length-1) {
                System.out.print(v[i]+ ", ");
            }else{
                System.out.print(v[i]);
            }

        }

        System.out.print("}");

        System.out.println(" ");

    }

    public static void mostrarReais(float[] v){

        int i;

        System.out.print("{");

        for(i = 0; i<v.length;i++){
            
            

            if (i < v.length-1) {
                System.out.print(v[i]+ ", ");
            }else{
                System.out.print(v[i]);
            }

        }

        System.out.print("}");

        System.out.println(" ");

    }

    public static void mostrarlogico(boolean[] v){

        int i;

        System.out.print("{");

        for(i = 0; i<v.length;i++){
            
            

            if (i < v.length-1) {
                System.out.print(v[i]+ ", ");
            }else{
                System.out.print(v[i]);
            }

        }

        System.out.print("}");

        System.out.println(" ");

    }

    public static void mostrarCaracteres(char[] v){

        int i;

        System.out.print("{");

        for(i = 0; i<v.length;i++){
            
            

            if (i < v.length-1) {
                System.out.print(v[i]+ ", ");
            }else{
                System.out.print(v[i]);
            }

        }

        System.out.print("}");

        System.out.println(" ");

    }

    public static void mostrarCadeiaCaracteres(String[] v){

        int i;

        System.out.print("{");

        for(i = 0; i<v.length;i++){
            
            

            if (i < v.length-1) {
                System.out.print(v[i]+ ", ");
            }else{
                System.out.print(v[i]);
            }

        }

        System.out.print("}");

        System.out.println(" ");

    }


     public static int[] subVetor(int [] v, int a, int b){

        
        int [] vetor = new int[0];
        int index = 0;

        if (a <0  ) {
            a = 0;    
        }

        if (a >=v.length  ) {
            a = v.length;    
        }

        if (b< 0 ) {
            b= 0;
        }

        if (b >= v.length) {
            b = v.length;
        }

        int [] vet = new int[b-a];
        

        if (b<a) {
            return vetor;
        }

        for(int i = a; i<b; i++){

            vet[index] = v[i];
            index++;

        }

        return vet;

     }


     public static int[] copiarInt(int [] v){
        int [] vetor = new int[v.length];

        for(int i = 0; i<v.length; i++){
            vetor[i] = v[i];
        }

        return vetor;
     }

     public static float[] copiarReais(float[] v){
        float [] vetor = new float[v.length];

        for(int i = 0; i<v.length; i++){
            vetor[i] = v[i];
        }

        return vetor;
     }

     public static String[] copiarString(String[] v){
        String [] vetor = new String[v.length];

        for(int i = 0; i<v.length; i++){
            vetor[i] = v[i];
        }

        return vetor;
     }

     public static Boolean [] copiarBoolean(Boolean[] v){
        Boolean [] vetor = new Boolean[v.length];

        for(int i = 0; i<v.length; i++){
            vetor[i] = v[i];
        }

        return vetor;
     }

     public static int[] lerInteiros(int n){
        int [] vet = new int[n];

        Entrada.abrir();
        
        System.out.println("DIGITE OS VALORES!");

        for(int i = 0 ; i<vet.length; i++){

            vet [i] = Entrada.LerInt();
        }

        return vet;
     }

     public static double[] lerReais(int n){
        double [] vet = new double[n];

        Entrada.abrir();
        
        System.out.println("DIGITE OS VALORES!");

        for(int i = 0 ; i<vet.length; i++){

            vet [i] = Entrada.LerDouble();
        }

        return vet;
     }


     public static char[] lerCaracteres(int n){
        char [] vet = new char[n];

        Entrada.abrir();
        
        System.out.println("DIGITE OS CARACTERES!");

        for(int i = 0 ; i<vet.length; i++){

            vet [i] = Entrada.lerCaracter();
        }

        return vet;
     }

     public static String[] lerStrings(int n){
        String [] vet = new String[n];

        Entrada.abrir();
        
        System.out.println("DIGITE AS STRINGS!");

        for(int i = 0 ; i<vet.length; i++){

            vet [i] = Entrada.lerString();
        }

        return vet;

     }


     public static int obterPosicaoInteiro(int [] v, int valor_buscar, int valor_pos_inicial){

        for(int i = valor_pos_inicial; i<v.length;i++){

            if (v[i] == valor_buscar) {
                return i;
            }

        }

        return -1;
    }


    public static int obterPosicaoReal(double [] v, int valor_buscar, int valor_pos_inicial){

        for(int i = valor_pos_inicial; i<v.length;i++){

            if (v[i] == valor_buscar) {
                return i;
            }

        }

        return -1;
    }

    public static int obterPosicaoCaracteres(char [] v, char valor_buscar, int valor_pos_inicial){

        for(int i = valor_pos_inicial; i<v.length;i++){

            if (v[i] == valor_buscar) {
                return i;
            }

        }

        return -1;
    }


    public static int obterPosicaoLogico(boolean [] v, boolean valor_buscar, int valor_pos_inicial){

        for(int i = valor_pos_inicial; i<v.length;i++){

            if (v[i] == valor_buscar) {
                return i;
            }

        }

        return -1;
    }


    public static int obterPosicaoCadeiaDeCaracteres(String [] v, String valor_buscar, int valor_pos_inicial){

        for(int i = valor_pos_inicial; i<v.length;i++){

            if (v[i] == valor_buscar) {
                return i;
            }

        }

        return -1;
    }

    public static int[] obterIndicesInteiros(int[] v , int valor_buscar){
        int cont=0, index = 0;


        for(int i = 0; i<v.length;i++){
            if (v[i] == valor_buscar) {
                cont++;
            }
        }

        
        int [] vetor = new int[cont];

        if (cont == 0) {
            return vetor;
        }

        for(int i = 0; i<v.length;i++){
            if (v[i] == valor_buscar) {
                vetor[index] = i;
                index ++;  
            }
        }


        return vetor;
        
    }    

    public static int [] retiraRepeticaoInt(int [] vet) {
        int [] vet_conjunto = new int[vet.length];
        int Index = 0;

       
        for(int i = 0; i<vet_conjunto.length;i++){

            for(int j = i;j<vet.length;j++){

                for(int c = 0; c<vet_conjunto.length;c++){
                    if (vet[j] == vet_conjunto[c]) {
                        break;
                    }

                    if (c == vet_conjunto.length-1) {
                        vet_conjunto[Index] = vet[j];
                        Index++;
                    }
                }
               
            }
            
        }

        int [] vet_final = new int[Index];

        for(int i = 0; i<Index; i++){
            vet_final [i] = vet_conjunto[i];
        }

    
        return vet_final;
    }


    public static int BuscaSequencial(int n, int [] vet){

        for(int i =0; i<vet.length;i++){
            if (vet[i] == n) {
               return i;
            }
        }

        return -1;

    }

  


    public static int[] gerarValoresAleatorios(int n, int valor_min, int valor_max) {
        Random random = new Random();
        int[] vetor = new int[n];

         for (int i = 0; i < n; i++) {
             // Gera um número aleatório entre min (inclusivo) e max (inclusivo),
                //   e salva na posição i do vetor
            vetor[i] = random.nextInt(valor_max - valor_min + 1) + valor_min;
        }
            
        return vetor;
    }
     
    public static int[] gerarValoresAleatoriosOrdenado(int n, int valor_min, int valor_max) {

        //Obtém um vetor de valores aleatórios
        int[] vetor = gerarValoresAleatorios(n, valor_min, valor_max);

        // Ordena o vetor antes de retornar
        Arrays.sort(vetor);

        return vetor;
    }

    public static int BuscaBinaria(int n, int [] vet){

        int ini, fim, meio;

        ini = 0;
        fim = vet.length;

        while(ini <= fim){
            meio = (ini + fim) /2;

            if (vet[meio] == n) {
                return meio;
            }else{
                if (n < vet[meio]) {
                    fim = meio-1;
                }else{
                    ini = meio +1;
                }
            }
        }

        return -1;

    }

    public static int[] troca(int[] v, int i, int j){
        int temp = v[i];
        v[i] = v[j];
        v[j] = temp;

        return v;
    }

    public static void ordenarInsertionSort(int[] v){
        int i, j;

        for(i = 1; i<v.length; i++){
            
            j = i ;
            while (j>0 && v[j-1] > v[j]){ {
                v = troca(v,j,j-1);
                j--;
            }

        }
    
    }
    }

    public static void ordenarSelectorSort(int[] v){

        int i, j, menor_val, menor_pos;

        for (i = 0; i < v.length-1; i++){
            menor_val = v[i];
            menor_pos = i;

            for (j = i+1; j < v.length; j++){
                if (v[j] < menor_val){
                    menor_val = v[j];
                    menor_pos = j;
                }
            }

            Vetores.troca(v, i, menor_pos);
        }


    }

    public static void ordenarBubbleSort(int[] v){
        int i, j, troca;

        for (i = 0; i < v.length-1; i++){
            troca = 0;

            for (j = 0; j < v.length-1-i; j++){
                if (v[j] > v[j+1]){
                    Vetores.troca(v, j, j+1);
                    troca = 1;
                }
            }

            if (troca == 0) {
                break;
            }
        }

    }

    public static int[] merge(int[] va, int[] vb){
        int i=0,j=0,k =0;
        int [] vc = new int[va.length+vb.length];

        while(i<va.length && j<vb.length){
            if(va[i] < vb[j]){
                vc[k] = va[i];
                i++;
            }else{
                vc[k] = vb[j];
                j++;
            }
            k++;
        }
        while(i<va.length){
            vc[k] = va[i];
            i++;
            k++;
        }

        while(j<vb.length){
            vc[k] = vb[j];
            j++;
            k++;
        }
     return vc;
    }

    public static int[] subVetores(int[] v, int ini, int fim){

        int i, k=0;

        int [] sub_vet = new int[fim-ini];

        for(i = ini; i< fim; i++){
            sub_vet[k] = v[i];
            k++;
        }

        return sub_vet;
    }

    public static int[] mergeSort(int [] v){

        int [ ] ve_esquerdaOrdenado, ve_direitaOrdenado, v_oredenado;

        if(v.length <= 1) {
            return v;
        } 

        int [] vet_squerd, vet_direita;
        int meio;

        meio = v.length/2;

        vet_squerd = subVetores(v, 0, meio);
        vet_direita = subVetores(v, meio, v.length);

        mergeSort(vet_squerd);
        mergeSort(vet_direita);
        
        ve_esquerdaOrdenado = mergeSort(vet_squerd);
        ve_direitaOrdenado = mergeSort(vet_direita);

        v_oredenado = merge(ve_esquerdaOrdenado, ve_direitaOrdenado);

        return v_oredenado;
    }


    public static int particionar(int[] v, int inicio, int fim) {
        int pivot = v[fim - 1];
        int i = inicio - 1;

        for (int j = inicio; j < fim; j++) {
            if (v[j] < pivot) {
                i++;
                troca(v, i, j);
            }
        }

        troca(v, i + 1, fim - 1);

        return i + 1;
    }

    public static void quickSort(int[] v, int inicio, int fim) {
        if (inicio < fim) {
            int pos_pivot = particionar(v, inicio, fim);
            quickSort(v, inicio, pos_pivot);
            quickSort(v, pos_pivot + 1, fim);
        }

    }

    public static int obterDigito(int x, int k){
        return (x%(int) Math.pow(10, k))/(int) Math.pow(10, k-1)%10;
    }

    public static int[] ordenarCountingSort(int[] v) {

        int[] contador = new int[10];
        int[] contador_acumulado = new int[10];
        int[] resultado = new int[v.length];



        for (int i = 0; i < v.length; i++) {
            contador[v[i]]++;
        }

        for (int i = 1; i < contador.length; i++) {
            contador_acumulado[i] = contador[i-1] + contador_acumulado[i-1];
        }

        for (int i = 0; i < v.length; i++) {
            resultado[contador_acumulado[v[i]]++] = v[i];
        }

        return resultado;
    }

    public static int[] countinGSort(int[] v, int k) {

        int[] cont = new int[10];
        int[] contador_acumulado = new int[10];
        int[] resultado = new int[v.length];
        int  p = 0; 



        for (int i = 0; i < resultado.length; i++) {
            p = obterDigito(v[i], k);
            cont[p]++;
        }

        for (int i = 1; i < cont.length; i++) {
            contador_acumulado[i] = cont[i-1] + contador_acumulado[i-1];
        }

        for (int i = 0; i < v.length; i++) {
            p = obterDigito(v[i], k);
            resultado[contador_acumulado[p]++] = v[i];
        }

        return resultado;
    }


    
    public  static int maiorValorVetor(int [] a){

        int maior_valor = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] > maior_valor) {
                maior_valor = a[i];
            }
        }

        return maior_valor;
    }

    public static int [] radixSort(int [] v){
      
        int maior_valor = Vetores.maiorValorVetor(v);
        int k = 1;

        while(maior_valor > Math.pow(10, k)){
          k++;
        }


        for(int i = 1; i<=k; i++){
            v = countinGSort(v, i);
        }

        //v = countingSort(v, 1);
        //v = countingSort(v, 2);
        
        return v;
    }

}
