package org.example;

public class Point {

    private int xpos;
    private int ypos;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Point(int xpos, int ypos) {
        this.xpos = xpos;
        this.ypos = ypos;
    }
    public void showPoint(){
        System.out.printf("[%d, %d]\n",xpos, ypos);
    }
    public void setXpos(int xpos){
        this.xpos = xpos;
    }

    public void setYpos(int ypos) {
        this.ypos = ypos;
    }
}
