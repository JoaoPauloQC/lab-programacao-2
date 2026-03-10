import java.util.Scanner;

public class Exerc1{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a nota: ");
        double num = sc.nextDouble();
        if(num >= 6){
            System.out.println("Aprovado");
        }
        else{
            System.out.println("Reprovado");
        }
        sc.close();

    }

}