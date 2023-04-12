package nepriatelia;

import hrac.Lukostrelec;
import postava.Postava;

import java.util.ArrayList;

public abstract class Nepriatel extends Postava {

    private UkazovatelHP hp;

    private int rychlost;

    public Nepriatel(int pocetObrazkov, String nazov, int poziciaY, int rychlost) {
        super(pocetObrazkov, nazov);

        this.obrazok.zmenPolohu(-100, poziciaY);
        this.rychlost = rychlost;

        this.hp = new UkazovatelHP(this.obrazok.getPolohaX(), this.obrazok.getPolohaY());
    }

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
        if (this.hp.getHp() <= 0) {
            this.obrazok.skry();
            this.hp.skry();
            return true;
        }
        return false;
    }

    public abstract void zautoc(ArrayList<Lukostrelec> lukostrelci);

}
