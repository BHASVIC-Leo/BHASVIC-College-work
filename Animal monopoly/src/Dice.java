
import java.util.Random;
public class Dice {
    private int dice1;
    private int dice2;
    private int total;

    public Dice(){
    }

    public int diceRoll() {
        Random randomDice = new Random();
        //testing
            dice1 = (int) (Math.random() * 6) + 1;
            dice2 = (int) (Math.random() * 6) + 1;
            total = dice1 + dice2;
            System.out.println("You rolled a " + dice1 + " and a " + dice2 + " totalling to " + total);
            if (dice1 == dice2) {
                System.out.println("Double!");
                //drawCard()
            }
        return this.total;
    }
}
