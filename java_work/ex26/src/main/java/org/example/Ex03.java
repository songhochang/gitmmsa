package org.example;

import java.util.Comparator;
import java.util.TreeSet;

public class Ex03 {

    public static void main(String[] args) {

//        Comparator<Person> comparator = new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.getAge() - o2.getAge();
//            }
//        };

        TreeSet<Person> treeSet = new TreeSet<>((o1,o2)->o2.getAge()-o1.getAge());

        treeSet.add(new Person(100,"고길동"));
        treeSet.add(new Person(20,"감길동"));
        treeSet.add(new Person(50,"배길동"));

        System.out.println(treeSet);

    }

}
