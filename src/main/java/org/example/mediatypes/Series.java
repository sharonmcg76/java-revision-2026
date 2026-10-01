package org.example.mediatypes;

public class Series extends Media {

    private int noOfEpisodes;
    private String director;
    private int lengthOfEpisode;

    public Series( String title, int noOfEpisodes, String director, int lengthOfEpisode) {
        super(title);
        this.noOfEpisodes = noOfEpisodes;
        this.director = director;
        this.lengthOfEpisode = lengthOfEpisode;
    }

    @Override
        public String toString (){
         return super.toString() + ", " + noOfEpisodes + " Episodes, " + "Director: " + director +", " + lengthOfEpisode + " mins." ;

    }
}

