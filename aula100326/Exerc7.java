import java.util.Random;
import java.util.Scanner;

public class Exerc7{
    public static void main(String[] args) {
        Integer random = new Random().nextInt(0,100);
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Tente um número:");
            Integer num = sc.nextInt();
            if(num == random){
                System.out.println("Acertou!");
                break;
            }
            System.out.println( "O número aleatório é " + (random > num? "maior" : "menor") + " do que o digitado");
        }
        sc.close();

    }
}