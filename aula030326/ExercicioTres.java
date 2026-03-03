import java.util.Scanner;

public class ExercicioTres {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        String result1 = sc.nextLine();
        System.out.println("Digite o segundo número: ");
        String result2 = sc.nextLine();
        try{
            Integer num1 = Integer.valueOf(result1);
            Integer num2 = Integer.valueOf(result2);
            System.out.println(num1.equals(num2)? "São iguais" : "Não são iguais");
        }
        catch(Exception e){
            System.out.println("Número(s) inválido(s)");
        }
    }

}
