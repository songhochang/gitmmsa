package org.example;

import org.example.friend.CompFriend;
import org.example.friend.UniFriend;

import java.util.Arrays;

public class Ex03 {

    public static void main(String[] args){

        int ucnt = 0;
        int ccnt = 0;

        UniFriend[] uniFriend = new UniFriend[10];
        CompFriend[] compFriend = new CompFriend[10];

        uniFriend[ucnt++] = new UniFriend("고길동","010-1234-5267","둘리아빠");

        System.out.println(Arrays.toString(uniFriend));

        for (int i = 0; i < ucnt; i++) {
            uniFriend[i].showInfo();
        }

        for (int i = 0; i < ccnt; i++) {
            compFriend[i].showInfo();
        }

    }

}
