public class Student {
    private String meno;
    private String priezvisko;
    private String rocneCislo;
    private int rocnik;

    public Student(String meno, String priezvisko, String rocneCislo, int rocnik) {
        this.meno = meno;
        this.priezvisko = priezvisko;
        this.rocneCislo = rocneCislo;

        if (rocnik <= 0) {
            System.out.println("Zaporny rocnik");
        } else {
            this.rocnik = rocnik;
        }
    }

    public Student() {

    }

    public String getMeno() {
        return meno;
    }

    public void setMeno(String meno) {
        this.meno = meno;
    }

    public String getPriezvisko() {
        return priezvisko;
    }

    public void setPriezvisko(String priezvisko) {
        this.priezvisko = priezvisko;
    }

    public String getRocneCislo() {
        return rocneCislo;
    }

    public void setRocneCislo(String rocneCislo) {
        this.rocneCislo = rocneCislo;
    }

    public int getRocnik() {
        return rocnik;
    }

    public void setRocnik(int rocnik) {
        if (rocnik <= 0) {
            System.out.println("Zaporny rocnik");
        } else {
            this.rocnik = rocnik;
        }
    }

    @Override
    public String toString() {
        return String.format("%s %s (%s) - %d. ročník", this.meno, this.priezvisko, this.rocneCislo, this.rocnik);
    }
}
