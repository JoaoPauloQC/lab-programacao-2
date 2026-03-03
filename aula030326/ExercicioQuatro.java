import java.util.Scanner;

public class ExercicioQuatro {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número: ");
        String resp = sc.nextLine();
        try{
            Double value = Double.valueOf(resp);
            System.out.println(value>100? "Maior que 100": "Menor ou igual a 100");
        }
        catch(Exception e){
            System.out.println("Número inválido");
        }
    }


}
