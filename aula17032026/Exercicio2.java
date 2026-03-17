import java.time.LocalDate;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        System.out.println("Digite sua data de nascimento no formato yyyy-mm-dd");
        Scanner sc = new Scanner(System.in);
        String dateString = sc.nextLine();
        sc.close();
        LocalDate date = LocalDate.parse(dateString);
        System.out.println("Ano bissexto?: " + (date.isLeapYear()? "Sim" : "Não") );

    }
}