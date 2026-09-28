package org.example.mediatypes;

public class Media {
    String title;
    private String author;
    private int publicationDate;

    public Media(String title, String author, int publicationDate) {
        this.title = title;
        this.author = author;
        this.publicationDate = publicationDate;
    }

    @Override
    public String toString() {

        return "Title: "+ title + ", " + "Author: " + author + ", " + "Published: " + publicationDate;

    }
}
