import java.util.Scanner;

public class Exerc6 {
    public static void main(String[] args) {
        Integer count = 0;
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Digite um número positivo para adicionar ou negativo para parar: ");
            Double input = sc.nextDouble();
            if(input < 0){
                break;
            }
            count += 1;
        }
        System.out.println("Positivos: " + count);
        sc.close();

    }
}