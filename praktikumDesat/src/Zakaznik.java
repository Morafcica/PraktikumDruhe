public class Zakaznik extends Clovek {


    public Zakaznik(String meno, String priezvisko) {
        super(meno, priezvisko);
    }

    @Override
    public String vypisCinnost() {
        return "Nakupujem!";
    }
}
