package players;

import java.util.Random;

public class PlayerComp extends Player {

    private Random random;

    public PlayerComp() {
        super();
        random = new Random();
    }
    public PlayerComp(String name) {
        super(name);
        random = new Random();
    }

    /**
     * The "guessing" method - the number is drawn by the computer.
     *
     * @return
     */
    @Override
    public int guess() {
        return random.nextInt(6)+1;
    }

}
