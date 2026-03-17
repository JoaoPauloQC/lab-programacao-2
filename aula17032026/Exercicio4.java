import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Exercicio4  {
    public static void main(String[] args) {
        System.out.println("Digite sua data de nascimento no formato yyyy-mm-dd");
        Scanner sc = new Scanner(System.in);
        String dateString = sc.nextLine();
        sc.close();
        LocalDate date = LocalDate.parse(dateString);
        LocalDate nextBirthday = LocalDate.of((LocalDate.now().getMonthValue() > date.getMonthValue()? LocalDate.now().getYear()+1 : LocalDate.now().getYear()),date.getMonthValue(),date.getDayOfMonth());
        long restDays = ChronoUnit.DAYS.between(LocalDate.now(), nextBirthday);
        System.out.println("Faltam: " + restDays);
    
    }
}