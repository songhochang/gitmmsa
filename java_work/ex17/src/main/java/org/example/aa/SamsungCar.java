package org.example.aa;

import lombok.ToString;

//@ToString

public class SamsungCar extends Car{

    public SamsungCar(){}

    public SamsungCar(String name, String desc, String company){
        super.name = name;         // this.name
        super.desc = desc;         // this.desc
        super.company = company;   // this.company 도 가능
    }

    public void show(){
        System.out.println(
                name + " " + desc + " " + company
        );
    }

    @Override
    public String toString() {
        return "SamsungCar{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}
