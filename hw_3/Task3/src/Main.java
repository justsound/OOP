import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Team> teams = new ArrayList<>();
        teams.add(new Team("Football", "Barcelona", 25.000, 1));
        teams.add(new Team("Basketball", "LA Lakers",100.000, 1));
        teams.add(new Team("Football", "Arsenal",20.000, 2));
        teams.add(new Team("Hockey", "Dallas Stars",70.000, 3));
        teams.add(new Team("Basketball", "LA Clippers",100.000, 5));


        Comparator<Team> rateAndBudgetComparator = new Comparator<Team>() {
            @Override
            public int compare(Team o1, Team o2) {
                int rateCompare =  o1.getRate() - o2.getRate();
                if (rateCompare != 0) {
                    return rateCompare;
                }
                return (int) (o1.getBudget()- o2.getBudget());
            }
        };

        teams.sort(rateAndBudgetComparator);

        for (Team team: teams) {
            System.out.println(team);
        }
    }
}
