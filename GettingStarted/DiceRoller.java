import java.util.Random;

public class DiceRoller {
    private Random random;

    public DiceRoller() {
        random = new Random();
    }

    /**
     * @return integer result signifying the roll outcome;
     */
    public int roll() {
        int number = random.nextInt(6) + 1;
        return number;
    }
}