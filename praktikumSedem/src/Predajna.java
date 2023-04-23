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
            return e.toString();
        }

        return "V ponuke nic nemame";
    }
}
