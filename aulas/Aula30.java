package aulas;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.File;

public class Aula30 {

    public static void aula(){

        System.out.println("Aula de Arquivos!!");
       // ex01();//criação de arquivos
        ex02();
        
    }

    public static void ex01() {
        String nome_arquivo = "numeros.txt";

        try{

            FileWriter arquivo = new FileWriter(nome_arquivo);

            arquivo.write("Algoritmos.\n"); //Escreve pro arquivo!!

            for(int i = 0; i<10; i++){
                arquivo.write(i + "\n");
            }

            arquivo.close();

        }catch(Exception e){
            System.out.println("Erro.");
            System.err.println(e);
        }
    }

    public static void ex02() {

        String nome_arquivo = "exemplo.txt";
      
        try {

            File arquivo = new File(nome_arquivo);
            Scanner entrada = new Scanner(arquivo);

            String nome = entrada.next();
            System.out.println(nome);
            
            entrada.close();
            
        } catch (Exception e) {
            System.out.println("Erro.");
            System.err.println(e);
        }
    }
    
}
