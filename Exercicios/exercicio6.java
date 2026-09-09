import java.util.Scanner;
public class exercicio6{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite sua altura: ");
double altura = entrada.nextDouble();
System.out.print("Digite o sexo (M ou F): ");
char sexo = entrada.next().charAt(0);
if (sexo == 'M' || sexo == 'm') {
double pesoIdeal = (72.7 * altura) - 58;
System.out.println("Peso ideal: " + pesoIdeal);
} else {
double pesoIdeal = (62.1 * altura) - 44.7;
System.out.println("Peso ideal: " + pesoIdeal);
}
entrada.close();
}
}