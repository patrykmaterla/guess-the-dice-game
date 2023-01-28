import players.Player;
import statistics.NullStatistics;
import statistics.Statistics;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Game {
    private List<Player> players = new ArrayList<Player>();
    private Random random = new Random();
    public final Statistics statistics;

    public Game() {
        this(null); // statistics = null;
    }
    public Game(Statistics statistics) {
        if (statistics != null)
            this.statistics = statistics;
        else
            this.statistics = new NullStatistics();
    }

    public void addPlayer(Player player) {
        if (!nameExists(player.getName()))
            players.add(player);
        else {
            player.setName(player.getName() + random.nextInt(10));
            players.add(player);
        }
    }

    private boolean nameExists(String name) {
        for (Player player : players) {
            if (player.getName().equals(name))
                return true;
        }
        return false;
    }

    /*
    public void removePlayer(players.Player name) {
        if (players.size() == 1)
            players.remove(0);
        else {
            for (players.Player player : players) {
                players.remove(name);
            }
        }
    }
     */

    /*
    public void removePlayer(String name) {
        for (Iterator<players.Player> it = players.iterator(); it.hasNext();) {
            if (it.next().getName().equals(name)) {
                it.remove();
            }
        }
    }
     */

    public void removePlayer(String name) {
        players.removeIf( player -> player.getName().equals(name) );
    }

    public void printPlayers() {
        System.out.println("####PLAYERS####");
        for (Player player : players) {
            System.out.println(player.getName());
        }
        System.out.println("###############");
    }

    public void play() {
        int number;
        int guess;
        boolean repeat;

        do {
            System.out.println('\n' + "-----------------");

            repeat = true;

            number = random.nextInt(6) + 1;
            System.out.println("Dice Roll Result" + ": " + number);

            for (Player player : players) {
                guess = player.guess();
                System.out.println(player.getName() + ": " + guess);

                if (number != guess)
                    System.out.println(player.getName() + " didn't guess the right number!");
                else {
                    System.out.println(player.getName() + " guessed the right number and score the point!");
                    repeat = false;
                    statistics.andTheWinnerIs(player);
                }
            }
        } while (repeat);
    }

}
