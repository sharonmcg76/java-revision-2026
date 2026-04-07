package org.example.sp2pastpaperjan25.q3;

import java.awt.print.Book;

//Book.title is private, so LibraryBook
// cannot access it directly.
// Using only the shown code, the
// only available way is to parse the superclass string.

public class q3a {
    public class LibraryBook extends Book {
        private String catNumber;

        @Override
        public String toString() {
            String s = super.toString(); // Book[title=Ulysses]
            String prefix = "Book[title=";
            String title = s.substring(prefix.length(), s.length() - 1);
            return "LibraryBook[name=" + title + "][catNumber=" + catNumber + "]";
        }
    }
}
