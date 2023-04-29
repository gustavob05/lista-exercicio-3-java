import java.util.Scanner;
public class ExercicioQuatro{
    public static void main(String[] args){
        System.out.println("Programa 4");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o primeiro número: ");
         double numeroUm = scanner.nextDouble();
        System.out.println("Informe o segundo número: ");
         double numeroDois = scanner.nextDouble();
        System.out.println("Informe o terceiro número: ");
         double numeroTres = scanner.nextDouble();
        System.out.println("Informe o quarto número: ");
         double numeroQuatro = scanner.nextDouble();
        System.out.println("Informe o quinto número: ");
         double numeroCinco = scanner.nextDouble();
         double soma = (numeroUm + numeroDois + numeroTres + numeroQuatro + numeroCinco);
         double media = soma/5;
        System.out.printf("\nA soma dos números informados é %.2f", (soma));
        System.out.printf("\nA média aritimética dos números informados é: %.2f", (media));   
        scanner.close();
    }
}