public class Cukraren extends Predajna {

    public Cukraren(String nazov) {
        super(nazov);
    }

    @Override
    public String otvaracieHodiny() {
        StringBuilder sb = new StringBuilder();
        sb.append("Otvaracie hodiny:\n");
        sb.append("Pondelok - Piatok 10:00 - 15:00\n");
        sb.append("Sobota - Nedela zatvorene\n");
        sb.append(String.format("%s", "*".repeat(25)));
        return sb.toString();
    }
}
