import java.util.ArrayList;

public class Pizza {
    private ArrayList<Surovina> suroviny;
    private String nazov;
    private boolean jeVeganska;
    public Pizza(String nazov) {
        this.nazov = nazov;
        this.suroviny = new ArrayList<>();
    }

    public void pridajSurovinu(Surovina surovina) {
        this.suroviny.add(surovina);
    }

    public boolean jeVeganska() {
        return this.jeVeganska;
    }

    public void zveganciPizzu() {
        for (Surovina surovina : this.suroviny) {
            if (!surovina.isVeganska()) {
                this.suroviny.remove(surovina);
            }
        }
    }

    public double dajHmotnost() {
        double hmotnost = 0;
        for (Surovina surovina : this.suroviny) {
            hmotnost += surovina.getHmotnost();
        }

        return hmotnost;
    }

    public double dajCenu() {
        double cena = 0;
        for (Surovina surovina : this.suroviny) {
            cena += surovina.getCena();
        }
        return cena;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%s -> Hmotnost:%fg Cena:%f\n", this.nazov, this.dajHmotnost(), this.dajCenu()));
        sb.append("   Zlozenie: ");
        for (Surovina surovina : this.suroviny) {
            sb.append(surovina.getNazov() + ", ");
        }

        sb.append("\n");
        sb.append("   Alergeny: ");
        for (Surovina surovina : this.suroviny) {
            sb.append(surovina.vypisAlergeny() + ", ");
        }

        String vysledok = String.valueOf(sb);
        return vysledok;
    }
}
