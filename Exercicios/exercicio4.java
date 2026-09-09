import java.util.Scanner;
public class exercicio4{
public static void main(String[] args){
Scanner entrada = new Scanner(System.in);
System.out.print("Digite o primeiro número: ");
double num1 = entrada.nextDouble();
System.out.print("Digite o segundo número: ");
double num2 = entrada.nextDouble();
if (num1 > num2) {
System.out.println("Ordem decrescente: " + num1 + " , " + num2);
} else {
System.out.println("Ordem decrescente: " + num2 + " , " + num1);
}
entrada.close();
}
}




