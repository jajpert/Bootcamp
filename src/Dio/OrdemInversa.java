package Dio;

/*
Crie um vetor de 6 números inteiros e
mostre-os na ordem inversa
*/

public class OrdemInversa {
    public static void main(String[] args) {

        int[] vetor = {0, 5, -3, 60, 27};
        int count = 0;

        while(count <= (vetor.length - 1)) {
            System.out.println(vetor[count]);
            count += 1;
        }

        System.out.println("\nVetor inverso: ");
        for(int i = (vetor.length - 1); i >= 0; i -= 1) {
            System.out.println(vetor[i] + " ");
        }
    }
}
