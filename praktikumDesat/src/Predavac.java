public class Predavac extends Clovek {
    private int rokNastupu;
    private boolean aktualny;

    public Predavac(String meno, String priezvisko, int rokNastupu, boolean aktualny) {
        super(meno, priezvisko);
        this.rokNastupu = rokNastupu;
        this.aktualny = aktualny;
    }

    public int getRokNastupu() {
        return rokNastupu;
    }

    public void setRokNastupu(int rokNastupu) {
        this.rokNastupu = rokNastupu;
    }

    public boolean getAktualny() {
        return aktualny;
    }

    public void setAktualny(boolean aktualny) {
        this.aktualny = aktualny;
    }

    @Override
    public String toString() {
        return "Predavac " + super.toString() +
                " nastuúpil do zamestnania v roku " + this.rokNastupu +
                " a ma stav " + this.aktualny;
    }

    @Override
    public String vypisCinnost() {
        return "Pracujem";
    }
}
