import java.util.ArrayList;

public class Kolacik {
    private String nazov;
    private double cena;
    private int hmotnost;
    private ArrayList<Alergen> alergeny;

    public Kolacik(String nazov, double cena, int hmotnost) {
        this.nazov = nazov;
        this.cena = cena;
        this.hmotnost = hmotnost;
        this.alergeny = new ArrayList<>();
    }

    public void pridajAlergen(Alergen alergen) {
        this.alergeny.add(alergen);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%s -> Hmotnost:%dg Cena:%f\n", this.nazov, this.hmotnost, this.cena));
        sb.append("   Alergeny: ");
        for (Alergen alergen : this.alergeny) {
            sb.append(alergen.toString() + " ");
        }

        String vysledok = String.valueOf(sb);
        return vysledok;
    }
}
