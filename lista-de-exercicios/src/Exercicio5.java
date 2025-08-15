import java.util.Scanner;

public class Exercicio5{
    public void main(String[] args){
        var scanner = new Scanner(System.in);

        var tipo = 0;
        var endd = false;

        //Escreva um código onde o usuário digite um número e o programa retorne a tabuada respectiva.
        
        System.out.println("Digite o número desejado:");
        int num = scanner.nextInt();

        for (int i = 0; i < 10; i++) {
            int result = num * i;
            
            System.out.printf("%sx%s=%s\n", num, i, result);
            
        }
    }
}
        