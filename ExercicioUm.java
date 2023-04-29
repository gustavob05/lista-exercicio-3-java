import java.util.Scanner;
public class ExercicioUm{
    public static void main(String[] args){
        System.out.println("Programa 1");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nInforme a sua nota: ");
            int nota = scanner.nextInt();
            System.out.println("A nota informada foi: " + nota);
            if ((nota >= 0) && (nota <= 10))
            break;
            else
            System.out.println("A nota informada é inválida!");
        }
        
    scanner.close();
    }
}