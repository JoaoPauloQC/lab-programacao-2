import java.util.Scanner;

public class Exerc8 {
    public static void main(String[] args) {
        Double biggest = 0.0;
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Digite um número (0 para parar) ");
            Double input = sc.nextDouble();
            if(input == 0){
                break;
            }
            if(input > biggest){
                biggest = input;
            }
        }
        System.out.println("Maior número: " + biggest);
        sc.close();

    }
}
