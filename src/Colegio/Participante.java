package Colegio;
import java.util.Random;

public class Participante {
    String playerName;
    String playerLastname;
    Random random = new Random();
    int randomNumber;

    public  Participante() {
        randomNumber = 1 + random.nextInt(6);
    }

    public int getRandomNumber() {
        randomNumber = 1 + random.nextInt(6);
        return randomNumber;
    }
}
