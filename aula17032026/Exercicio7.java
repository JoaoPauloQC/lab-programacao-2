import java.time.LocalDate;

public class Exercicio7 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        for(int index = 0; index< 8;index++){
            System.out.println("Dia: " + date + " Dia da semana: " + date.getDayOfWeek());
            date = date.plusDays(1);
        }
    }
}
