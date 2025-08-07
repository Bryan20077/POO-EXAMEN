package UFC;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class LigueDeCombat {
    private final String name;
    private final List<Combattant> fighters;
    private final List<Match> matches;

    public LigueDeCombat(String name) {
        this.name = name;
        this.fighters = new ArrayList<>();
        this.matches = new ArrayList<>();
    }

    public void addFighter(Combattant combattant) {
        fighters.add((Combattant) fighters);
    }

    public Match createMatch(LocalDateTime date, String location, TypeDeMatch type, Combattant fighter1, Combattant fighter2) {
        if (type == null) {
            throw new IllegalArgumentException("TYpe de match introuvable");
        }
        if (!fighters.contains(fighter1) || !fighters.contains(fighter2)) {
            throw new IllegalArgumentException("Combattant doit être dans le ligue");
        }
        Match match = new Match(UUID.randomUUID().toString(), date, location, type, fighter1, fighter2);
        matches.add(match);
        return match;
    }

    public List<Match> getFighterMatches(Combattant fighter) {
        return matches.stream()
                .filter(match -> match.getFighter1().equals(fighter) || match.getFighter2().equals(fighter))
                .collect(Collectors.toList());
    }
}