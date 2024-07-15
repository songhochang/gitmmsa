class Circle {

    private int rad; // private 변수는 setter, getter로 참조 가능
    private String name;

    public Circle(int rad) {
        this.rad = rad;
    }

    public void setName(String name) {
        if (name.equals("")) {
            this.name = "고길동";
            return;
        }

        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setRad(int r) {

        if (r < 0) {
            rad = 0;
            return;
        }

        rad = r;

    }

    public int getRad() {
        return rad;
    }

    public double getArea(){
        return 3.14 * rad * rad;
    }

}
