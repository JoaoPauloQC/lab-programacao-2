public class ExercicioNove {
    
    public static void main(String[] args) {
        Object object = "false";
        if(object instanceof String value){
            Boolean bool = Boolean.valueOf(value);
            System.out.println(bool? "ativo": "inativo");
        }else{
            System.out.println("Entrada inválida");
        }


    }

}
