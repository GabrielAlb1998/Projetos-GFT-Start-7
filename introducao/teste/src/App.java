import java.util.Scanner;

public class App {


    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Quantos anos você tem?");
        var age = scanner.nextInt();
        System.out.println("Você é emancipado?");
        var emancipado = scanner.nextBoolean();
        var podeDirigir = age >= 18 || (emancipado && age >=16);
        System.out.printf("Você pode dirigir? (%s)", podeDirigir);


    }
}
