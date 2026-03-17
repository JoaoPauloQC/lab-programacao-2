import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
public class Exercicio4  {
    public static void main(String[] args) {
        System.out.println("Digite sua data de nascimento no formato yyyy-mm-dd");
        Scanner sc = new Scanner(System.in);
        LocalDate date = LocalDate.parse(sc.nextLine());
        sc.close();
        long restDays = ChronoUnit.DAYS.between(LocalDate.now(), LocalDate.of((LocalDate.now().getMonthValue() > date.getMonthValue()? LocalDate.now().getYear()+1 : LocalDate.now().getYear()),date.getMonthValue(),date.getDayOfMonth()));
        System.out.println("Faltam: " + restDays);
    }
}