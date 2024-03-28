package Not_Finished.FootballTeamGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Team> teams = new ArrayList<>();

        String command = scanner.nextLine();
        while (!"END".equals(command)){

            String[] parts = command.split(";");
            switch (parts[0]){
                case "Team":
                    Team team = new Team(parts[1]);
                    teams.add(team);
                    break;
                case "Add":
                    boolean isTeamExist = false;
                    for (Team team1 : teams) {
                        if (team1.getName().equals(parts[1])) {
                            isTeamExist = true;
                            try {
                                Player player = new Player(parts[2], Integer.parseInt(parts[3]), Integer.parseInt(parts[4]),
                                        Integer.parseInt(parts[5]), Integer.parseInt(parts[6]) ,Integer.parseInt(parts[7]));
                                team1.addPlayer(player);
                            } catch (IllegalArgumentException exception) {
                                System.out.printf("%s%n",exception.getMessage());
                            }
                        }
                    }
                    if (!isTeamExist) {
                        System.out.printf("Team %s does not exist.%n", parts[1]);
                    }
                    break;

                case "Remove":
                    for (Team team1: teams) {
                        if (team1.getName().equals(parts[1])){
                            team1.removePlayer(parts[2]);
                        }
                    }
                    break;
                case "Rating":
                    boolean findTeam = false;

                    for (Team team1:teams) {
                        if (team1.getName().equals(parts[1])){
                            findTeam = true;
                            System.out.printf("%s - %.0f\n",team1.getName(), team1.getRating() );
                        }
                    }
                    if (!findTeam){
                        System.out.printf("Team %s does not exist.",parts[1]);
                    }
                    break;
            }

            command = scanner.nextLine();
        }


    }
}
