import java.util.Random;

public class DiceRoller {
    public DiceRoller() {
        Random random = new Random();
        var number = 0;
        roll(random, number);
    }

    public void roll(Random random, int number) {
        number = random.nextInt(6) + 1;
        System.out.println(number);
    }
}
