import java.time.LocalDate;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        System.out.println("Digite sua data de nascimento no formato yyyy-mm-dd");
        Scanner sc = new Scanner(System.in);
        String dateString = sc.nextLine();
        sc.close();
        LocalDate date = LocalDate.parse(dateString);
        System.out.println("Você tem: " + LocalDate.now().minusYears(date.getYear()).minusMonths(date.getMonthValue()).minusDays(date.getDayOfMonth()).getYear());
    }
}