import java.util.Scanner;

public class Exercicio7 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maiores50 = 0;
        double somaAlturas10a20 = 0;
        int contador10a20 = 0;
        int abaixo40kg = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Pessoa " + i + ":");
            System.out.print("Digite a idade: ");
            int idade = scanner.nextInt();

            System.out.print("Digite a altura (em metros): ");
            double altura = scanner.nextDouble();

            System.out.print("Digite o peso (em kg): ");
            double peso = scanner.nextDouble();

            if (idade > 50) {
                maiores50++;
            }

            if (idade >= 10 && idade <= 20) {
                somaAlturas10a20 += altura;
                contador10a20++;
            }

            if (peso < 40) {
                abaixo40kg++;
            }

            System.out.println();
        }

        double mediaAlturas10a20 = (contador10a20 > 0) ? somaAlturas10a20 / contador10a20 : 0;
        double percentualAbaixo40kg = (abaixo40kg * 100.0) / 10;

        System.out.println("Quantidade de pessoas maiores de 50 anos: " + maiores50);
        if (contador10a20 > 0) {
            System.out.println("Média das alturas das pessoas entre 10 e 20 anos: " + mediaAlturas10a20);
        } else {
            System.out.println("Nenhuma pessoa com idade entre 10 e 20 anos foi informada.");
        }
        System.out.println("Porcentagem de pessoas com peso inferior a 40 kg: " + percentualAbaixo40kg + "%");

        scanner.close();
    }
}

