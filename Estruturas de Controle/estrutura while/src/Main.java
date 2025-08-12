import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       var scanner = new Scanner(System.in);
        var name = "";
        while(!name.equalsIgnoreCase("sair")){

         System.out.println("Qual seu nome?");
         name = scanner.next();

        }
    }
}