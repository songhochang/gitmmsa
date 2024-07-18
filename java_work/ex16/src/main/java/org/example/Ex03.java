package org.example;

import org.example.aa.BizMan;
import org.example.aa.FriendMan;

public class Ex03 {

    public static void main(String[] args) {

        BizMan bm = new BizMan("고길동", "그린컴퓨터","선생");
        bm.showInfo();

        System.out.println();

        FriendMan fm = new FriendMan("김기동", "pc방");
        fm.showInfo();

    }

}
