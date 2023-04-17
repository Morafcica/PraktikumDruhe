import java.util.ArrayList;

public abstract class Predajna<E> {
    private String nazov;
    private ArrayList<E> ponuka;

    public Predajna(String nazov) {
        this.nazov = nazov;
        this.ponuka = new ArrayList<>();
    }

    public void pridajDoPonuky(E jedlo) {
        this.ponuka.add(jedlo);
    }

    public abstract String otvaracieHodiny();

    public String menu() {
        System.out.println(this.nazov);
        for (E e : this.ponuka) {
            if (e instanceof Pizza jedlo) {
                return jedlo.toString();
            } else if (e instanceof Kolacik jedlo) {
                return jedlo.toString();
            }
        }

        return "V ponuke nic nemame";
    }
}
