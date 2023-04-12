package nepriatelia;

import tvary.Obdlznik;

public class UkazovatelHP {

    private int hp;
    private Obdlznik vonkajsi;
    private Obdlznik vnutorny;

    public UkazovatelHP(int x, int y) {
        this.hp = 100;
        this.vonkajsi = new Obdlznik(x, y, 104, 12, "black");
        this.vnutorny = new Obdlznik(x+2, y+2, 100, 8, "green");
    }

    public void uberHp(int kolko) {
        this.hp -= kolko;
        this.vnutorny.zmenStrany(hp, 8);
    }

    public void posunNa(int x, int y) {
        this.vonkajsi.posunNaXY(x, y);
        this.vnutorny.posunNaXY(x + 2,y + 2);
    }

    public int getHp() {
        return hp;
    }

    public void zobraz() {
        this.vonkajsi.zobraz();
        this.vnutorny.zobraz();
    }

    public void skry() {
        this.vonkajsi.skry();
        this.vnutorny.zobraz();
    }
}
