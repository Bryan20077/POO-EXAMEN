package UFC;

import java.util.ArrayList;
import java.util.List;

public class Combattant {
    private final String id;
    private final String firstName;
    private final String lastName;
    private final String nickname;
    private final double weight;
    private final List<String> titles;
    private int wins;
    private int losses;
    private int draws;

    public Combattant(String id, String firstName, String lastName, String nickname, double weight) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.nickname = nickname;
        this.weight = weight;
        this.titles = new ArrayList<>();
        this.wins = 0;
        this.losses = 0;
        this.draws = 0;
    }

    public void addTitle(String title) {
        titles.add(title);
    }

    public void updateRecord(boolean won, boolean draw) {
        if (draw) {
            draws++;
        } else if (won) {
            wins++;
        } else {
            losses++;
        }
    }

    public String getId() {
        return id;
    }

    public List<String> getTitles() {
        return new ArrayList<>(titles);
    }

    public int getWins() {
        return wins;
    }

    public int getLosses() {
        return losses;
    }

    public int getDraws() {
        return draws;
    }
}