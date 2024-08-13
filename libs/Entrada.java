package libs;

import java.util.Scanner;

public class Entrada {
    public static Scanner entrada;

    public static void abrir(){
        entrada = new Scanner(System.in);
    }

    public static void Fechar() {
        entrada.close();        
    }

    public static int LerIntMsg(String msg){
        System.out.println(msg);
        return entrada.nextInt();
    }

    public static int LerInt(){
        return entrada.nextInt();
    }

    public static double LerDoubleMsg(String msg){
        System.out.println(msg);
        return entrada.nextDouble();
    }

    public static double LerDouble(){
        return entrada.nextDouble();
    }


}
