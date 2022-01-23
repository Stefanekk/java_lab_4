public class Pracownik implements PracownikI{
    private String nazwisko;
    private String imie;
    private double pensja;
    private int staz;
    private String stanowisko;
    @Override
    public String nazwiskoCzlowieka(String nazwisko) {
        return nazwisko;
    }

    @Override
    public String imieCzlowieka(String imie) {
        return imie;
    }

    @Override
    public void getPensja(double pensja) {
        this.pensja = pensja;
    }

    @Override
    public void getStaz(int staz) {
        this.staz = staz;
    }

    @Override
    public void getStanowisko(String stanowisko) {
        this.stanowisko = stanowisko;
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

    public double getPensja() {
        return pensja;
    }

    public void setPensja(double pensja) {
        this.pensja = pensja;
    }

    public int getStaz() {
        return staz;
    }

    public void setStaz(int staz) {
        this.staz = staz;
    }

    public String getStanowisko() {
        return stanowisko;
    }

    public void setStanowisko(String stanowisko) {
        this.stanowisko = stanowisko;
    }

    @Override
    public String toString() {
        return "Pracownik{" +
                "nazwisko='" + nazwisko + '\'' +
                ", imie='" + imie + '\'' +
                ", pensja=" + pensja +
                ", staz=" + staz +
                ", stanowisko='" + stanowisko + '\'' +
                '}';
    }
}
