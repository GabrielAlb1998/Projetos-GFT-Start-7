import java.text.DecimalFormat;
import java.util.Scanner;

public class Main1{
    public static void main(String[] args){
           var scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        var tipo = 0;
        var endd = false;

        //Escreva um código onde o usuário digite um número e o programa retorne a tabuada respectiva.
        
        System.out.println("Digite o número desejado:");
        int num = scanner.nextInt();

        for (int i = 0; i < 10; i++) {
            int result = num * i;
            
            System.out.printf("%sx%s=%s\n", num, i, result);
          
    }
        

        //Escreva um código onde o usuário digite seu peso e sua altura.
        //O código deve retornar o resultado do IMC e qual grau de periodo que ele representa.
       while(!endd){
        System.out.println("Digite seu peso (Ex: 65):"); // Solicita peso.
        float weight = scanner.nextInt();

        System.out.println("Digite sua altura (Ex: 1.70):"); // Solicita altura.
        float height = scanner.nextFloat();

        var resultIMC = weight / (height*height);
        System.out.println(resultIMC);

        if(resultIMC <= 18.5) tipo = 1; 
        else if(resultIMC > 18.5 && resultIMC <= 24.9) tipo = 2; 
        else if(resultIMC > 24.9 && resultIMC <= 29.9) tipo = 3; 
        else if(resultIMC > 29.9 && resultIMC <= 34.9) tipo = 4; 
        else if(resultIMC > 34.9 && resultIMC <= 39.9) tipo = 5;  
        else tipo = 6;
        
        
        switch(tipo){

             
            case 1 -> System.out.printf("Seu IMC é %s | Situação: Abaixo do peso", df.format(resultIMC));

            case 2 -> System.out.printf("Seu IMC é %s | Situação: Peso ideal", df.format(resultIMC));

            case 3 -> System.out.printf("Seu IMC é %s | Situação: Levemente acima do peso", df.format(resultIMC));

            case 4 -> System.out.printf("Seu IMC é %s | Situação: Obesidade Grau I", df.format(resultIMC));

            case 5 -> System.out.printf("Seu IMC é %s | Situação: Obesidade Grau II (Severa)", df.format(resultIMC));

            case 6 -> System.out.printf("Seu IMC é %s | Situação: Obesidade Grau III (Mórbida)", df.format(resultIMC));

            default -> System.out.println("Erro");

        }
        
        System.out.println("\nDeseja repetir o teste? s/n:"); // Solicita altura.
         var decision = scanner.next(); 

        if(decision.equalsIgnoreCase("n"))  endd = true;
        else continue;


    }

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