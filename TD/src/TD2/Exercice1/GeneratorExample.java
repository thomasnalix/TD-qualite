package TD2.Exercice1;

public class GeneratorExample {

    public static void main(String[] args) {
        Generator id = Generator.getInstance();
        System.out.println(id.genereId());
        Generator id1 = Generator.getInstance();
        System.out.println(id + " --- " + id1);
    }
}
