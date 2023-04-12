package postava;

import tvary.Obrazok;

public class Postava {

    protected int animacia;
    private int pocetObrazkov;
    protected Obrazok obrazok;
    private String nazov;

    public Postava(int pocetObrazkov, String nazov) {
        this.nazov = nazov;
        this.obrazok = new Obrazok("src/animacie/" + this.nazov + "/0.png");
        this.pocetObrazkov = pocetObrazkov;
    }

    public void krok() {
        this.animacia++;
        this.obrazok.zmenObrazok("src/animacie/" + this.nazov + "/" + (this.animacia % this.pocetObrazkov) + ".png");
        this.obrazok.zobraz();
    }

    public Obrazok getObrazok() {
        return this.obrazok;
    }
}
