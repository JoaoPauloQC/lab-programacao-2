import java.util.Scanner;

public class Exerc9 {
    
    public static void main(String[] args) {
        System.out.println("Digite um número inteiro: ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        sc.close();
        Integer num = input;
        char[] numCharSequence = num.toString().toCharArray();
        int index = 0;
        int count = 0;
        while(index < numCharSequence.length){
            count++;
            index++;
        }
        System.out.println("Tamanho do número: " + count);
    }

}
