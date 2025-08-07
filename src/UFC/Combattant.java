package UFC;

public class Combattant {
    private String id;
    private String nom;
    private String prenom;
    private String nomDeCombat;
    private double poids;
    private String[] titres;

    public Combattant(String id, String nom, String prenom, String nomDeCombat, double poids, String[] titres) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.nomDeCombat = nomDeCombat;
        this.poids = poids;
        this.titres = titres;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public String getNomDeCombat() {
        return nomDeCombat;
    }
    public void setNomDeCombat(String nomDeCombat) {
        this.nomDeCombat = nomDeCombat;
    }
    public double getPoids() {
        return poids;
    }
    public void setPoids(double poids) {
        this.poids = poids;
    }
    public String[] getTitres() {
        return titres;
    }
    public void setTitres(String[] titres) {
        this.titres = titres;
    }

    public void updateRecord(boolean winner, boolean defeat) {

    }

    public void addTitle(String titre) {
    }
}
