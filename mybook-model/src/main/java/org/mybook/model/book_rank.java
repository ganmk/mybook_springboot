package org.mybook.model;

public class book_rank {
    private Integer id;

    private String word;

    private String productname;

    private String producturl;

    private String producttext;

    public book_rank(Integer id, String word, String productname, String producturl, String producttext) {
        this.id = id;
        this.word = word;
        this.productname = productname;
        this.producturl = producturl;
        this.producttext = producttext;
    }

    public book_rank() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word == null ? null : word.trim();
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname == null ? null : productname.trim();
    }

    public String getProducturl() {
        return producturl;
    }

    public void setProducturl(String producturl) {
        this.producturl = producturl == null ? null : producturl.trim();
    }

    public String getProducttext() {
        return producttext;
    }

    public void setProducttext(String producttext) {
        this.producttext = producttext == null ? null : producttext.trim();
    }
}