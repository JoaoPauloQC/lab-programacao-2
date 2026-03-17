import java.time.LocalDate;
import java.util.Scanner;

public class Exercicio3{
    public static void main(String[] args) {
        System.out.println("Digite o ano que quer saber");
        Scanner sc = new Scanner(System.in);
        String dateString = sc.nextLine();
        sc.close();
        LocalDate date = LocalDate.of(Integer.parseInt(dateString), 1, 1);
        int year = date.getYear();
        LocalDate finalOfTheYear = LocalDate.of(year, 12, 31);
        System.out.println("Final de " + year + " será em: " + finalOfTheYear);
    }
}