
import java.util.Scanner;

public class Exercicio3{
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        //Escreva um código que receba o tamanho do lado de um quadrado, calcule sua área e exiba na tela
        //fórmula: área=lado X lado

        System.out.println("\nQual tamanho da base?");
        var base = scanner.nextFloat();
        System.out.println("\nQual a altura?");
        var height = scanner.nextFloat();
        Float area = base * height;
        System.out.printf("A área do retângulo é %s", area);



    }
}