class TV{

    private String name;
    private int year;
    private int inch;

    TV(String name, int year, int inch){
        this.name = name;
        this.year = year;
        this.inch = inch;
    }
    public void show(){
        System.out.println("ㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋ\n" +
                "ㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋ");
        System.out.println(name + "에서 만든 " + year + "년 " + inch + "인치 TV");
    }

}

public class Ex01 {

    public static void main(String[] args) {

        TV myTV = new TV("LG", 2017, 32);
        myTV.show();
    }

}
