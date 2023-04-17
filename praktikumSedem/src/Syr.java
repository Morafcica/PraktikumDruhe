public class Syr extends Surovina {
    public Syr(double hmotnost, double cena) {
        super(hmotnost, "syr", true, cena);
    }

    @Override
    public Alergen vypisAlergeny() {
        return Alergen.MLIEKO;
    }
}
