package statistics;

import statistics.Statistics;
import players.Player;
import java.util.HashMap;
import java.util.Map;


public class WinStatistics implements Statistics {

    private Map<Player, Integer> statistics = new HashMap();

    @Override
    public void andTheWinnerIs(Player player) {
        int score = statistics.getOrDefault(player, 0);
        score += 1;
        statistics.put(player, score);
    }

    @Override
    public void print() {
        System.out.println("#############");
        statistics.forEach((player, score) -> {
            System.out.println(player.getName() +": " + score);
        });
    }

    @Override
    public void clear() {
        statistics.clear();
    }

}
