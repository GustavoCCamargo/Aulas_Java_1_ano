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

        int [] vet = new int[b-a];
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
        

        if (b<a) {
            return vetor;
        }

        for(int i = a; i<b; i++){

            vet[index] = v[i];
            index++;

        }

        return vet;

     }
    
}
