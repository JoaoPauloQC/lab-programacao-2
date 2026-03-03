public class ExercicioSete {
    
    public static void main(String[] args) {
        Object num = -60.0;
            if(num instanceof Double num1){
                double primitive = num1.doubleValue();
                System.out.println(primitive >=0? "Número positivo" : "Número negativo");
            }
            else{
                System.out.println("Tipo incompativel");
            }
    }
}
