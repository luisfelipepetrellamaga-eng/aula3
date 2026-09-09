import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o salário: R$ ");
        double salario = entrada.nextDouble();

        if (salario <= 600) {
            System.out.println("Desconto do INSS: R$ 0,00");
        } else if (salario <= 1200) {
            double desconto = salario * 0.20;
            System.out.printf("Desconto do INSS: R$ %.2f%n", desconto);
        } else if (salario <= 2000) {
            double desconto = salario * 0.25;
            System.out.printf("Desconto do INSS: R$ %.2f%n", desconto);
        } else {
            double desconto = salario * 0.30;
            System.out.printf("Desconto do INSS: R$ %.2f%n", desconto);
        }

        entrada.close();
    }
}