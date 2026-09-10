import java.util.Scanner;

public class desafio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = entrada.nextInt();

        System.out.print("Possui título de eleitor regular? (S/N): ");
        char titulo = entrada.next().charAt(0);

        if (idade < 16) {
            System.out.println("Não está apto a votar.");
        } else if (titulo == 'N' || titulo == 'n') {
            System.out.println("Não está apto a votar.");
        } else if (titulo == 'S' || titulo == 's') {
            if (idade >= 16 && idade < 18) {
                System.out.println("Está apto a votar. Voto facultativo.");
            } else if (idade >= 18 && idade < 70) {
                System.out.println("Está apto a votar. Voto obrigatório.");
            } else {
                System.out.println("Está apto a votar. Voto facultativo.");
            }
        } else {
            System.out.println("Informação inválida.");
        }

        entrada.close();
    }
}