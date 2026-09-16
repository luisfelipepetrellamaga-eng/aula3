import java.util.Scanner;
public class Exercicio4 {
    public static void main (String [] args){
        System.out.println("Digite seu plano:A,B,C");
         Scanner entrada = new Scanner (System.in);
        char plano = entrada.next().charAt(0);

        System.out.print("Digite o salário atual: ");
        Double salario = entrada.nextDouble();
        double novosalario;


        switch (plano){

            case 'A': 
            novosalario = salario*1.10;//aumento de 10%
            System.out.println("Novo salário: R$ " + novosalario);
                break;

                case 'B':
                    novosalario = salario*1.15;//aumento de 15%
                    System.out.println("Novo salário: R$ " + novosalario);
                break;

                case 'C':
                    novosalario = salario*1.20;//aumento de 20%
                    System.out.println("Novo salário: R$ " + novosalario);
                break;

                default:
                    System.out.println("Não foi possível ver seu salario");
        }
                entrada.close();
    }

}




        

