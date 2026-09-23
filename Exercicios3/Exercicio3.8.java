package Exercicios3;

import java.util.Scanner;

public class Exercicio8 {
     public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int aluno = 1;
        while (aluno <= 5) {
            double nota1, nota2;

            
            do {
                System.out.print("Digite a 1ª nota do aluno " + aluno + " (0 a 10): ");
                nota1 = entrada.nextDouble();
                if (nota1 < 0 || nota1 > 10) {
                    System.out.println("Nota inválida! Digite novamente.");
                }
            } while (nota1 < 0 || nota1 > 10);

            
            do {
                System.out.print("Digite a 2ª nota do aluno " + aluno + " (0 a 10): ");
                nota2 = entrada.nextDouble();
                if (nota2 < 0 || nota2 > 10) {
                    System.out.println("Nota inválida! Digite novamente.");
                }
            } while (nota2 < 0 || nota2 > 10);

            double media = (nota1 + nota2) / 2.0;
            System.out.println("A média do aluno " + aluno + " é: " + media);
            System.out.println("-----------------------------------");

            aluno++;
        }

        entrada.close();
    }
}

