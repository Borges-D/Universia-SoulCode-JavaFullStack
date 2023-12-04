// Arquivo: Humano.java
package out.src.BCUNIVERSIA;

import java.time.LocalDate;

public class Humano {
    String nome; // Humano
    String sobrenome; // Humano
    LocalDate dataNascimento; // Data de nascimento
    double altura; // Double é: peso / (altura * altura)
    double peso; // Double é: peso

    void seApresentar() {
        System.out.println("Olá, me chame " + nome + " " + sobrenome);
    }
////////////////////////////////////////////////////////////////////////////////////////
    void mostrarInt() {
        // IMC = ÍNDICE DE MASSA CORPORAL (PESO / ALTURA * ALTURA)
        double imc = peso / (altura * altura);
        System.out.println("Seu IMC é: " + imc);
    }

    String obterNomeCompleto() {
        return nome + " " + sobrenome;
    }
}
