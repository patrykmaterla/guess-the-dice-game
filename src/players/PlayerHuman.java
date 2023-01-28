package players;

import java.util.Scanner;

public class PlayerHuman extends Player {

    private Scanner scanner = new Scanner(System.in);

    public PlayerHuman() {
        super();
    }
    public PlayerHuman(String name) {
        super(name);
    }

    /**
     * The "guessing" method - the number given in the console.
     *
     * @return
     */
    @Override
    public int guess() {
        System.out.println("Enter a number (1-6): ");
        return scanner.nextInt();
    }

}
