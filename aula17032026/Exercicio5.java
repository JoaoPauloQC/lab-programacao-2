import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        
        System.out.println("Digite sua data1");
        Scanner sc = new Scanner(System.in);
        String dateString1 = sc.nextLine();
        System.out.println("Digite sua data2");
        String dateString2 = sc.nextLine();
        sc.close();
        LocalDateTime date1 = LocalDateTime.parse(dateString1);
        LocalDateTime date2 = LocalDateTime.parse(dateString2);
        long hours = ChronoUnit.HOURS.between(date1, date2);
        System.out.println("Diferencas em horas: " + hours);
    }
}
