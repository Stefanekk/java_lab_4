public class Student implements StudentI{
    private String nazwisko;
    private String imie;
    private int indeks;
    private double srednia;
    private int semestr;
    @Override
    public String nazwiskoCzlowieka(String nazwisko) {
        return nazwisko;
    }

    @Override
    public String imieCzlowieka(String imie) {
        return imie;
    }

    @Override
    public int nrIndeksu(int indeks) {
        return indeks;
    }

    @Override
    public double sredniaOcen(double srednia) {
        return srednia;
    }

    @Override
    public void semestrObecnie(int semestr) {
        this.semestr = semestr;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public int getIndeks() {
        return indeks;
    }

    public void setIndeks(int indeks) {
        this.indeks = indeks;
    }

    public double getSrednia() {
        return srednia;
    }

    public void setSrednia(double srednia) {
        this.srednia = srednia;
    }

    public int getSemestr() {
        return semestr;
    }

    public void setSemestr(int semestr) {
        this.semestr = semestr;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nazwisko='" + nazwisko + '\'' +
                ", imie='" + imie + '\'' +
                ", indeks=" + indeks +
                ", srednia=" + srednia +
                ", semestr=" + semestr +
                '}';
    }
}
