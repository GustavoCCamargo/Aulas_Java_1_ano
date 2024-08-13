package libs;

public class Matematica {
    public static int menor(int a, int b){
        if(a<b){
            return a;
        }

        return b;
    }

    public static int maior(int a, int b){
        if (a>b){
            return a;
        }

        return b;
    }

    public static int fatorial(int n){
        int i = n, resultado=1;
        for(i = n; i >0; i-- ){
            resultado *=i;
        }

        return resultado;
    }
    
}


