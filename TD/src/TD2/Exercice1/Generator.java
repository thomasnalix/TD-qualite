package TD2.Exercice1;

public class Generator {

    private static Generator instance;
    private int id;

    private Generator() { }

    public String genereId() {
        id++;
        return "ID"+id;
    }

    public static Generator getInstance() {
        if (instance == null) {
            instance = new Generator();
        }
        return instance;
    }
}
