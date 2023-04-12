public class Nepriatel extends Postava {
    private HPBar hp;
    private int rychlost;
    public Nepriatel(int pocetObrazkov, String nazov, int y, int rychlost) {
        super(pocetObrazkov, nazov);
        this.hp = new HPBar(-100, y);
        this.rychlost = rychlost;
    }

    @Override
    public void krok() {
        this.obrazok.posunVodorovne(this.rychlost);
        this.hp.posunNa(this.obrazok.getPolohaX(), this.obrazok.getPolohaY());
        this.hp.zobraz();
        super.krok();
    }

    public int getY() {
        return this.obrazok.getPolohaY();
    }

    public boolean uberHp(int kolko) {
        this.hp.uberHp(kolko);

        if (this.hp.getHP() <= 0) {
            this.obrazok.skry();
            this.hp.skry();
            return true;
        }

        return false;
    }
}
