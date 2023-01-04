package ecommerceProxy;

import java.io.IOException;
import java.util.ArrayList;

public class Motif extends Transaction{
    private float freq() throws IOException {
        int nb = 0;

        Dataset dataset = Dataset.getDataSet();
        for (Transaction t : dataset.getTrans())
            if (t.contains(this)) nb++;

        return (float) nb / (float) dataset.getTrans().size();
    }

    public boolean isFreq() throws IOException {
        return freq() >= Dataset.getDataSet().getSeuil();
    }
}
