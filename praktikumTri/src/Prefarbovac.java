public class Prefarbovac implements IVykonavac {
    private Kruh kruh;

    public Prefarbovac(Kruh kruh) {
        this.kruh = kruh;
    }

    @Override
    public void vykonaj() {
        this.kruh.zmenFarbu("green");
    }
}
