package main;

public class Clock {
    private int hours, minutes, seconds;
    public Clock() {
        this.hours = 12;
        this.minutes = 0;
        this.seconds = 0;
    }
    public Clock(int hours, int minutes, int seconds) {
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
    }
    public Clock(int totalSeconds) {
        int totalMinutes = totalSeconds / 60;
        this.hours = totalMinutes / 60;
        this.minutes = totalMinutes % 60;
        this.seconds = totalSeconds % 60;
    }
    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if (hours >= 0 && hours <= 23) {
            this.hours = hours;
        } else {
            throw new RuntimeException("Invalid hours value. Must be between 0 and 23.");
        }
    }
    public int getMinutes() {
        return minutes;
    }
    public void setMinutes(int minutes) {
        if (minutes >= 0 && minutes <= 59) {
            this.minutes = minutes;
        } else {
            throw new RuntimeException("Invalid minutes value. Must be between 0 and 59.");
        }
    }
    public int getSeconds() {
        return seconds;
    }
    public void setSeconds(int seconds) {
        if (seconds >= 0 && seconds <= 59) {
            this.seconds = seconds;
        } else {
            throw new RuntimeException("Invalid seconds value. Must be between 0 and 59.");
        }
    }
    public void tick() {
        seconds++;
        if (seconds >= 60) {
            seconds = 0;
            minutes++;
            if (minutes >= 60) {
                minutes = 0;
                hours = (hours + 1) % 24;
            }
        }
    }
    public void tickDown() {
        seconds--;
        if (seconds < 0) {
            seconds = 59;
            minutes--;
            if (minutes < 0) {
                minutes = 59;
                hours = (hours - 1 + 24) % 24;
            }
        }
    }
    public String toString() {
        return String.format("[%02d:%02d:%02d]", hours, minutes, seconds);
    }
}
