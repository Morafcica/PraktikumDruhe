public class Trieda {
    private String nazov;
    private static final int KAPACITA = 30;
    private Student[] zoznamStudentov;
    public Trieda(String nazov) {
        this.zoznamStudentov = new Student[KAPACITA];
        this.nazov = nazov;
    }

    public String getNazov() {
        return this.nazov;
    }

    public boolean pridajStudenta(Student student) {
        for (int i = 0; i < this.zoznamStudentov.length; i++) {
            if (this.zoznamStudentov[i] == null) {
                this.zoznamStudentov[i] = student;
                return true;
            }
        }
        return false;
    }

    public boolean odoberStudenta(String rocneCislo) {
        int pocet = 0;
        for (Student s : this.zoznamStudentov) {
            if (s.getRocneCislo().equals(rocneCislo)) {
                this.zoznamStudentov[pocet] = null;
                return true;
            }
            pocet++;
        }
        return false;
    }

    public void vypis() {
        int poradie = 1;
        System.out.println("Trieda " + this.nazov + ":");
        for (Student s : this.zoznamStudentov) {
            if (s != null) {
                System.out.println(String.format("%d. %s %s", poradie, s.getMeno(), s.getPriezvisko()));;
                poradie++;
            }
        }
    }
}
