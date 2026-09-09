import java.util.Scanner;

public class jogo {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o número de pontos do jogador 1 na fase 1.");
        Double pontos = entrada.nextDouble();

        if (pontos >= 1000){
            System.out.println("Parabéns! Você passou para a fase 2.");
        }
        System.out.println("Siga para a próxima etapa.");
        entrada.close();

}
}
