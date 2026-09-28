package org.example.mediatypes;

public class Main {
    static void main() {
        Media media = new Media("Pride and Prejudice");
        Media media2 = new Media( "1984");
        Book book = new Book("Dear Zoo", "Rod Campbell", 1982, 12);
        Book book2 = new Book("Pride and Prejudice","Jane Austen",1812);
        Book book3 = new Book("1984","George Orwell", 1949);
        Book book4 = new Book("The Outsiders", "S.E Hinton", 1967, 200);
        Film film = new Film("Blade Runner", "Ridley Scott",1982, 117 );
        Film film2 = new Film("Terminator 2: Judgement Day", "James Cameron", 1991, 137);
        Film film3 = new Film("The Outsiders", "Francis Ford Coppola",1983,103);

        System.out.println(media);
        System.out.println(media2);
        System.out.println(book);
        System.out.println(book2);
        System.out.println(book3);
        System.out.println(book4);
        System.out.println(film);
        System.out.println(film2);
        System.out.println(film3);
    }
}
