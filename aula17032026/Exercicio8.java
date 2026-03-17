import java.time.LocalDate;
import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        System.out.println("Digite a data");
        Scanner sc = new Scanner(System.in);
        String dateString = sc.nextLine();
        LocalDate date = LocalDate.parse(dateString);
        LocalDate indexDate = date;
        sc.close();
        int days = 0;
        while(true){
            if(days>=15){
                break;
            }
            if(!(indexDate.getDayOfWeek().getValue() == 6 || indexDate.getDayOfWeek().getValue() == 7)){
                days++;
            }
            indexDate = indexDate.plusDays(1);
        }
        System.out.println("Dia de entrega: " + indexDate);
    }
}
