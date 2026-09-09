import java.util.Scanner;
public class exercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o numero inteiro");
int numero = entrada.nextInt();
if (numero>20) {
    System.out.println("A metade do número é: " + (numero / 2.0));
}
entrada.close();
}
}
