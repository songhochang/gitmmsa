package org.example.aa;

public class FriendMan extends Man {

    private String place;

    public FriendMan(String name, String place){
        super(name);
//        super();
        this.place = place;
    }

    public void showInfo(){
        tellInfo();
        System.out.println("place = " + place);
    }

}
