import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio8{
    public static void main(String[] args){
           var scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        var tipo = 0;
        var endd = false;







       /*Escreva um código onde o usuário informa um número inicial, posteriormente informará outros N números,
        a execução do código continuará até que o número informado dividido pelo primeiro número tenha resto
        diferente de 0 na divisão, números menores que o primeiro número devem ser ignorados */
        //TESTAR!!!!
        var number1 = 0;
        var number2 = 0;
        var cont = true;

        
            System.out.println("Digite o primeiro número para iniciar:");
        number1 = scanner.nextInt();
        while (cont) { 
        System.out.println("Digite um número que o resto da divisão com o número inicial seja 0:");
        number2 = scanner.nextInt();

        if(number2 == number1 && number2 < number1){
            System.out.printf("O segundo número deve ser diferente e maior que %s", number1);
        }else cont = false;
        }

        System.out.println("Deseja ver numeros pares ou impares?");
        var desic = scanner.next();

        if(desic.equalsIgnoreCase("pares")){
        
        for (int i = number2; i >= number1; i--) {

            if(i % 2 == 0) System.out.printf("%s", i);
            
        }
       }else if(desic.equalsIgnoreCase("impares")){
       for (int i = number2; i >= number1; i--) {

            if(i % 2 != 0) System.out.printf("%s", i);
            
        }
       }
      











    }
}