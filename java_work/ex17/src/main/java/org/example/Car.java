package org.example;

public class Car {

    int gasolineGauge;

    public Car(int gasolineGauge) {
        this.gasolineGauge = gasolineGauge;
    }

    public void showCurrentGauge(){
        System.out.println("잔여 가솔린 : " + gasolineGauge);
    }

}

class HybridCar extends Car{

    int electricGauge;


    public HybridCar(int gasolineGauge, int electricGauge) {
        super(gasolineGauge);
        this.electricGauge = electricGauge;
    }

    public void showCurrentGauge(){
        super.showCurrentGauge();
        System.out.println("잔여 전기량 : " + electricGauge);
    }

}

class HybridWaterCar extends HybridCar{
    int waterGauge;

    public HybridWaterCar(int gasolineGauge, int electricGauge, int waterGauge) {
        super(gasolineGauge, electricGauge);
        this.waterGauge = waterGauge;

    }

    public void showCurrentGauge(){

        super.showCurrentGauge();
        System.out.println("잔여 워터량 : " + waterGauge);

    }
}

class showCar {

    public static void main(String[] args) {

        Car c1 = new HybridWaterCar(20,0,0);
        HybridCar c2 = new HybridWaterCar(20,20,0);
        HybridWaterCar c3 = new HybridWaterCar(20,20,20);

        System.out.println("1번차");
        c1.showCurrentGauge();
        System.out.println("2번차");
        c2.showCurrentGauge();
        System.out.println("3번차");
        c3.showCurrentGauge();

    }

}
