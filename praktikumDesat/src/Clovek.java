public abstract class Clovek {
    private String meno;
    private String priezvisko;

    public Clovek(String meno, String priezvisko) {
        this.meno = meno;
        this.priezvisko = priezvisko;
    }

    @Override
    public String toString() {
        return this.meno + " " + this.priezvisko;
    }

    public abstract String vypisCinnost();
}
