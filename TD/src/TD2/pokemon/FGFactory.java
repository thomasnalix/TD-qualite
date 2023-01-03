package TD2.pokemon;

public class FGFactory extends MonstersFactory {

    public Pokemon createPokemon(String nom, int pv) {
        return new PokemonFG(nom, pv);
    }

    public Digimon createDigimon(int nbPattes) {
        return new DigimonFG(nbPattes);
    }
}
