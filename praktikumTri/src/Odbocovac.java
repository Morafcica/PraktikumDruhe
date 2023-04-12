public class Odbocovac implements IVykonavac {
    private boolean vpravo;
    private Husenica husenica;

    public Odbocovac(boolean vpravo, Husenica husenica) {
        this.vpravo = vpravo;
        this.husenica = husenica;
    }


    @Override
    public void vykonaj() {
        Clanok pomocny = this.husenica.getPrvy();
        Platno platno = Platno.dajPlatno();
        while (pomocny != null) {
            if (!this.vpravo) {
                pomocny.posunSa(0, 10);
            } else {
                pomocny.posunSa(0, -10);
            }
            platno.wait(100);
            pomocny = pomocny.getNasledovnik();
        }
    }
}
