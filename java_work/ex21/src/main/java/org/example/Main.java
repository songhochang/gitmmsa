package org.example;

public class Main {

    public static void main(String[] args) {

        A a1 = new A("AA");
        A a2 = new A("AA");
        A a3 = new A("AAA");

        a1.printTis(a2);

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

        System.out.println(a1.equals(a2));
        System.out.println(a2.equals(a1));
        System.out.println(a3.equals(a1));

        System.out.println(a1==a2);

    }

    static class A {

        private String name;

        public A(String name) {
            this.name = name;
        }

        public void printTis(Object obj) {
            System.out.println("this = " + this);
            System.out.println("(A)obj = " + (A) obj);
            System.out.println("this.name = " + this.name);
            System.out.println("(A)obj = " + ((A) obj).name);
        }

        public boolean equals(Object a) {
            return this.name.equals(((A) a).name);
        }
    }
}