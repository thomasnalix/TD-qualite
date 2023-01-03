package TD2.pokemon;

public class NPFactory extends MonstersFactory {

    public Pokemon createPokemon(String nom, int pv) {
        return new PokemonNP(nom, pv);
    }

    public Digimon createDigimon(int nbPattes) {
        return new DigimonNP(nbPattes);
    }
}
