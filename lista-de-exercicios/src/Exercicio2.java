import java.time.OffsetDateTime;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        //Escreva um código que receba o tamanho do lado de um quadrado, calcule sua área e exiba na tela
        //fórmula: área=lado X lado

        System.out.println("\nQual tamanho do lado do quadrado?");
        var size = scanner.nextFloat();
        Float area = size * size;
        System.out.printf("A área do quadrado é %s", area);



    }
}