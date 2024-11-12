package aulas;
import libs.Vetores;
import libs.Tempo
;
public class Aula32 {
    public static void aula(){
        System.out.println("Aula de Busca!!");
        //ex04();
    }

    public static void ex01(){
        int i = 4;
        int result =0;
        int [] vet = {1,4,5,6,7,2,8,9,3};

        result = Vetores.BuscaSequencial(i, vet);
        System.out.println(result);
    }

    public static void ex02(){
       
        int [] vet =  Vetores.gerarValoresAleatorios(100000000, 0, 1000000);
        int x =-1;
        int pos;
        long tempo_inicio = Tempo.medirTempoIniciar();
        pos = Vetores.BuscaSequencial(x,vet);
        double tempo_segundos = Tempo.medirTempoFinalizarSegundos(tempo_inicio);

        if (pos !=-1) {
            System.out.println("Valor encontrado na posição "+pos);
        }
        if (pos == -1) {
            System.out.println("Valor não encontrado");
        }

        System.out.printf("Tempode de busca sequencial com %d elementos %f segundos\n", vet.length, tempo_segundos);
    }

    public static void ex03(){
       
        int [] vet =  Vetores.gerarValoresAleatorios(100000000, 0, 1000000);
        int x =-1;
        int pos;
        double tempo = 0;

        for(int i = 0; i<10; i++){
            long tempo_inicio = Tempo.medirTempoIniciar();
            pos = Vetores.BuscaSequencial(x,vet);
            tempo += Tempo.medirTempoFinalizarSegundos(tempo_inicio);
        }

        System.out.println("Tempo total = " + tempo);
        
    }

    // public static void ex04(){
       
    //     int [] vet =  Vetores.gerarValoresAleatoriosOrdenado(500000000, 0, 10000000);
    //     int x =3000800;
    //    // int pos, poss;

    //     long tempo_inici = Tempo.medirTempoIniciar();
    //     pos = Vetores.BuscaSequencial(x,vet);
    //     double tempo_segundos = Tempo.medirTempoFinalizarSegundos(tempo_inici);

    //     //busca binária
    //     long tempo_inicio = Tempo.medirTempoIniciar();
    //     poss = Vetores.BuscaBinaria(x,vet);
    //     double tempo_segundo = Tempo.medirTempoFinalizarSegundos(tempo_inicio);

    //     System.out.printf("Tempode de busca sequencial com %d elementos %f segundos\n", vet.length, tempo_segundos);
    //     System.out.printf("Tempode de busca Binária com %d elementos %f segundos\n", vet.length, tempo_segundo);
    // }


}
