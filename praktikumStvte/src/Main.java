import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Lukostrelec> lukostrelci = new ArrayList<>();
        ArrayList<Nepriatel> nepriatelia = new ArrayList<>();
        tvary.Platno.dajPlatno().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                lukostrelci.add(new Lukostrelec(e.getX(), e.getY()));
            }
        });

        Random r = new Random();
        while (true) {
            if (nepriatelia.size() < 5) {
                if (r.nextDouble() > 0.5) {
                    nepriatelia.add(new Kopijnik(6, "kopija", r.nextInt(500), 3));
                } else {
                    nepriatelia.add(new Legionar(6, "mec", r.nextInt(500), 3));
                }
            }

            for (int i = 0; i < lukostrelci.size(); i++) {
                lukostrelci.get(i).krok();
                lukostrelci.get(i).vystrelNa(nepriatelia);

            }

            for (Nepriatel nepriatel : nepriatelia) {
                nepriatel.krok();
            }
        }

    }
}