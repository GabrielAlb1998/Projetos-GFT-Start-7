import java.util.Scanner;

public class Main{

    public static void main (String[] args){
        var scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        var num1 = scanner.nextInt();
        System.out.println("Digite o segundo número:");
        var num2 = scanner.nextInt();
        System.out.printf("%s + %s = %s\n", num1, num2, num1 + num2);
        System.out.printf("%s - %s = %s\n", num1, num2, num1 - num2);
        System.out.printf("%s * %s = %s\n", num1, num2, num1 * num2);
        System.out.printf("%s / %s = %s Resto = %s\n", num1, num2, num1 / num2, num1 % num2);

    }
}