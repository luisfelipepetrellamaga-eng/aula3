import java.util.Scanner;
public class Exercicio8 {
public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);
System.out.print("Digite a senha: ");
String senha = entrada.next();
if (senha.equals("R10p5")) {
System.out.println("Acesso concedido");
} else {
System.out.println("Acesso negado");
}
entrada.close();
}
}