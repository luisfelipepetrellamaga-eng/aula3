

 import java.util.Scanner;
 public class Exercicio3{
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        System.out.print("Sequência: ");
        for (int i = 1; i <=numero; i++){
            System.out.print(i + " ");
        }

        scanner.close();
    }
}
