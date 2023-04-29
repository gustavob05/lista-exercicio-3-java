public class ExercicioCinco{
    public static void main(String[] args){
        System.out.println("Programa 5");
        System.out.println("\nApenas os números ímpares serão mostrados!");
        for (int i = 0; (i <= 50); i++){
            if (!(i%2==0))
            System.out.println("Número: " + i);
        }
        
    }
}