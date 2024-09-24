package libs;

import java.util.Random;
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

    

    public static char lerCaracter(){
        return entrada.next().charAt(0);
    }

    public static char lerCaracter(String mensagem){
        System.out.println(mensagem);
        return entrada.next().charAt(0);
    }

    public static String lerString(){
        return entrada.nextLine();
    }

    public static String lerStringMsg(String mensagem){
        System.out.println(mensagem);
        return entrada.nextLine();
    }

    public static int sorteio(int a , int b){
        
      return new Random().nextInt(b) + a;
    }


}
