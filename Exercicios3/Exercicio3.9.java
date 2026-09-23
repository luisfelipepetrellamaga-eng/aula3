package Exercicios3;
import java.util.Scanner;
public class Exercicio9 {
 public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int codigo;
        int quantidade;
        double total = 0.0;

        System.out.println("Cardápio:");
        System.out.println("100 - Cachorro quente   R$ 1,20");
        System.out.println("101 - Bauru simples     R$ 1,30");
        System.out.println("102 - Bauru com ovo     R$ 1,50");
        System.out.println("103 - Hambúrguer        R$ 1,20");
        System.out.println("104 - Cheeseburguer     R$ 1,30");
        System.out.println("105 - Refrigerante      R$ 1,00");
        System.out.println("-----------------------------------");

        char continuar = 'S';
        while (continuar == 'S' || continuar == 's') {
            System.out.print("Digite o código do produto: ");
            codigo = entrada.nextInt();

            System.out.print("Digite a quantidade: ");
            quantidade = entrada.nextInt();

            switch (codigo) {
                case 100: total += quantidade * 1.20; break;
                case 101: total += quantidade * 1.30; break;
                case 102: total += quantidade * 1.50; break;
                case 103: total += quantidade * 1.20; break;
                case 104: total += quantidade * 1.30; break;
                case 105: total += quantidade * 1.00; break;
                default: System.out.println("Código inválido!");
            }

            System.out.print("Deseja pedir outro item? (S/N): ");
            continuar = entrada.next().charAt(0);
        }

        System.out.println("Valor total da compra: R$ " + total);

        entrada.close();
    }
}
    

