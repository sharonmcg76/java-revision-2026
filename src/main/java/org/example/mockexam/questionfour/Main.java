package org.example.mockexam.questionfour;

import java.util.Comparator;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Comparator<String> cmp =
        (string1, string2) -> {
            if (Objects.equals(string1, string2)) {
                return 0;
            } else if (string1 == null) {
                return -1;
            } else if (string2 == null) {
                return 1;
            }
            int len = Integer.compare(string1.length(), string2.length());
            if (len != 0) {
                return len;
            } else {
                return string1.compareTo(string2);
            }
        };

        System.out.println(cmp.compare("bb", null) > 0);
        System.out.println(cmp.compare("bb", "a") > 0);
        System.out.println(cmp.compare("bb", "aa") > 0);
        System.out.println(cmp.compare("bb", "bb") == 0);
        System.out.println(cmp.compare(null, null) == 0);
        System.out.println(cmp.compare("bb", "aaa") < 0);
        System.out.println(cmp.compare("bb", "ccc") < 0);
        System.out.println(cmp.compare(null, "") < 0);
    }
}
