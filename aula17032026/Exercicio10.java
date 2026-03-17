import java.time.LocalDateTime;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        System.out.println("Digite a data: ");
        Scanner sc = new Scanner(System.in);
        String dateString1 = sc.nextLine();
        sc.close();
        LocalDateTime date1 = LocalDateTime.parse(dateString1);
        LocalDateTime now = LocalDateTime.now();
        boolean isAfter = false;
        if(now.getYear() < date1.getYear()){
            isAfter = true;
        }
        else if (now.getYear() == date1.getYear()) {
            
        } {
            if(now.getMonthValue() < date1.getMonthValue() ){
                isAfter = true;
            }
            else if(now.getMonthValue() == date1.getMonthValue()){
                if(now.getDayOfMonth() < date1.getDayOfMonth()){
                    isAfter = true;
                }
                else if(now.getDayOfMonth() == date1.getDayOfMonth()){
                    if(now.getHour() < date1.getHour()){
                        isAfter = true;
                    }
                    else if(now.getHour() == date1.getHour()){
                        if(now.getMinute()< date1.getMinute()){
                            isAfter = true;
                        }
                        else if(now.getMinute() == date1.getMinute()){
                            if(now.getSecond()< date1.getSecond()){
                                isAfter = true;
                            }
                        }
                    }
                }
            }
        }
        System.out.println("É depois: " + (isAfter? "Sim" : "Não"));
    }
}
