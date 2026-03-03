import java.util.Scanner;

public class ExercicioUm {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número");
        while(true){
            String outPut = sc.nextLine();
            try{
                Integer num = Integer.valueOf(outPut);
                System.out.println(num + (isEven(num)? " É par" : " É ímpar"));
                break;
            }
            catch(Exception e){
                System.out.println("Digite um número valido:");
            }
        }
    }

    public static boolean isEven(int num){
        return(num % 2 == 0);
    }
}