public class Potravina implements Tovar {
    private TypPotraviny typ;
    private String nazov;
    private double hmotnost;
    private boolean trvanliva;

    public Potravina(TypPotraviny typ, String nazov, double hmotnost, boolean trvanliva) {
        this.typ = typ;
        this.nazov = nazov;
        this.hmotnost = hmotnost;
        this.trvanliva = trvanliva;
    }

    public Potravina() {
        this.typ = TypPotraviny.OVOCIE;
        this.nazov = "Mandarinka";
        this.hmotnost = 0.2;
        this.trvanliva = false;
    }

    public TypPotraviny getTyp() {
        return typ;
    }

    public void setTyp(TypPotraviny typ) {
        this.typ = typ;
    }

    public String getNazov() {
        return nazov;
    }

    public void setNazov(String nazov) {
        this.nazov = nazov;
    }

    public double getHmotnost() {
        return hmotnost;
    }

    public void setHmotnost(double hmotnost) throws ZapornaHodnotaException {
        if (hmotnost < 0) {
            throw new ZapornaHodnotaException();
        }
        this.hmotnost = hmotnost;
    }

    public boolean isTrvanliva() {
        return trvanliva;
    }

    public void setTrvanliva(boolean trvanliva) {
        this.trvanliva = trvanliva;
    }

    @Override
    public String toString() {
        return this.typ + " " + this.nazov + " " + this.hmotnost + " " + this.trvanliva;
    }

    @Override
    public void vypisInfo() {
        System.out.println("POTRAVINA" + this.toString());
    }
}
