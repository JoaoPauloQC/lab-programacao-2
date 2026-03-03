public class ExercicioDez {
    public static void main(String[] args) {
        Object object = 200.0;
        if(object instanceof Integer num){
            System.out.println(num>100? "Integer maior que 100" : "Integer menor ou igual que/a 100");
        }
        else if (object instanceof Double num){
            System.out.println(num>100? "Double maior que 100" : "Double menor ou igual que/a 100");
            
        }
        else if (object instanceof Boolean bool ){
            System.out.println(bool? "Verdadeiro" : "Falso");
        }
        else{
            System.out.println("TIpo inválido");
        }
    }
}
