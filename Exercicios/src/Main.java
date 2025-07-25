import java.time.OffsetDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        //Escreva um código que receba o nome e o ano de nascimento de alguém e imprima na tela a seguinte mensagem:
        // "Olá 'Fulano' você tem 'X' anos"

        var baseyear = OffsetDateTime.now().getYear();
        System.out.println("Qual seu nome?");
        var name = scanner.next();
        System.out.println("Qual seu ano de nascimento?");
        var year = scanner.nextInt();
        var age = baseyear - year;
        System.out.printf("Olá %s você tem %s anos.", name, age);

        //Escreva um código que receba o tamanho do lado de um quadrado, calcule sua área e exiba na tela
        //fórmula: área=lado X lado

        System.out.println("\nQual tamanho do lado do quadrado?");
        var size = scanner.nextFloat();
        Float area = size * size;
        System.out.printf("A área do quadrado é %s", area);

        //Escreva um código que receba a base e a alturade um retângulo, calcule sua área e exiba na tela.
        //fórmula: área=base X altura

        System.out.println("\nQual o tamanho da base do retângulo?");
        var base = scanner.nextFloat();
        System.out.println("\nQual a altura do retângulo?");
        var height = scanner.nextFloat();
        Float area1 = base * height;
        System.out.printf("A área do quadrado é %s", area1);

        //Escreva um código que receba o nome e a idade de 2 pessoas e imprima a diferença de idade entre elas.

        System.out.println("Pessoa 1: Qual seu nome? ");
        var name1 = scanner.next();
        System.out.println("Pessoa 1: Qual sua idade?");
        var age1 = scanner.nextInt();
        System.out.println("Pessoa 2: Qual seu nome? ");
        var name2 = scanner.next();
        System.out.println("Pessoa 1: Qual sua idade?");
        var age2 = scanner.nextInt();

        var ageDifference = age1 - age2;
        System.out.printf("Olá %s e %s você tem %s anos.", ageDifference);

    }
}