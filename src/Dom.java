public class Dom implements Budynek{
    private double pow;
    private String adres;
    private int value;
    private double szerokosc;
    private double wysokosc;

    @Override
    public double powierzchnia(double pow) {
        this.pow = pow;
        return pow;
    }

    @Override
    public String adresBudynku(String adres) {
        this.adres = adres;
        return adres;
    }

    @Override
    public int liczbaOkien(int value) {
        this.value = value;
        return value;
    }

    @Override
    public void liczbaMieszkancow(int value) {
        System.out.println(value);
    }

    @Override
    public void kolorDomu(KolorEnum kolor) {
        System.out.println(kolor);
    }

    @Override
    public double szerWys(double szerokosc, double wysokosc) {
        this.szerokosc = szerokosc;
        this.wysokosc = wysokosc;
        return szerokosc * wysokosc;
    }
    public boolean czyPrawda(double szerokosc, double wysokosc, double pow){
        if (szerWys(szerokosc, wysokosc) == powierzchnia(pow)){
            return true;
        }
        else{
            return false;
        }
    }


    public double getPow() {
        return pow;
    }

    public void setPow(double pow) {
        this.pow = pow;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public double getSzerokosc() {
        return szerokosc;
    }

    public void setSzerokosc(double szerokosc) {
        this.szerokosc = szerokosc;
    }

    public double getWysokosc() {
        return wysokosc;
    }

    public void setWysokosc(double wysokosc) {
        this.wysokosc = wysokosc;
    }

    @Override
    public String toString() {
        return "Dom{" +
                "pow=" + pow +
                ", adres='" + adres + '\'' +
                ", value=" + value +
                ", szerokosc=" + szerokosc +
                ", wysokosc=" + wysokosc +
                '}';
    }
}
