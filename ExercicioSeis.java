import java.util.Scanner; 
public class ExercicioSeis{
    public static void main(String[] args){
        System.out.println("Programa 6");

        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("\nInforme o primeiro número: ");
            int numeroUm = scanner.nextInt();
            System.out.println("\nInforme o segundo número: ");
            int numeroDois = scanner.nextInt();
            if (numeroUm != numeroDois){
                if (numeroUm < numeroDois)
                    for (int numeroTres = (numeroUm + 1); numeroTres < numeroDois; numeroTres++){
                        System.out.printf("\nNúmero:" + numeroTres);
                }
                else
                    for (int numeroTres = (numeroDois + 1); numeroTres < numeroUm; numeroTres++){
                        System.out.printf("\nNúmero:" + numeroTres);
                }
            break;
            }
            else {
            System.out.println("\nNão é possível gerar um intervalo de números com dois números inteiros iguais!\nPor favor, digite os números novamente.");
            }
        scanner.close();
        }
    }
}