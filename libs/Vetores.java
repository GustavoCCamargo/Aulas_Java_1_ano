package libs;

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
}
