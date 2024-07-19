package org.example;

import org.example.box.Box;
import org.example.box.GoldPaperBox;
import org.example.box.PaperBox;

public class Ex04 {

    public static void main(String[] args) {

        Box box1 = new Box();
        PaperBox box2 = new PaperBox();
        GoldPaperBox box3 = new GoldPaperBox();

        wrapBox(box1);
        wrapBox(box2);
        wrapBox(box3);

    }

    public static void wrapBox(Box box){

        if(box instanceof GoldPaperBox){
            ((GoldPaperBox) box).goldPaperBox();
        }
        else if(box instanceof PaperBox){
            ((PaperBox) box).paperBox();
        }
        else{
            box.box();
        }

    }

}
