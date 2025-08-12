import java.util.Objects;
import java.util.Scanner;


public class Main{

    public static void main (String[] args){
        var scanner = new Scanner(System.in);
        System.out.println("Qual seu nome?");
        var name = scanner.next();
        System.out.println("Você é emancipado?");
        var emancipad = scanner.next().equalsIgnoreCase("sim");
        System.out.println("Qual sua idade?");
        var age = scanner.nextInt();

        if(age >= 18) System.out.printf("Olá %s, você é de maior!", name);
        else if(age >= 16 && emancipad) System.out.printf("Olá %s, você é emancipado!", name);
        else System.out.printf("Olá %s, você é de menor!", name);


    }

}