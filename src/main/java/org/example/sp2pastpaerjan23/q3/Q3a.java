package org.example.sp2pastpaerjan23.q3;

public class Q3a {

    package org.example.sp2pastpaerjan23.q3;

    public class Q3c {
        //Inheriting means that a subclass receives methods and fields from a superclass.
        //
        //Example:

        class Animal {
            public void eat() {
                System.out.println("eating");
            }
        }

        class Dog extends org.example.sp2pastpaerjan23.q3.Q3c.Animal {
            //Here Dog inherits the method eat() from Animal.
            //
            //Overriding means that a subclass provides its own implementation of an inherited method with the same signature.
            //
            //Example:


        }

        class Animal {
            public String sound() {
                return "noise";
            }
        }

        class Dog extends org.example.sp2pastpaerjan23.q3.Q3c.Animal {
            @Override
            public String sound() {
                return "bark";
            }
        }
//
//    Here Dog overrides sound(). When sound() is called
//    on a Dog object, the subclass version is used.
//
//
//}

    }
