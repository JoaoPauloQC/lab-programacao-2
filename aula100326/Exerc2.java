import java.util.Scanner;

public class Exerc2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o ano: ");
        Integer year = sc.nextInt();
        if(year % 4 == 0 && year % 100 != 0){
            System.out.println("Ano bissexto");
        }
        else{
            System.out.println("Não é ano bissexto");
        }
        sc.close();

    }
}