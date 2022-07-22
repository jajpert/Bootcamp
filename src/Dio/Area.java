package Dio;

public class Area {

    public static void quadrilateros(double lado) {

        System.out.println("Área do quadrado: " + lado * lado );
    }

    public static void quadrilateros(double lado1, double lado2) {

        System.out.println("Área do retângulo: " + lado1 * lado2);
    }

    public static void quadrilateros(double baseMaior, double baseMenor, double altura) {

        System.out.println("Área do trapézio: " + ((baseMaior + baseMenor) * altura) / 2);
    }

    public static void main(String[] args) {

        System.out.println("Exercício área");
        Area.quadrilateros(4);
        Area.quadrilateros(8, 3);
        Area.quadrilateros(16, 16, 2);
    }

}
