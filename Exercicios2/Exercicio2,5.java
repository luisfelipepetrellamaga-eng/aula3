import java.util.Scanner;
public class Exercicio5 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

    
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        
        System.out.print("Digite a opção desejada (M - média, S - diferença, P - produto, D - divisão): ");
        char opcao = scanner.next().charAt(0);

        switch (opcao) {
            case 'M':
                double media = (num1 + num2) / 2;
                System.out.println("Média: " + media);
                break;

            case 'S':
                double diferenca = Math.abs(num1 - num2);
                System.out.println("Diferença do maior pelo menor: " + diferenca);
                break;

            case 'P':
                double produto = num1 * num2;
                System.out.println("Produto: " + produto);
                break;

            case 'D':
                if (num2 != 0) {
                    double divisao = num1 / num2;
                    System.out.println("Divisão: " + divisao);
                } else {
                    System.out.println("Erro: divisão por zero não permitida.");
                }
                break;
            default:
                System.out.println("Opção inválida!");
        }

        scanner.close();
    }
}
    

