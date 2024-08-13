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

    public static boolean ehDivisor(int a, int b){
        return (a % b == 0);
    }

    public static boolean ehPerfeito(int n){
        int i, soma=0;
        for(i = 1; i < n; i++){
            if(n % i == 0){
                soma += i;
        }
     }
     return (soma == n);
    }

    public static boolean ehPrimo(int n){
        if(n <= 1){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static int fibonacci(int n){
        if (n == 1 || n == 2) {
            return 1;
        }else{
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }

    public static void mostrarTabuada(int n){
        for(int i = 1; i <= 10; i++){
            System.out.println(n+" x "+i+" = "+(n*i));
        }
    }

    public static void mostrarKPrimeirosPrimos(int n){
        int count = 0, num = 2;
        while(count < n){
            if(ehPrimo(num)){
                System.out.println(num);
                count++;
            }
            num++;
        }
    }

    public static void mostrarKPrimeirosFibonacci(int n){
        int count = 0, num = 1;
        while(count < n){
            System.out.println(num);
            count++;
            num = fibonacci(count);
        }
    }

    public static void mostrarPerfeitosIntervalo (int a, int b){
        for(int i = a; i <= b; i++){
            if(ehPerfeito(i)){
                System.out.println(i);
            }
        }
    }
   
}


