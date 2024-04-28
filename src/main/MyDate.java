package main;

public class MyDate {
    private int year;
    private int month;
    private int day;
    public MyDate(int year, int month, int day) {
        if((year <= 2050) && (year >= 1990)){ this.year = year; } else {throw new RuntimeException("Year out of scope");}
        if((month >= 1) && (month <= 12)){ this.month = month; } else {throw new RuntimeException("Month out of scope");}
        if(month == 2) {
            if(isLeapYear()){
                if (day >= 1 && day <= 29){ this.day = day; } else {throw new RuntimeException("Day out of scope");}
            } else {
                if (day >= 1 && day <= 28){ this.day = day; } else {throw new RuntimeException("Day out of scope");}
            }
        } else if (month % 2 == 0) {
              if (day >= 1 && day <= 30){ this.day = day; } else {throw new RuntimeException("Day out of scope");}
        } else {
            if (day >= 1 && day <= 31){ this.day = day; } else {throw new RuntimeException("Day out of scope");}
        }

    }
    public MyDate() {
        this.year = 1990;
        this.month = 1;
        this.day = 1;
    }
    private boolean isLeapYear(){
        return (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        if((year <= 2050) && (year >= 1990)){ this.year = year; } else {throw new RuntimeException("Year out of scope");}
    }
    public int getMonth() {
        return month;
    }
    public void setMonth(int month) {
        if((month >= 1) && (month <= 12)){ this.month = month; } else {throw new RuntimeException("Month out of scope");}
    }
    public int getDay() {
        return day;
    }
    public void setDay(int day) {
        if(month == 2) {
            if(isLeapYear()){
                if (day >= 1 && day <= 29){ this.day = day; } else {throw new RuntimeException("Day out of scope");}
            } else {
                if (day >= 1 && day <= 28){ this.day = day; } else {throw new RuntimeException("Day out of scope");}
            }
        } else if (month % 2 == 0) {
              if (day >= 1 && day <= 30){ this.day = day; } else {throw new RuntimeException("Day out of scope");}
        } else {
            if (day >= 1 && day <= 31){ this.day = day; } else {throw new RuntimeException("Day out of scope");}
        }
    }
    public String displayDate(){
        return day + "/" + month + "/" + year;
    }

}
