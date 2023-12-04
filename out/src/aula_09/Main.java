package out.src.aula_09;

import java.time.LocalDate;

public class Main {
  public static void main(String[] args){

    Produto lampada = new Produto();  //Instanciar um objeto lampada
    lampada.codigo = "1231231233";
    lampada.descricao = "Lampada Super lampada 1200w 500 horas de uso"; //Descrição do produto 
    lampada.nome = "Lampada Super"; // Nome do produto
    lampada.preco = 1200; //Preço
    lampada.disponibilidade = true; //Disponibilidade 


    Produto panela = new Produto(); //Instanciar um objeto panela
    panela.codigo = "1231231234";
    panela.descricao = "Panela 1200w 500 horas de uso"; //Descrição do produto
    panela.nome = "Panela tramontiners 20L"; // Nome do produto
    panela.preco = 1200; //Preço
    panela.disponibilidade = false; //Disponibilidade

    System.out.println(lampada.nome);
    System.out.println(panela.nome);

    double total = lampada.preco + panela.preco;
    System.out.println("Total" + total);

    Usuario david = new Usuario(); //Instanciar um objeto usuario
    david.nome = "David Lucas"; //Nome do usuario
    david.email = "hzdkv@example.com"; //Email do usuario
    david.senha = "<PASSWORD>"; //Senha do usuario
    david.dataNascimento = LocalDate.parse("2000-04-11"); //Data Nascimento
    david.endereco = new Endereco(); //Instanciar um objeto endereço
    david.endereco.rua = "Rua 1"; //Rua
    david.endereco.numero = "123"; //Número
    david.endereco.bairro = "Centro"; //Bairro
    david.endereco.cidade = "Guarulhos"; //Cidade
    david.endereco.estado = "SP"; //Estado
    david.endereco.cep = "12345678"; //CEP

  }
}
