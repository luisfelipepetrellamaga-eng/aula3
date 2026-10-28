import java.util.Random;
public class Aleatorio {
    public static void main (String[]args){
        Random random = new Random();
        int sorteado = 0 + random.nextInt(11);
        System.out.println("O número sorteado é "+sorteado);

    }
}
