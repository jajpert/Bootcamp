package Dio;

/*
Desenvolva um gerador de tabuada, capaz de gerar
qualquer tabuada de qualquer número inteiro entre
1 e 10. O usuário deve informar de qual numero ele
deseja ver a tabuada.
*/

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Tabuada: ");
        int tabuada = scan.nextInt();

        System.out.println("Tabuada de " + tabuada);

        for(int i = 1; i <= 10; i += 1) {
            System.out.println(tabuada + " x " + i + " = " + (tabuada * i));
        }
    }
}
