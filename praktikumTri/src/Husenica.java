public class Husenica {
    private Clanok prvy;
    private Clanok posledny;

    public void pridajClanok(Clanok clanok) {
        if (this.prvy == null) {
            clanok.posunSa(250, 100);
            this.prvy = clanok;
        } else {
            clanok.posunSa(this.posledny.getPoziciaX() + this.posledny.getPriemer(), this.posledny.getPoziciaY());
            this.posledny.setNasledovnik(clanok);
            clanok.setPredchodca(this.posledny);
        }

        this.posledny = clanok;
    }

    public Clanok getPrvy() {
        return this.prvy;
    }

    public void spracuj() {
        Clanok pomocny = this.prvy;
        Platno platno = Platno.dajPlatno();
        while (pomocny != null) {
            pomocny.getVykonavac().vykonaj();
            platno.wait(100);
            pomocny = pomocny.getNasledovnik();
        }
    }
}
