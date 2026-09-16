
import java.util.Scanner;

public class Exercicio3{
    public static void main (String [] args){
        System.out.println("Digite o período em que você estuda(M - Matutino, V - Vespertino, N - Noturno): ");
        Scanner entrada = new Scanner (System.in);
        char periodo = entrada.next().charAt(0);


        switch (periodo){

            case 'M': 
            System.out.println("Bom dia");
            break;

            case 'V':
                System.out.println("Boa tarde");
                break;

                case 'N':
                    System.out.println("Boa noite");
                    break;

                    default:
                        System.out.println("Período invalido!");
        }
        entrada.close();

        }


    }
    
