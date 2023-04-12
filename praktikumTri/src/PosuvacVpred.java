public class PosuvacVpred implements IVykonavac {
    private Husenica husenica;

    public PosuvacVpred(Husenica husenica) {
        this.husenica = husenica;
    }

    @Override
    public void vykonaj() {
        Clanok clanok = this.husenica.getPrvy();
        Platno platno = Platno.dajPlatno();
        while (clanok != null) {
            clanok.posunSa(-10, 0);
            platno.wait(100);
            clanok = clanok.getNasledovnik();
        }
    }


}
