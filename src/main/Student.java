package main;

public class Student {
    private String name;
    private String surname;
    private int idx;
    private int mark;
    private float attendance;
    public Student(String name, String surname, int idx, int mark, float attendance) {
        this.name = name;
        this.surname = surname;
        this.idx = idx;
        this.mark = mark;
        this.attendance = attendance;
    }
    public Student(){
        this.name = "Unknown";
        this.surname = "Unknown";
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public int getIdx() {
        return idx;
    }
    public void setIdx(int idx) {
        this.idx = idx;
    }
    public int getMark() {
        return mark;
    }
    public void setMark(int mark) {
        this.mark = mark;
    }
    public float getAttendance() {
        return attendance;
    }
    public void setAttendance(float attendance) {
        this.attendance = attendance;
    }
    public void failMark(){
        if(this.getAttendance() < 50.0f){
            this.setMark(2);
        }
    }
}
