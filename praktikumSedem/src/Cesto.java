public class Cesto extends Surovina {
    public Cesto(double hmotnost, double cena) {
        super(hmotnost, "cesto", true, cena);
    }

    @Override
    public Alergen vypisAlergeny() {
        return Alergen.OBILNINY;
    }
}
