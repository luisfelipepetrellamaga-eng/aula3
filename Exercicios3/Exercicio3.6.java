package Exercicios3;
import java.util.Scanner;
public class Exercicio6 {
     public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
         

        System.out.print("Digite o 1º número inteiro positivo: ");
        int numero = entrada.nextInt();

        // força ser positivo
        while (numero <= 0) {
            System.out.print("Número inválido! Digite novamente um número positivo: ");
            numero = entrada.nextInt();
        }

        int menor = numero;

        int contador = 2;
        while (contador <= 10) {
            System.out.print("Digite o " + contador + "º número inteiro positivo: ");
            numero = entrada.nextInt();

            while (numero <= 0) { 
                System.out.print("Número inválido! Digite novamente um número positivo: ");
                numero = entrada.nextInt();
            }

            if (numero < menor) {
                menor = numero;
            }

            contador++;
        }

        System.out.println("O menor número digitado foi: " + menor);

        entrada.close();
    }
}
        