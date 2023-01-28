import players.Player;
import players.PlayerComp;
import players.PlayerHuman;
import statistics.WinStatistics;

/**
 * A game of guessing the drawn number.
 *
 * Rules:
 * - the game master (computer) throws the dice (draws numbers from the range 1..6)
 * - the player (also the computer) tries to guess the number (also draws)
 * - if he guesses right, the game ends
 * - if he does not guess, the next round begins (the computer draws another number and the player tries to guess it)
 */

public class Main {

    public static void main(String[] args) {

        Game game = new Game(new WinStatistics());

        Player p1 = new PlayerComp("Clu");
        Player p2 = new PlayerComp("Tron");
        Player p3 = new PlayerHuman("SamFlynn");

        game.addPlayer(p1);
        game.addPlayer(p2);
        game.addPlayer(p3);

        game.printPlayers();

        for (int i=0; i<100; ++i) {
            game.play();
        }

        game.statistics.print();

    }

}
