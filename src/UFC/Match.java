package UFC;

public class Match {
    private String id;
    private String date;
    private String endroit;
    private Combattant combattant1;
    private Combattant combattant2;

    public Match(String id, String date, String endroit, Combattant combattant1, Combattant combattant2) {
        this.id = id;
        this.date = date;
        this.endroit = endroit;
        this.combattant1 = combattant1;
        this.combattant2 = combattant2;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getEndroit() {
        return endroit;
    }
    public void setEndroit(String endroit) {
        this.endroit = endroit;
    }
    public Combattant getCombattant1() {
        return combattant1;
    }
    public void setCombattant1(Combattant combattant1) {
        this.combattant1 = combattant1;
    }
    public Combattant getCombattant2() {
        return combattant2;
    }
    public void setCombattant2(Combattant combattant2) {
        this.combattant2 = combattant2;
    }
}
