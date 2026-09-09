import java.util.Scanner;
public class JogoAdivinha {
public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);
System.out.println("Digite seu palpite"); 
int palpite = entrada.nextInt();
if (palpite == 15) {
System.out.println("Você acertou!!!");
}else if (palpite < 15) {
System.out.println("Seu palpite está abaixo!!!");
}else {
System.out.println("Seu palpite está acima");
}
entrada.close();
      }
}
