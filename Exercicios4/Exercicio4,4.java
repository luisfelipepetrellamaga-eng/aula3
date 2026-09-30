
import java.util.Scanner;

public class Exercicicio4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade;
        double altura;
        double somaAlturas = 0;
        int contador = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Pessoa " + i + ":");
            System.out.print("Digite a idade: ");
            idade = scanner.nextInt();

            System.out.print("Digite a altura (em metros): ");
            altura = scanner.nextDouble();

            if (idade > 50) {
                somaAlturas += altura;
                contador++;
            }
        }

        if (contador > 0) {
            double media = somaAlturas / contador;
            System.out.println("Média das alturas das pessoas com mais de 50 anos: " + media);
        } else {
            System.out.println("Nenhuma pessoa com mais de 50 anos foi informada.");
        }

        scanner.close();
    }
}
    



