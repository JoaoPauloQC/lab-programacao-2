import java.util.Scanner;

public class Exerc12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Escolha um idioma \n 1- Português \n 2- Inglẽs \n 3- Espanhol");
        Integer choice = sc.nextInt();
        System.out.println(hiByChoice(choice));
        sc.close();

    }

    public static String hiByChoice(int num){
        if(num == 1){
            return "Olá!";
        }
        else if(num ==2){
            return "Hello!";
        }
        else if(num == 3 ){
            return "Holá!";
        }
        return "Escolha inválida";
    }
}