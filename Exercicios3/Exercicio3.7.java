package Exercicios3;

import java.util.Scanner;

public class Exercicio7 {
     public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int contador = 1;
        int semObesidade = 0;

        while (contador <= 10) {
            System.out.print("Digite o peso da " + contador + "ª pessoa (em kg): ");
            double peso = entrada.nextDouble();

            System.out.print("Digite a altura da " + contador + "ª pessoa (em metros): ");
            double altura = entrada.nextDouble();

            double imc = peso / (altura * altura);

            System.out.println("IMC da " + contador + "ª pessoa: " + imc);

            if (imc >= 18.5 && imc <= 24.9) {
                semObesidade++;
            }

            contador++;
        }

        System.out.println("Total de pessoas sem obesidade (IMC entre 18,5 e 24,9): " + semObesidade);

        entrada.close();
    }
}
    

