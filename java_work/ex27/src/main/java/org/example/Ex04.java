package org.example;

public class Ex04 {

    public static void main(String[] args) {

        who(Person.MAN);
//        who(Animal.DOG);

        System.out.println(Person.MAN);

    }

    public static void who(Person person){
        if(person == Person.MAN){
            System.out.println("남성 손님");
        }
        else{
            System.out.println("여성 손님");
        }
    }

}
