package out.src.BCUNIVERSIA;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Humano h1 = new Humano();
        h1.nome = "Ukinhas";
        h1.sobrenome = "Lindinhos";
        h1.altura = 1.75;
        h1.peso = 70;
        h1.dataNascimento = LocalDate.of(1990, 1, 1);
        h1.seApresentar();
        h1.mostrarInt();  // Corrigido para chamar mostrarInt() em vez de mostrarInc()
/////////////////////////////////////////////////////////////////////////////////////////////
        Humano pessoa = new Humano();
        pessoa.nome = "David";
        pessoa.sobrenome = "Lucas";

        // Chamando o método seApresentar da classe Humano
        pessoa.seApresentar();

        // Chamando o método obterNomeCompleto da classe Humano
        String nomeCompleto = pessoa.obterNomeCompleto();
        System.out.println("Nome completo: " + nomeCompleto); 
////////////////////////////////////////////////////////////////////////////////////////
        
    }
}
