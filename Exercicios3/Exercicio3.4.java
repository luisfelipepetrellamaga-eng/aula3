package Exercicios3;
import java.util.Scanner;
public class Exercicio4 {
     public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

       System.out.print("Digite um número inteiro: ");
        int numero = entrada.nextInt();

        double metade = numero / 2.0;

        System.out.println("A metade de " + numero + " é " + metade);

        entrada.close();
    }
}

