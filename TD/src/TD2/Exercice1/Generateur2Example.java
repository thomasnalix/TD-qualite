package TD2.Exercice1;


public class Generateur2Example {


    public static void main(String[] args) {
        Generateur2 g = Generateur2.getInstance();
        System.out.println(g.genereId());
        System.out.println(g.genereId());
        Generateur2 g2 = Generateur2.getInstance();
        System.out.println(g2.genereId());
    }
}
