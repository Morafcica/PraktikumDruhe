import tvary.Obdlznik;

public class HPBar {
    private int hp;
    private Obdlznik vonkajsi;
    private Obdlznik vnutorny;

    public HPBar(int x, int y) {
        this.vonkajsi = new Obdlznik(x, y, 104, 12, "black");
        this.vnutorny = new Obdlznik(x, y, 100, 8, "red");
        this.vnutorny.zobraz();
        this.vonkajsi.zobraz();
        this.hp = 100;
    }

    public void uberHp(int kolko) {
        this.hp -= kolko;
        this.vnutorny.zmenStrany(this.hp, 8);
    }

    public void posunNa(int x, int y) {
        this.vonkajsi.posunNaXY(x, y);
        this.vnutorny.posunNaXY(x, y);
    }

    public int getHP() {
        return this.hp;
    }

    public void zobraz() {
        this.vonkajsi.zobraz();
        this.vnutorny.zobraz();
    }

    public void skry() {
        this.vonkajsi.skry();
        this.vnutorny.skry();
    }
}
