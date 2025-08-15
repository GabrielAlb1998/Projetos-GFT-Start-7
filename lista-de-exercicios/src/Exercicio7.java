import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio7{
    public static void main(String[] args){
           var scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        var tipo = 0;
        var endd = false;




       //Escreva um código que o usuário entre com um primeiro número, um segundo número maior que o primeiro
       //e escolha entre a opção par e impar, com isso o código deve informar todos os números 
       //pares ou ímpares (de acordo com a seleção inicial) no intervalo de números informados, 
       // incluindo os números informados e em ordem decrescente;
        


       System.out.println("Digite o primeiro número:");
       var num1 = scanner.nextInt();
       
           
       System.out.println("Digite o segundo número. (Maior que o primeiro número):");
       var num2 = scanner.nextInt();
       
       if(num2 == num1 && num2 < num1){

        while(num2 == num1 && num2 < num1){

            System.out.println("O segundo número precisar ser maior que o primeiro!");
            System.out.println("Digite o segundo número. (Maior que o primeiro número):");
            num2 = scanner.nextInt();
        }
       }

       System.out.println("Deseja imprimir números pares ou impares?");
       var option = scanner.next();

       if(option.equalsIgnoreCase("par")){

        for (int i = 0; i < num2; i++) {
            
            if(i % 2 == 0) System.out.printf("%s", i);
        }
       }
       else if(option.equalsIgnoreCase("impar")){
        
        for (int i = 0; i < num2; i++) {
            
            if(i % 2 != 0) System.out.printf("%s", i);
        }
       }
    }
}

