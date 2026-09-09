import java.util.Scanner;
public class exercicio7{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o salário: ");
double salario = entrada.nextDouble();
System.out.print("Digite os anos de trabalho: ");
int anos = entrada.nextInt();
double bonus;
if (anos >= 5) {
bonus = salario * 0.20;
} else {
bonus = salario * 0.10;
}
System.out.println("Valor do bônus: R$ " + bonus);
entrada.close();
}
}