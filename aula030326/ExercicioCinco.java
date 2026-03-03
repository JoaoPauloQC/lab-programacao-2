import java.util.Scanner;

public class ExercicioCinco {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número: ");
        String resp = sc.nextLine();
        try{
            boolean value = Boolean.valueOf(resp);
            
            System.out.println(value? "Acesso permitido": "Negado");
        }
        catch(Exception e){
            System.out.println("Input invalido");
        }
    }
}
