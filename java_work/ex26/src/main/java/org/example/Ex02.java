package org.example;

import java.util.Set;
import java.util.TreeSet;

public class Ex02 {

    public static void main(String[] args) {

        Set<Integer> set = new TreeSet<>();

        set.add(4);
        set.add(1);
        set.add(3);
        set.add(2);

        System.out.println(set);

//        DBRepository dbRepository = new DBRepository();
//        dbRepository.select();

        Set<Member> set1 = new TreeSet<>(Member::compareTo);
        Member member1 = new Member();
        member1.setName("홍길동");
        member1.setAge(30);
        Member member2 = new Member();
        member2.setName("고길동");
        member2.setAge(50);
        Member member3 = new Member();
        member3.setName("하길동");
        member3.setAge(10);

        set1.add(member1);
        set1.add(member2);
        set1.add(member3);

        System.out.println(set1);

    }

}
