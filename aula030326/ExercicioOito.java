public class ExercicioOito {
    
    public static void main(String[] args) {
        Object primeiro = 4000;
        Object segundo = 4000;
            if(primeiro instanceof Integer num1 && segundo instanceof Integer num2){
                int comparacao = Integer.compare(num1, num2);
                System.out.println(comparacao>0? (num1 + " > " + num2) : comparacao<0? (num2 + " > " + num1) : "Números iguais");
            }
            else{
                System.out.println("Não são integer");
            }
    }

}
