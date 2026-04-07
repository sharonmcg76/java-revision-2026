package org.example.sp2pastpaperjan24.q5;

public class Q5 {
    public class Customer extends Person {
        private int balance;

        public Customer(String name, int balance) {
            super(name);
            this.balance = balance;
        }

        public Customer(String name) {
            this(name, 100);
        }

        @Override
        public String toString() {
            String s = super.toString(); // Person[name=Alice]
            String prefix = "Person[name=";
            String name = s.substring(prefix.length(), s.length() - 1);
            return "Customer[name=" + name + "][balance=" + balance + "]";
        }
    }

}
