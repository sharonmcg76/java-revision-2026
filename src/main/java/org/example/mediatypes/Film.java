package org.example.mediatypes;

public class Film extends Media {

    private String director;
    private int premierDate;
    private int runTimeMins;

    public Film (String title, String director, int premierDate, int runTimeMins) {
        super(title);
        this.director = director;
        this.premierDate = premierDate;
        this.runTimeMins = runTimeMins;
    }
        @Override
        public String toString (){
            return super.toString()+ ", " + "Director: " + director + ", " + "Premiered: " + premierDate + ", "+ "Run Time: " + runTimeMins +" mins";
        }
    }