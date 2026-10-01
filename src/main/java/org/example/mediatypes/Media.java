package org.example.mediatypes;

public class Media {
    String title;


    public Media(String title) {
        this.title = title;
    }

    @Override
    public String toString() {

        return "Title: "+ title;
    }
}
