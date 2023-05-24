
import java.nio.file.Paths;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        int count = 0, winCount = 0, lossCount = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("File:");
        String file = scanner.nextLine();
        System.out.println("Team:");
        String team = scanner.nextLine();

        try (Scanner scanFile = new Scanner(Paths.get(file))) {

            while (scanFile.hasNextLine()) {
                String newLine = scanFile.nextLine();
                String[] array = newLine.split(",");
                // csv format team1/team2/score1/score2
                String[] teams = {array[0], array[1]};
                int[] scores = {Integer.valueOf(array[2]), Integer.valueOf(array[3])};

                if (team.equals(teams[0])) {
                    if (scores[0] < scores[1]) {
                        lossCount++;
                    } else if (scores[0] > scores[1]) {
                        winCount++;
                    }
                }
                if (team.equals(teams[1])) {
                    if (scores[0] > scores[1]) {
                        lossCount++;
                    } else if (scores[0] < scores[1]) {
                        winCount++;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        count = winCount + lossCount;
        System.out.println("Games: " + count);
        System.out.println("Wins: " + winCount);
        System.out.println("Losses: " + lossCount);
    }

}
