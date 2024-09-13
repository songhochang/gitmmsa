package org.example.staff;

import java.time.LocalDate;

public class Staff {

    private int s_id;
    private String s_name;
    private String s_rank;
    private LocalDate s_startdate;
    private LocalDate s_enddate;

    public Staff(int s_id, String s_name, String s_rank, LocalDate s_startdate, LocalDate s_enddate) {
        this.s_id = s_id;
        this.s_name = s_name;
        this.s_rank = s_rank;
        this.s_startdate = s_startdate;
        this.s_enddate = s_enddate;
    }

    @Override
    public String toString() {
//        String temp = mydate==null? "" : DateTimeFormatter.ofPattern("yyyy/mm/dd");
        return "staff{" +
                "s_id=" + s_id +
                ", s_name='" +s_name + '\'' +
                ", s_rank='" + s_rank + '\'' +
                ", s_startdate='" + s_startdate + '\'' +
                ", s_enddate=" + s_enddate +
                '}';
    }

}
