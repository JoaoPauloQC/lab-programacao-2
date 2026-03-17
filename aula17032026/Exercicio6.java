import java.time.LocalDate;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        System.out.println("Digite a data");
        Scanner sc = new Scanner(System.in);
        String dateString = sc.nextLine();
        sc.close();
        LocalDate date = LocalDate.parse(dateString);
        System.out.println("É fim de semana: " + ((date.getDayOfWeek().getValue() == 7 || date.getDayOfWeek().getValue() == 6)? "Sim" : "Não"));
    
    }
}
