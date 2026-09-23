package Exercicios3;

public class Exercicio5 {
    public static void main(String[] args) {
        int numero = 5;
        int multiplicador = 1;

        while (multiplicador <= 10) {
            int resultado = numero * multiplicador;
            System.out.println(numero + " x " + multiplicador + " = " + resultado);
            multiplicador++;
        }
    }
}

