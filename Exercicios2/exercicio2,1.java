package Exercicios2;
import java.util.Scanner;

public class exercicio1 {
public static void main (String[] args){
    System.out.println("Dias da semanas");

    Scanner entrada = new Scanner(System.in);
int dia = entrada.nextInt();

switch (dia){

    case 1:
        System.out.println("1- domingo");
        break;

        case 2:
        System.out.println("2- segunda");
        break;

        case 3:
        System.out.println("3- terça");
        break;

        case 4:
        System.out.println("4- quarta");
        break;

        case 5:
        System.out.println("5- quinta");
        break;
        
        case 6:
        System.out.println("6- sexta");
        break;

        case 7:
        System.out.println("7- sabado");
        break;

        default:
            System.out.println("não foi possivel selecionar o dia");

            entrada.close();


}
}

}
