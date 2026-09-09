import java.util.Scanner;
public class exercicio3{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro numero");
        int num1=entrada.nextInt();
        System.out.println("Digite o segundo numero");
        int num2=entrada.nextInt();
        if (num1==num2){
            System.out.println("Números iguais");
        }else if (num1>num2){
            System.out.println("Diferença:   " + (num1 - num2));
            } else {

System.out.println("Diferença: " + (num2 - num1));
entrada.close();
    }
    }
}
