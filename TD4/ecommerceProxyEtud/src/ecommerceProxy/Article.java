package ecommerceProxy;

import java.util.*;

public class Article {
    private int num;

    public Article(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Article : " +
                "num = " + num;
    }
}
