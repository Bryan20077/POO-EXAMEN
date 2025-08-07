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

}
