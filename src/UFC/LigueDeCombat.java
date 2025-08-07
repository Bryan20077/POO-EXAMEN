package UFC;

public class LigueDeCombat {
    private String nom;
    private String[] combattants;
    private String[] matchs;

    public LigueDeCombat(String nom) {
        this.nom = nom;
        this.combattants = new String[0];
        this.matchs = new String[0];
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String[] getCombattants() {
        return combattants;
    }
    public void setCombattants(String[] combattants) {
        this.combattants = combattants;
    }
    public String[] getMatchs() {
        return matchs;
    }
    public void setMatchs(String[] matchs) {
        this.matchs = matchs;
    }
    public void ajouterCombattant(Combattant combattant) {
        String[] nouveauxCombattants = new String[combattants.length + 1];
        System.arraycopy(combattants, 0, nouveauxCombattants, 0, combattants.length);
        nouveauxCombattants[combattants.length] = combattant.getId();
        this.combattants = nouveauxCombattants;
    }
    public void ajouterMatch(Match match) {
        String[] nouveauxMatchs = new String[matchs.length + 1];
        System.arraycopy(matchs, 0, nouveauxMatchs, 0, matchs.length);
        nouveauxMatchs[matchs.length] = match.getId();
        this.matchs = nouveauxMatchs;
    }
    @Override
    public String toString() {
        return "LigueDeCombat{" +
                "nom='" + nom + '\'' +
                ", combattants=" + String.join(", ", combattants) +
                ", matchs=" + String.join(", ", matchs) +
                '}';
    }

}
