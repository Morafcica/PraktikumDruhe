import hrac.Lukostrelec;
import nepriatelia.Kopijnik;
import nepriatelia.Legionar;
import nepriatelia.Nepriatel;
import nepriatelia.UkazovatelHP;
import tvary.Obdlznik;
import tvary.Obrazok;
import tvary.Platno;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;
import java.util.ArrayList;
import java.util.Random;

public abstract class Main {

    public static void main(String[] args) {
        ArrayList<Lukostrelec> lukostrelci = new ArrayList<>();
        Platno.dajPlatno().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                lukostrelci.add(new Lukostrelec(e.getX() - 60, e.getY() - 90));
            }
        });

        ArrayList<Nepriatel> nepriatelia = new ArrayList<>();
        Random r = new Random();

        while (true) {
            if (nepriatelia.size() < 5){
                if (r.nextBoolean()) {
                    nepriatelia.add(new Kopijnik(r.nextInt(500), 4));
                } else {
                    nepriatelia.add(new Legionar(r.nextInt(500), 6));
                }
            }


            for (int i = 0; i < lukostrelci.size(); i++) {
                lukostrelci.get(i).krok();
                lukostrelci.get(i).vystrelNa(nepriatelia);
            }

            for (int i = 0; i < nepriatelia.size(); i++) {
                nepriatelia.get(i).krok();
                nepriatelia.get(i).zautoc(lukostrelci);
            }

            //Platno.dajPlatno().wait(50);
        }

    }
}
