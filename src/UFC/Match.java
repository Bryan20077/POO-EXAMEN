package UFC;

import java.time.LocalDateTime;
import java.util.Objects;


public class Match {
    private final String id;
    private final LocalDateTime date;
    private final String location;
    private final TypeDeMatch type;
    private final Combattant fighter1;
    private final Combattant fighter2;
    private int fighter1Points;
    private int fighter2Points;
    private boolean isFinished;
    private Combattant winner;
    private final String title;

    public Match(String id, LocalDateTime date, String location, TypeDeMatch type, Combattant fighter1, Combattant fighter2) {
        if (type == null) {
            throw new IllegalArgumentException("type de match doit specifier");
        }
        this.id = id;
        this.date = date;
        this.location = location;
        this.type = type;
        this.fighter1 = fighter1;
        this.fighter2 = fighter2;
        this.fighter1Points = 0;
        this.fighter2Points = 0;
        this.isFinished = false;
        this.winner = null;
        this.title = type == TypeDeMatch.TITRE ? "titre de champion" : null;
    }

    public void addPoints(Combattant fighter, int points) {
        if (isFinished) {
            throw new IllegalStateException("ne peut pas ajouter des points");
        }
        if (Objects.equals(fighter.getId(), fighter1.getId())) {
            fighter1Points += points;
        } else if (Objects.equals(fighter.getId(), fighter2.getId())) {
            fighter2Points += points;
        } else {
            throw new IllegalArgumentException("combattant introuvable");
        }
    }

    public void finish() {
        if (isFinished) {
            throw new IllegalStateException("Match terminer");
        }
        isFinished = true;

        if (fighter1Points > fighter2Points) {
            winner = fighter1;
        } else if (fighter2Points > fighter1Points) {
            winner = fighter2;
        }

        if (type != TypeDeMatch.AMICAL) {
            if (winner == fighter1) {
                fighter1.updateRecord(true, false);
                fighter2.updateRecord(false, false);
            } else if (winner == fighter2) {
                fighter2.updateRecord(true, false);
                fighter1.updateRecord(false, false);
            } else {
                fighter1.updateRecord(false, true);
                fighter2.updateRecord(false, true);
            }

            if (type == TypeDeMatch.TITRE && winner != null) {
                winner.addTitle(title);
            }
        }
    }

    public Combattant getFighter1() {
        return fighter1;
    }

    public Combattant getFighter2() {
        return fighter2;
    }

    public Combattant getWinner() {
        return winner;
    }
}