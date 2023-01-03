package TD2.pokemon;

public class PokemonExample {

    public static void main(String[] args) {
        Pokemon p1 = MonstersFactory.getInstance().createPokemon("Pikachu", 100);
        Pokemon p2 = MonstersFactory.getInstance().createPokemon("Carapuce", 100);
        Digimon d1 = MonstersFactory.getInstance().createDigimon(2);
        Digimon d2 = MonstersFactory.getInstance().createDigimon(20);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(d1);
        System.out.println(d2);
    }
}
