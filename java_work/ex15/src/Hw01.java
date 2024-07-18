class Student{

    private int kor;
    private int eng;
    private int math;

    Student(int kor, int eng, int math){
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public void getTotal(){
        int total = kor + eng + math;
        System.out.println(total);
    }

    public void getAverage(){
        float average = (float) (int) ((float) (kor + eng + math) / 3 * 10) /10;
        System.out.println((average));
    }

}

public class Hw01 {

    public static void main(String[] args) {

        Student st = new Student(75, 90, 88);

        st.getTotal();
        st.getAverage();

    }

}
