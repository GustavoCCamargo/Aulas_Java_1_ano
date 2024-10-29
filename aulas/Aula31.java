package aulas;
import libs.Entrada;


class Pessoa{

    String nome, email, dataNascimento;
    Endereco endereco = new Endereco();

}

class Endereco{
    String rua, cidade, estado, pais, CEP;
    int numero;
}


public class Aula31 {
    
    public static void aula() {
        System.out.println("Aula de Registros!!!");

        listaTelefonica(3);
    }


    public static void ex01(){

        Entrada.abrir();
        Pessoa pessoa = new Pessoa();

        pessoa.nome = Entrada.lerStringMsg("Digite o nome: ");
        pessoa.email = Entrada.lerStringMsg("Digite o email: ");
        pessoa.dataNascimento = Entrada.lerStringMsg("Digite a data de nascimento: ");

        pessoa.endereco.numero = 390;  
        pessoa.endereco.cidade = "Cascavel";  
        pessoa.endereco.estado = "Paraná";  
        pessoa.endereco.pais = "Brasil";  
        pessoa.endereco.CEP = "85-815390";  
        pessoa.endereco.rua = "Ciro Monteiro";  

        mostrarPessoa(pessoa);

    }

    public static void listaTelefonica(int n){
        Pessoa [] listaPessoas = new Pessoa[n];
        Entrada.abrir();
        for(int i = 0; i<listaPessoas.length;i++){

            listaPessoas[i] =new Pessoa();
            listaPessoas[i].nome = Entrada.lerStringMsg("Digite o nome: ");
            listaPessoas[i].email = Entrada.lerStringMsg("Digite o email: ");
            listaPessoas[i].dataNascimento = Entrada.lerStringMsg("Digite a data de nascimento: ");

            listaPessoas[i].endereco.numero = Entrada.LerIntMsg("Digite o número da casa: ");  
            listaPessoas[i].endereco.cidade = Entrada.lerStringMsg("Digite a cidade: "); 
            listaPessoas[i].endereco.estado = Entrada.lerStringMsg("Digite o estado: ");
            listaPessoas[i].endereco.pais = Entrada.lerStringMsg("Digite o país: "); 
            listaPessoas[i].endereco.CEP = Entrada.lerStringMsg("Digite o CEP: ");  
            listaPessoas[i].endereco.rua = Entrada.lerStringMsg("Digite a rua: "); 
         
            
        }

        for(int i = 0; i<listaPessoas.length;i++){
         
            mostrarPessoa(listaPessoas[i]);

            System.out.println("---------------------------------------");
        }

        Entrada.Fechar();
    } 

 

    public static void mostrarPessoa(Pessoa p){
        System.out.println("Nome: " +p.nome);
        System.out.println("Email: " +p.email);
        System.out.println("Cidade: " +p.endereco.cidade);
        System.out.println("Estado: " +p.endereco.estado);
        System.out.println("País: " +p.endereco.pais);
        System.out.println("CEP: " +p.endereco.CEP);
        System.out.println("Rua: " +p.endereco.rua);
        System.out.println("Numero da casa : " +p.endereco.numero);

    }

}

