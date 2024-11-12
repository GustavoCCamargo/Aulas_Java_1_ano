package aulas;

import java.util.Hashtable;

public class Aula35{

    public static void aula() {
        System.out.println("Aula 35 - HASH TABLE ");
        ex03();
        
    }

    public static void ex01(){
        Hashtable <String, Integer> tabela = new Hashtable<>();

        tabela.put("batata", 10);
        tabela.put("carne", 15);
        tabela.put("monster", 12);

        for(String posicao : tabela.keySet()){
            System.out.printf("[%s] %d\n",posicao, tabela.get(posicao));
        }
    }

    public static void ex02(){
        String msg = "hoje e um dia apos ontem hoje tambem e um dia antes de amanha hoje nao e ontem nem amanha";

        String[] palavras = msg.split(" ");
        String palavra;
        int i;



        Hashtable<String, Integer> contador = new Hashtable<>();

        for(i=0; i<palavras.length;i++){
            System.out.println(palavras[i]);
            palavra = palavras[i];

            if(contador.containsKey(palavra)){
                contador.put(palavra,contador.get(palavra)+1);
            }else{
                contador.put(palavra, 1);
            }
        }



    }

    public static void ex03(){
        System.out.println("Vetor esparso");
        
        int [] vetor = {0,2,0,0,0,01,2,3,4,5,1,10,122,24,53};
        int i;

        Hashtable<Integer, Integer> vetor_esparso = new Hashtable<>();

        for(i=0; i<vetor.length;i++){
            if (vetor[i] !=0) {
                vetor_esparso.put(i,vetor[i]);
            }
        }

        for(i = 0; i<vetor.length;i++){
            System.err.printf("[%d] - %d - %d\n",i,vetor[i], vetorEsparso(vetor_esparso, i));
        }
    }

    public static int vetorEsparso(Hashtable<Integer,Integer> vetor_esparso, int posicao){
        if (vetor_esparso.containsKey(posicao)) {
            return vetor_esparso.get(posicao);
        }

        return 0;

    }
}
