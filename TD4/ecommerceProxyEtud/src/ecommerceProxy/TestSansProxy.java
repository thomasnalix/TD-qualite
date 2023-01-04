package ecommerceProxy;

import java.io.IOException;
import java.util.ArrayList;

public class TestSansProxy {
    public static void main(String[] args) throws IOException {
        Dataset d = Dataset.getDataSet();
        ArrayList<Motif> motifs = d.motifParser();

        System.out.println("Nb transactions " + d.getTrans().size());
        System.out.println("Nb motifs " + motifs.size());

        long debut = System.currentTimeMillis();

        int nbFreq = 0;
        for (Motif m : motifs)
            if (m.isFreq()) {
                // System.out.println(m.toString());
                nbFreq++;
            }
        System.out.println("Nb motifs frequents " + nbFreq);
        System.out.println("Temps ecoule " + ((System.currentTimeMillis() - debut))/1000. + "s");
    }
}
