import java.util.Scanner;

public class Exercicio2 {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite dois números separados por espaço");
        Integer num1 = null;
        Integer num2 = null;
        while(true){
            String outPut = sc.nextLine();
            String current_num = "";
            try{
                for(int i = 0;i<= outPut.length()-1;i++){
                    char c = outPut.toCharArray()[i];
                    boolean isBlank = String.valueOf(c).isBlank();
                    if(num1 != null && num2 != null){
                        break;
                    }
                    if(isBlank || i == outPut.length()-1){
                        if(i == outPut.length()-1){
                            current_num += c;
                        }
                        if(num1 == null){
                            num1 = Integer.valueOf(current_num);
                        }else{
                            num2 = Integer.valueOf(current_num);
                        }
                        current_num = "";
                    }
                    else{
                        current_num +=c;
                    }
                }
                System.out.println(num1 + "  " + num2);
                int result = Integer.compare(num1, num2);
                System.out.println(result < 0? (num1 + " < " + num2 ): result >0? (num1 + " > " + num2) : "Eles são iguais");
                break;
            }
            catch(Exception e){
                System.out.println("Digite um número valido: " + e);
                break;
            }
        }
    }

}
