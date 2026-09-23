package Exercicios3;
import java.util.Scanner;
public class Exercicio2 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int pares = 0;
        int impares = 0;
        int contador = 1;

        while (contador <=10){
         
            System.out.print("Digite o " + contador + "º número: ");
            int numero = entrada.nextInt();

            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }

            contador++;
        }

        System.out.println("O total de pares é: " + pares);
        System.out.println("O total de ímpares é: " + impares);

        entrada.close();
    }
}

