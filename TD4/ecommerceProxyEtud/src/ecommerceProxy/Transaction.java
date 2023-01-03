package ecommerceProxy;

import java.util.ArrayList;

public class Transaction {

    private ArrayList<Article> articles;

    public Transaction() {
    }

    public void add(Article a) {
        articles.add(a);
    }

    public ArrayList<Article> getArticles() {
        return articles;
    }

    public boolean contains(Article a) {
        return articles.contains(a);
    }

}