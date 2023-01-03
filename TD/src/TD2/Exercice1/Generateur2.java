package TD2.Exercice1;

public class Generateur2 {

    private int id = -1;
    private static Generateur2 instance;
    private Generateur2() { }

    public static synchronized Generateur2 getInstance() {
        if (instance == null) {
            instance = new Generateur2();
        }
        return instance;
    }

    public String genereId() {
        id++;
        return "ID" + id;
    }

}
