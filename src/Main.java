public class Main {
    public static void main(String[] args) {

        Notatka notatka1 = new Notatka("Lubię programować", "trening czyni mistrza");
        Notatka notatka2 = new Notatka("Uczę się", "...bo chcę");

        notatka1.diagnostyczna();
        notatka1.wypiszTytulTresc();

        notatka2.diagnostyczna();
        notatka2.wypiszTytulTresc();
    }
}