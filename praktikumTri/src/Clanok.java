public class Clanok {
    private Clanok predchodca;
    private Clanok nasledovnik;
    private int poziciaX;
    private int poziciaY;
    private Kruh kruh;
    private IVykonavac vykonavac;

    public Clanok() {
        this.kruh = new Kruh();
    }

    public Clanok(IVykonavac vykonavac) {
        this();
        vykonavac.vykonaj();
    }

    public int getPoziciaX() {
        return poziciaX;
    }

    public int getPoziciaY() {
        return poziciaY;
    }

    public Kruh getKruh() {
        return kruh;
    }

    public int getPriemer() {
        return this.kruh.getPriemer();
    }

    public IVykonavac getVykonavac() {
        return this.vykonavac;
    }

    public Clanok getNasledovnik() {
        return nasledovnik;
    }

    public void setVykonavac(IVykonavac vykonavac) {
        this.vykonavac = vykonavac;
    }

    public void setPredchodca(Clanok predchodca) {
        this.predchodca = predchodca;
    }

    public void setNasledovnik(Clanok nasledovnik) {
        this.nasledovnik = nasledovnik;
    }

    public void posunSa(int posunX, int posunY) {
        this.poziciaX += posunX;
        this.poziciaY += posunY;
        this.kruh.posunNaPoziciu(this.poziciaX, this.poziciaY);
    }
}
