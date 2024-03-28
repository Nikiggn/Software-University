package Not_Finished.FootballTeamGenerator;

import java.util.ArrayList;
import java.util.List;

public class Team {

    private String name;
    private List<Player> players;


    public Team(String name) {
        this.setName(name);
        this.players = new ArrayList<>();
    }


    public String getName() {
        return name;
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }

    public void removePlayer(String name) {
        boolean removedPlayer = false;
        for (Player player : this.players) {

            if (player.getName().equals(name)) {
                removedPlayer = true;
                this.players.remove(player);
                break;
            }
        }

        if (!removedPlayer) {
            System.out.printf("Player %s is not in %s team.\n", name, getName());
        }

    }

    public double getRating() {

        double sum = 0;

        if (this.players.isEmpty()) {
            return 0;
        }
        for (Player player : this.players) {
            sum += player.overallSkillLevel();
        }

        return Math.round(sum / this.players.size());
    }

    private void setName(String name) {
        if (name == null || name.trim().length() < 1) {
            System.out.println("A name should not be empty.");
        }
        this.name = name;
    }
}
