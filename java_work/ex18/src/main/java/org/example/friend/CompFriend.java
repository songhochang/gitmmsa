package org.example.friend;

public class CompFriend extends Friend{

    private String department;

    public CompFriend(String name, String phone, String major) {
        super(name, phone);
        this.department = major;
    }

    public void showInfo(){
        super.showInfo();
        System.out.println("부서 : " + department);
    }

    @Override
    public String toString() {
        return "CompFriend{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
