import java.util.Scanner;

public class Exerc3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número 1: ");
        Integer num1 = sc.nextInt();
        System.out.println("Digite o número 2: ");
        Integer num2 = sc.nextInt();
        System.out.println("Digite o número 3: ");
        Integer num3 = sc.nextInt();
        Integer bigger = Integer.max(num1,Integer.max(num3, num2));
        Integer smaller = Integer.min(num1,Integer.min(num3, num2));
        System.out.println("Maior numero: " + bigger);
        System.out.println("Menor número: " + smaller);
        sc.close();

    }
}