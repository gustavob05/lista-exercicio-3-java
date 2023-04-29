import java.util.Scanner;
    public class ExercicioTres{
        public static void main(String[] args){
            System.out.println("Programa 3");
            Scanner scanner = new Scanner(System.in);
            {
            while (true){ 
            System.out.println("Informe seu nome (+ de 3 caracteres): ");
            String nome = scanner.next();
            int caracteres = nome.length();
            if (caracteres > 3)
            break;
            else 
            System.out.println("\nO nome informado deve possuir mais de 3 caracteres" + "\nDigite novamente");
            }
            while (true){
            System.out.println("Informe sua idade (Entre 0 e 150 anos): ");
            int idade = scanner.nextInt();
            if ((idade > 0 ) && (idade < 150))
            break;
            else
            System.out.println("\nInformação inválida!" + "\nPor favor, digite novamente.");
            }
            while (true){
            System.out.println("Informe seu salário: ");
            double salario = scanner.nextDouble();
            if (salario > 0)
            break;
            else
            System.out.println("\nInformação inválida!" + "\nPor favor, digite novamente.");
            }
            while (true) {
            System.out.println("Informe seu sexo (m ou f): ");
            String sexo = scanner.next();
            if ((sexo.equals("f")) || (sexo.equals("m")))
            break;
            else
            System.out.println("\nInformação inválida!" + "\nPor favor, digite novamente.");
            }
            while (true){
            System.out.println("Informe seu Estado Civil (s, c, v ou d): ");
            String estado = scanner.next();
            if (estado.equals("s") || estado.equals("c") || estado.equals("v") || estado.equals("d"))
            break;
            else
            System.out.println("\nInformação inválida!" + "\nPor favor, digite novamente.");
            }
            System.out.printf("\nAs suas informações foram armazenadas com sucesso!");
        }
            scanner.close();
        }
    }
