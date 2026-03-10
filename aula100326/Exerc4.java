import java.util.Scanner;

public class Exerc4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o caractere: ");
        char input = sc.next().toCharArray()[0];
        char[] vogals = {'a','e','i','o','u'};
        for(int i = 0; i<=vogals.length-1; i++){
            if(vogals[i] == input){
                System.out.println("È vogal");
                break;
            }
            if(i == vogals.length-1){
                System.out.println("Consoante");
            }

        }
        sc.close();
   
    }
}