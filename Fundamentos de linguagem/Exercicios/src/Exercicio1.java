import java.time.OffsetDateTime;
import java.util.Scanner;

public class Exercicio1 {
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



    }
}