public class ParadajkovaDrt extends Surovina {
    public ParadajkovaDrt(double hmotnost, double cena) {
        super(hmotnost, "paradajkova drt", true, cena);
    }

    @Override
    public Alergen vypisAlergeny() {
        return null;
    }
}
