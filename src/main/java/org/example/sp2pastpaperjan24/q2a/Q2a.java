package org.example.sp2pastpaperjan24.q2a;



public class Q2a {


    public class Up23 {
        String s;

        public Up23(String s) {
            this.s = s;
        }

        void setData(int d) {
            // no data field exists, so either remove or replace appropriately
            this.s = String.valueOf(d);
        }

        public Object get() {
            return this;
        }

        public Integer getLength() {
            return s.length();
        }
    }

    public class Down23 extends Up23 {
        public Down23(int data) {
            super(null);
        }

        public Down23() {
            super(null);
        }

        @Override
        public boolean equals(Object o) {
            return this == o;
        }
    }

}
