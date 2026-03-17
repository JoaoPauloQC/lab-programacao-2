import java.time.LocalDateTime;
import java.util.Scanner;

public class Exercicio9 {
 
    public static void main(String[] args) {
        
        System.out.println("Digite sua data1");
        Scanner sc = new Scanner(System.in);
        String dateString1 = sc.nextLine();
        System.out.println("Digite sua data2");
        String dateString2 = sc.nextLine();
        sc.close();
        LocalDateTime date1 = LocalDateTime.parse(dateString1);
        LocalDateTime date2 = LocalDateTime.parse(dateString2);
        LocalDateTime rest = date2.minusYears(date1.getYear()).minusMonths(date1.getMonthValue()).minusDays(date1.getDayOfMonth()).minusHours(date1.getHour()).minusMinutes(date1.getMinute());
        int hours = rest.getHour();
        int minutes = rest.getMinute();
        System.out.println("Duração em horas e minutos: " + hours + " horas e " + minutes + " minutos" );
    }
}
