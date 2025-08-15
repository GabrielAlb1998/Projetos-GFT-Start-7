import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        //Escreva um código que receba a base e a alturade um retângulo, calcule sua área e exiba na tela.
        //fórmula: área=base X altura

        System.out.println("\nQual o tamanho da base do retângulo?");
        var base = scanner.nextFloat();
        System.out.println("\nQual a altura do retângulo?");
        var height = scanner.nextFloat();
        Float area1 = base * height;
        System.out.printf("A área do quadrado é %s", area1);


    }
}