import java.util.Scanner;

public class Exerc5 {

    public static void main(String[] args) {
        Double num = 0.0;
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Digite um número para adicionar a soma (0 para acabar) ");
            Double input = sc.nextDouble();
            if(input == 0){
                break;
            }
            num += input;
        }
        System.out.println("A soma é: " + num);
        sc.close();

    }
}