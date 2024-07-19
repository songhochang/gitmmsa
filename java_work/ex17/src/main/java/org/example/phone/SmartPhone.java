package org.example.phone;

public class SmartPhone extends MobilePhone{

    String androidVer;

    public SmartPhone(String aver, int number) {
        super(number);
        this.androidVer = aver;
    }

    // 부모에 있는 함수를 재정의 --- override
    @Override
    public void show(){
        super.show();
        System.out.println("android Version : " + androidVer);
    }
}
