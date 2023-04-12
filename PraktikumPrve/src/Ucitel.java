public class Ucitel {
    private String meno;
    private String priezvisko;
    private String titulPredMenom;
    private String titulZaMenom;

    public Ucitel(String meno, String priezvisko, String titulPredMenom, String tutulZaMenom) {
        this.meno = meno;
        this.priezvisko = priezvisko;
        this.titulPredMenom = titulPredMenom;
        this.titulZaMenom = tutulZaMenom;
    }

    public String getMeno() {
        return meno;
    }

    public String getPriezvisko() {
        return priezvisko;
    }

    public String getTitulPredMenom() {
        return titulPredMenom;
    }

    public String getTitulZaMenom() {
        return titulZaMenom;
    }

    public String toString() {
        return String.format("%s. %s %s, %s", this.titulPredMenom, this.meno, this.priezvisko, this.titulZaMenom);
    }
}
