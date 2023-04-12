public class Vrana implements IVtacik, ILietajuci {
    private Obrazok vrana;
    public Vrana() {
        this.vrana = new Obrazok("images/vrana1.png");
        this.vrana.zmenPolohu(100, 400);
        this.vrana.zobraz();
    }

    @Override
    public void lietaj() {
        this.vrana.zmenObrazok("images/vrana2.png");
        this.vrana.posunVodorovne(25);
        Platno platno = Platno.dajPlatno().wait(500);
        this.vrana.zmenObrazok("images/vrana1.png");
    }

    @Override
    public void znesVajce() {
        Obrazok vajce = new Obrazok("images/vajce.png");
        vajce.zmenPolohu(this.vrana.getPolohaX(), this.vrana.getPolohaY());
        vajce.zobraz();
    }
}
