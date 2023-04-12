public class Main {
    public static void main(String[] args) {
        Skola skola = new Skola("Uniza v unize v Unize");
        Ucitel ucitel1 = new Ucitel("Igor", "Igorovsky", "Ing", "PhD");
        Ucitel ucitel2 = new Ucitel("Vlastislav", "Vlastislavovsky", "Mgr", "PhD");
        Ucitel ucitel3 = new Ucitel("Bolibruch", "Bolibruchovsky", "ThDr", "PhD");
        Trieda trieda1 = new Trieda("1. A");
        Trieda trieda2 = new Trieda("2. V");
        Student student1 = new Student("Sarah", "Sarahova", "123", 1);
        Student student2 = new Student("Viktoria", "Viktorova", "124", 1);
        Student student3 = new Student("Magra", "Magdovska", "111", 2);
        Student student4 = new Student("Margaretka", "Margaretkova", "112", 2);

        skola.pridajTriedu(trieda1);
        skola.pridajTriedu(trieda2);
        skola.pridajUcitela(ucitel1);
        skola.pridajUcitela(ucitel2);
        skola.pridajUcitela(ucitel3);
        skola.pridajStudentaDoTriedy("1. A", student1);
        skola.pridajStudentaDoTriedy("1. A", student2);
        skola.pridajStudentaDoTriedy("2. V", student3);
        skola.pridajStudentaDoTriedy("2. V", student4);
        skola.vypisVsetko();
    }
}