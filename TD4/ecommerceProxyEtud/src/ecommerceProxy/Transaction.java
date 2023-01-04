package ecommerceProxy;

import java.util.ArrayList;

import java.util.ArrayList;

public class Transaction {

    private ArrayList<Article> listeArticles;

    public Transaction() {
        this.listeArticles = new ArrayList<Article>();
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "listeArticles=" + listeArticles +
                '}';
    }

    public void add(Article a){
        listeArticles.add(a);
    }

    public ArrayList<Article> getListeArticles() {
        return listeArticles;
    }

    protected boolean contains(Transaction motif) {
        return listeArticles.containsAll(motif.getListeArticles());
    }
}
