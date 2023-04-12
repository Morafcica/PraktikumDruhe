package nepriatelia;

import tvary.Obrazok;

public class Kopija {
    private int dostrel;
    private Obrazok kopija;
    private int povodnaPozicia;

    public Kopija(int dostrel, int x, int y) {
        this.kopija = new Obrazok("kopija.png");
        this.kopija.zmenPolohu(x, y);
        this.kopija.zobraz();
        this.dostrel = dostrel;
        this.povodnaPozicia = x;
    }

    public boolean let() {
        this.kopija.posunVodorovne(10);

        if (this.kopija.getPolohaX() >= this.povodnaPozicia + this.dostrel) {
            this.kopija.skry();
            return false;
        } else {
            this.kopija.zobraz();
            return true;
        }

    }


    public void skry() {
        this.kopija.skry();
    }
}
