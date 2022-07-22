package Dio;

/*

    Classe principal dos exercício da aula de métodos

*/
public class Main {

    public static void main(String[] args) {

        // Calculadora

        System.out.println("Exercício calculadora");
        Calculadora.soma(3, 7);
        Calculadora.subtracao(20, 5);
        Calculadora.multiplicacao(4, 5);
        Calculadora.divisao(125, 5);


        // Mensagem

        System.out.println("Exercício mensagem");
        Mensagem.obterMensagem(20);
        Mensagem.obterMensagem(13);
        Mensagem.obterMensagem(6);


        // Empréstimo

        System.out.println("Exercício empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);
    }

}