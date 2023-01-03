package TD2.pokemon;

public abstract class MonstersFactory {

    private static MonstersFactory instance;

    protected MonstersFactory() { }

    abstract Pokemon createPokemon(String nom, int pv);

    abstract Digimon createDigimon(int nbPattes);

    public static MonstersFactory getInstance() {
        if (instance == null) {
            instance = new NPFactory();
        }
        return instance;
    }
}
