public interface Budynek {
    double powierzchnia(double pow);
    String adresBudynku(String adres);
    int liczbaOkien(int value);
    void liczbaMieszkancow(int value);
    void kolorDomu(KolorEnum kolor);
    enum KolorEnum{
        CZERWONY, NIEBIESKI, ZOLTY, ZIELONY
    }
    double szerWys(double szerokosc, double wysokosc);
}
