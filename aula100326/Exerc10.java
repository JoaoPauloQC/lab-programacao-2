import java.util.Scanner;

public class Exerc10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer num = sc.nextInt();
        System.out.println("Dia da semana selecionado: " + dayOfTheWeek(num));
        sc.close();

    }

    public static String dayOfTheWeek(int num){
        switch (num) {
            case 1:
                return "Domingo";        
            case 2:
                return "Segunda-feira";        
            case 3:
                return "Terça-feira";        
            case 4:
                return "Quarta-feira";        
            case 5:
                return "Quinta-feira";        
            case 6:
                return "Sexta-feira";
            case 7:
                return "Sábado";        
            default:
                return "dia inexistente, número maior que 7 ou menor que 1";
        }
    }
}
