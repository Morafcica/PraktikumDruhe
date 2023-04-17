public class Surovina {
    private double hmotnost;
    private String nazov;
    private boolean veganska;
    private double cena;

    public Surovina(double hmotnost, String nazov, boolean veganska, double cena) {
        this.hmotnost = hmotnost;
        this.nazov = nazov;
        this.veganska = veganska;
        this.cena = cena;
    }

    public String getNazov() {
        return nazov;
    }

    public double getHmotnost() {
        return hmotnost;
    }

    public boolean isVeganska() {
        return veganska;
    }

    public double getCena() {
        return cena;
    }

    public Alergen vypisAlergeny() {
        return null;
    }
}
