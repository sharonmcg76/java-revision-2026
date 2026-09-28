package org.example.mediatypes;

public class Book extends Media {

    private String author;
    private int publicationDate;
    private int noOfPages;


    public Book(String author, int publicationDate, int noOfPages) {
        super(title);
        this.author = author;
        this.publicationDate = publicationDate;
        this.noOfPages = noOfPages;
    }

    @Override
     public String toString (){
        return super.toString()+ ", " + "Pages:" + noOfPages;
    }

}
