import tvary.Obrazok;

public class Postava {
    protected int animacia;
    private int pocetObrazkov;
    protected Obrazok obrazok;
    private String nazov;

    public Postava(int pocetObrazkov, String nazov) {
        this.pocetObrazkov = pocetObrazkov;
        this.nazov = nazov;
        this.obrazok = new Obrazok("animacie/" + this.nazov + "/0.png");
    }

    public void krok() {
        if (this.animacia < this.pocetObrazkov) {
            this.animacia++;
            if (this.animacia == this.pocetObrazkov) {
                this.animacia = 0;
            }
            String s = String.format("animacie/%s/%d.png", this.nazov, this.animacia);
            this.obrazok.zmenObrazok(s);
            this.obrazok.zobraz();
        }
    }
}
