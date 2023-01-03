package ecommerceProxy;

import java.io.IOException;
import java.util.ArrayList;

public class Motif extends Transaction {


    private float frequence;

    public Motif() { }

    public boolean isFreq() throws IOException {
        return freq() >= Dataset.getDataset().getSeuil();
    }

    private float freq() throws IOException {
        ArrayList<Transaction> trans = Dataset.getDataset().getTrans();
        for (Transaction t : trans) {
            if (t.contains(this)) {
                frequence++;
            }
        }
        return frequence/trans.size();
    }

}