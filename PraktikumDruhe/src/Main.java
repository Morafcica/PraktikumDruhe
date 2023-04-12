import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<IVtacik> zoznamVtakov = new ArrayList<>();
        zoznamVtakov.add(new Pstros());
        zoznamVtakov.add(new Vrana());
        Random r = new Random();


        while (true) {
            for (IVtacik iVtacik : zoznamVtakov) {
                if (iVtacik instanceof INelietajuci nazov) {
                    nazov.kracaj();
                } else if (iVtacik instanceof ILietajuci nazov) {
                    nazov.lietaj();
                }
                if (r.nextInt(100) <= 15) {
                    iVtacik.znesVajce();
                }
            }
        }
    }
}