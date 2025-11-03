/**
 * nazwa klasy: Notatka
 * opis:        klasa przeznaczona do robienia notatek
 * pola:        liczba notatek - pole numeryczne przechowujące liczbę notatek
 * identyfikator - pole numeryczne przechowujące unikatowy numer notatki
 * tytulNotatki - pole tekstowe przechowujące tytuł notatki
 * trescNotatki - pole tekstowe przechowujące treść notatki
 * autor:       00000000000000
 */
public class Notatka {
    private static int licznikNotatek;
    private int identyfikator;
    protected String tytulNotatki;
    protected String trescNotatki;

    public Notatka(String tytulNotatki, String trescNotatki) {
        licznikNotatek++;
        identyfikator = licznikNotatek;
        this.tytulNotatki = tytulNotatki;
        this.trescNotatki = trescNotatki;
    }

    public void wypiszTytulTresc(){
        System.out.println("Tytuł: "+tytulNotatki+", treść: "+ trescNotatki);
    }
    public void diagnostyczna(){
        System.out.println(tytulNotatki+", "+trescNotatki+", "+licznikNotatek+", "+identyfikator);
    }


}
