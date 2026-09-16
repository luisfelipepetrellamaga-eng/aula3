import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        System.out.print("Digite o código do produto: ");
        Scanner entrada = new Scanner(System.in);


        int codigo = entrada.nextInt();

        System.out.print("Digite a quantidade: ");
        int quantidade = entrada.nextInt();

        double preco = 0;
        String produto = "";
        boolean codigoValido = true;

        // Processamento com switch-case
        switch (codigo) {
            case 100:
                produto = "Cachorro quente";
                preco = 1.20;
                break;
            case 101:
                produto = "Bauru simples";
                preco = 1.30;
                break;
            case 102:
                produto = "Bauru com ovo";
                preco = 1.50;
                break;
            case 103:
                produto = "Hambúrguer";
                preco = 1.20;
                break;
            case 104:
                produto = "Cheeseburguer";
                preco = 1.30;
                break;
            case 105:
                produto = "Refrigerante";
                preco = 1.00;
                break;
            default:
                System.out.println("Código inválido!");
                codigoValido = false;
        }

        // Só calcula e imprime se o código for válido
        if (codigoValido) {
            double valorTotal = preco * quantidade;
            System.out.println("Produto: " + produto);
            System.out.println("Quantidade: " + quantidade);
            System.out.println("Valor a pagar: R$ " + valorTotal);
        }

        entrada.close();
    }
}
    
