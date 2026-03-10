import java.util.Scanner;

public class Exerc11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número 1: ");
        Double num1 = sc.nextDouble();
        System.out.println("Digite o número 2: ");
        Double num2 = sc.nextDouble();

        System.out.println("Agora digite a operação");
        String operator = sc.next();
        Double result = 0.0;
        if(operator.equals("+")){
            result = num1 + num2;
        }
        else if(operator.equals("-"))
        {
            result = num1 - num2;
        }
        else if(operator.equals("*"))
        {
            result = num1 * num2;
        }
        else if(operator.equals("/"))
        {
            result = num1 / num2;
        }
        if(operator.equals("+") || operator.equals("-") || operator.equals("/") || operator.equals("*")){
            System.out.println("Resultado: " + result + ". Operador: " + operator);
        }
        else{
            System.out.println("Operação inválida");
        }
        sc.close();

    }
}
