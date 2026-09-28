package org.example.mediatypes;

public class Book extends Media {

    private int noOfPages;


    public Book(String title, String author, int publicationDate, int noOfPages) {
        super(title);
        this.noOfPages = noOfPages;
    }

    @Override
     public String toString (){
        return super.toString()+ ", " + "Pages:" + noOfPages;
    }

}
