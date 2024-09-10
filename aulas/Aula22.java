package aulas;

public class Aula22 {
    public static String corvertePosParaMaiscu(String entrada, int i){
        String retorno;
        retorno = entrada.substring(0, i) + entrada.toUpperCase().charAt(i) + entrada.substring(i+1 , entrada.length());
        return retorno;
      }

      public static int obterPosicaoProxChar(String entrada, int pos, char c){
        int pos_caracter = -1;
        while (pos< entrada.length()) {
            if (entrada.charAt(pos) == c) {
                pos_caracter = pos;
                return pos_caracter;
            }
            pos++;
            
        }

      return pos_caracter;
        
      }

      public static String tiraCaracter(String entrada, char c){
        
       String copy = "";

        for(int i=0; i<entrada.length(); i++){

           if (c != entrada.charAt(i)) {
            copy += entrada.charAt(i);
            
           }
        }

        return copy;
      }

       public static void aula(){
    
       System.out.println("-- Algoritmos e Estruturas de Dados --");
       //Aula21.aula();
       String st1;
       
       char c = 'o';
    
       st1= "Algoritmos";

       System.out.println(tiraCaracter(st1,c));
    
     }
}
