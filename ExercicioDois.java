import java.util.Scanner;
public class ExercicioDois{
    public static void main(String[] args){
        System.out.println("Programa 2");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nBem vindo!" + "\nInsira seu nome de usuário: ");
            String nome = scanner.next();
            System.out.println("Informe sua senha: ");
            String senha = scanner.next();
            if (senha.equals(nome))
            System.out.println("\nErro!" + "\nA senha não pode ser igual ao seu nome de usuário!" + "\nDigite as informações novamente");
            else
            break;
        }
        scanner.close();
    }
}