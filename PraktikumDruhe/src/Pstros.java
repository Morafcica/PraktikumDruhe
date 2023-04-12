public class Pstros implements INelietajuci, IVtacik {
    private Obrazok pstros;
    public Pstros() {
        this.pstros = new Obrazok("images/pstros1.png");
        this.pstros.zmenPolohu(100, 100);
        this.pstros.zobraz();
    }

    @Override
    public void kracaj() {
        this.pstros.zmenObrazok("images/pstros2.png");
        this.pstros.posunVodorovne(50);
        Platno platno = Platno.dajPlatno().wait(500);
        this.pstros.zmenObrazok("images/pstros1.png");
    }

    @Override
    public void znesVajce() {
        Obrazok vajce = new Obrazok("images/vajce.png");
        vajce.zmenPolohu(this.pstros.getPolohaX(), this.pstros.getPolohaY());
        vajce.zobraz();
    }
}
