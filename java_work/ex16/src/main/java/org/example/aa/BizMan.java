package org.example.aa;

public class BizMan extends Man{

    private String company;
    private String position;

    public BizMan(String name, String company, String position){
        super(name); // 부모클래스의 변수 가져오기
        this.company = company;
        this.position = position;
    }

    public void showInfo(){

        tellInfo();

        System.out.println("company = " + company);
        System.out.println("position = " + position);

    }



}
