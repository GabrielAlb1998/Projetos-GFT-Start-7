import java.util.Scanner;

public class Main1{
    public void main(String[] args){
        var scanner = new Scanner(System.in);

        var tipo = 0;
        var endd = false;

        //Escreva um código onde o usuário digite um número e o programa retorne a tabuada respectiva.
        /* 
        System.out.println("Digite o número desejado:");
        int num = scanner.nextInt();

        for (int i = 0; i < 10; i++) {
            int result = num * i;
            
            System.out.printf("%sx%s=%s\n", num, i, result);
            
        }*/
        

        //Escreva um código onde o usuário digite seu peso e sua altura.
        //O código deve retornar o resultado do IMC e qual grau de periodo que ele representa.
       while(!endd){
        System.out.println("Digite seu peso:"); // Solicita peso.
        int weight = scanner.nextInt();

        System.out.println("Digite sua altura:"); // Solicita altura.
        int height = scanner.nextInt();

        int resultIMC = weight/(height*height);

        if(resultIMC <= 18.5) tipo = 1; 
        else if(resultIMC > 18.5 && resultIMC <= 24.9) tipo = 2; 
        else if(resultIMC > 24.9 && resultIMC <= 29.9) tipo = 3; 
        else if(resultIMC > 29.9 && resultIMC <= 34.9) tipo = 4; 
        else if(resultIMC > 34.9 && resultIMC <= 39.9) tipo = 5;  
        else tipo = 6;

        switch(tipo){

             
            case 1 -> System.out.printf("Seu IMC é %s | Situação: Abaixo do peso", resultIMC);

            case 2 -> System.out.printf("Seu IMC é %s | Situação: Peso ideal", resultIMC);

            case 3 -> System.out.printf("Seu IMC é %s | Situação: Levemente acima do peso", resultIMC);

            case 4 -> System.out.printf("Seu IMC é %s | Situação: Obesidade Grau I", resultIMC);

            case 5 -> System.out.printf("Seu IMC é %s | Situação: Obesidade Grau II (Severa)", resultIMC);

            case 6 -> System.out.printf("Seu IMC é %s | Situação: Obesidade Grau III (Mórbida)", resultIMC);

            default -> System.out.println("Erro");

        }
        
        System.out.println("Deseja repetir o teste? s/n:"); // Solicita altura.
         var decision = scanner.next(); 

        if(decision.equalsIgnoreCase("s"))  endd = true;
        else continue;


    }

       //Escreva um código que o usuário entre com um primeiro número, um segundo número maior que o primeiro
       //e escolha entre a opção par e impar, com isso o código deve informar todos os números 
       //pares ou ímpares (de acordo com a seleção inicial) no intervalo de números informados, 
       // incluindo os números informados e em ordem decrescente;

    }
}