
public class Main {
    public static void main(String[] args) {

        /* zad.1
        a) napisać interfejs CzlowiekI
        b) zadeklarować 2 metody

        c) napisać interfejs StudentI który dziedziczy po interfejsie CzlowiekI
        d) zadeklarować 3 metody

        e) napisać interfejs PracownikI który dziedziczy po interfejsie CzlowiekI
        f) zadeklarować 3 metody
         */

        /* zad.2
        a) napisać klasę Student która będzie implementować interfejs StudentI
        b) napisać klasę Pracownik która będzie implementować interfejs PracownikI
        c) stworzyć pola, gettery i settery, metodę toString dla obu klas, (constructor z przeciążeniem - jak ktoś chce ),
        (gettery i settery / toString() ..., najlepiej wygenerować: Code/Prawy myszy-->Generate-->getters/setters/toString)
        */

        /* zad.3
        a) stworzyć 2 objekty typu Student i uzupełnić wszystkie pola
        b) stworzyć 2 objekty typu Pracownik i uzupełnić wszystkie pola
        c) wypisać metody toString() wszystkich objektów

        */
        Student stud1 = new Student();
        Student stud2 = new Student();
        stud1.setImie("Bartosz");
        stud1.setNazwisko("Kolodziejczyk");
        stud1.setSemestr(3);
        stud1.setSrednia(3.8);
        stud1.setIndeks(891367);

        stud2.setImie("Adam");
        stud2.setNazwisko("Nowak");
        stud2.setSemestr(2);
        stud2.setSrednia(4.3);
        stud2.setIndeks(54253);

        System.out.println(stud1.toString());
        System.out.println(stud2.toString());

        Pracownik prac1 = new Pracownik();
        Pracownik prac2 = new Pracownik();

        prac1.setImie("Artur");
        prac1.setNazwisko("Kowalski");
        prac1.setStaz(5);
        prac1.setPensja(2590.99);
        prac1.setStanowisko("Specjalista");

        prac2.setImie("Pawel");
        prac2.setNazwisko("Kowalczyk");
        prac2.setStaz(10);
        prac2.setPensja(6982.88);
        prac2.setStanowisko("Kierownik");

        System.out.println(prac1.toString());
        System.out.println(prac2.toString());

        /*
        zad.4 - Dla chętnych
        a) stworzyć klasę Kierownik która będzie implementować interfejs PracownikI,
        b) zaimplementować wszystkie metody, i stworzyć pola
        c) stworzyć 2 objekty typu Kierownik i uzupełnić wszystkie pola,
        d) stworzyć listę typu PracownikI --> List<PracownikI> listaPracownikow = new ArrayList<>();
        e) dodać do niej objekty typu Kierownik i Pracownik
        f) wypisać pętlą metody toString() wszystkich elementów listy
        */

        /* zad5 - Dla chętnych
        Stworzyć klasę która będzie implementować 2 lub 3 interfejsy następnie będzie
        dziedziczona przez inną klasę
        */
    }
}
