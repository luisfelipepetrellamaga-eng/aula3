import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nota1, nota2, media;
        int aprovados = 0, exames = 0, reprovados = 0;
        double somaMedias = 0;

        for (int i = 1; i <= 6; i++) {
            System.out.println("Aluno " + i + ":");
            System.out.print("Digite a primeira nota: ");
            nota1 = scanner.nextDouble();

            System.out.print("Digite a segunda nota: ");
            nota2 = scanner.nextDouble();

            media = (nota1 + nota2) / 2;
            somaMedias += media;

            System.out.print("Média: " + media + " - Situação: ");
            if (media <= 3) {
                System.out.println("REPROVADO");
                reprovados++;
            } else if (media < 7) {
                System.out.println("EXAME");
                exames++;
            } else {
                System.out.println("APROVADO");
                aprovados++;
            }
            System.out.println();
        }

        double mediaClasse = somaMedias / 6;

        System.out.println("Total de alunos aprovados: " + aprovados);
        System.out.println("Total de alunos de exame: " + exames);
        System.out.println("Total de alunos reprovados: " + reprovados);
        System.out.println("Média da classe: " + mediaClasse);

        scanner.close();
    }
}

