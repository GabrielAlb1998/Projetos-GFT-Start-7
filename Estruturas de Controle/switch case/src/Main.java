import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       var scanner = new Scanner(System.in);
       System.out.println("Insira um número de 1 a 7:");
       var escolha = scanner.nextInt();

       var mensagem = switch (escolha){

           case 1, 7 -> "Fim de semana!";
           case 2 -> "Segunda";
           case 3 -> "Terça";
           case 4 -> "Quarta";
           case 5 -> "Quinta";
           case 6 -> "Sexta";
           default -> "Opção invalida";
       };
       System.out.printf(mensagem);
    }
}
/*
* Outras maneiras de usar o Switch Case:
*
* switch (escolha){
*
*       case 1, 7 -> System.out.println("Fim de semana!");
           case 2 -> System.out.println("Segunda");
           case 3 -> System.out.println("Terça");
           case 4 -> System.out.println("Quarta");
           case 5 -> System.out.println("Quinta");
           case 6 -> System.out.println("Sexta");
           default -> System.out.println("Opção invalida");
*
* }
*
* switch (escolha){
*
*        case 1:
*              System.out.println("Fim de semana!");
*        case 2:
*          System.out.println("Fim de semana!");
*        case 3:
*          System.out.println("Fim de semana!");
*        case 4:
*          System.out.println("Fim de semana!");
         case 5:
         * System.out.println("Fim de semana!");
         case 6:
         * System.out.println("Fim de semana!");
         default:
         *
* }
*
*
*
* */