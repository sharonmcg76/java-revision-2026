package org.example.sp2pastpaperjan25.q3;

public class q3b {
    public class LibraryBook extends Book {
        private String catNumber;

        public LibraryBook(String name, String catNumber) {
            super(name);
            this.catNumber = catNumber;
        }

        public LibraryBook(String name) {
            this(name, "0");
        }

        @Override
        public String toString() {
            String s = super.toString();
            String prefix = "Book[title=";
            String title = s.substring(prefix.length(), s.length() - 1);
            return "LibraryBook[name=" + title + "][catNumber=" + catNumber + "]";
        }
    }
}
