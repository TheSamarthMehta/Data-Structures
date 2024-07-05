import java.sql.Time;

class TimeHour {
    int hour;
    int minute;
    int second;
    public void Time(int hour, int minute, int second){
        this.second = second;
        this.hour = hour;
        this.minute = minute;
    }
    void add(Time t){
        this.second += t.second;
        if (this.second >= 60) {
            this.minute++;
            this.second -=60;
        }
        this.minute += t.minute;
        if (this.minute>=60) {
            this.hour++;
            this.minute-=60;
        }
        this.hour += t.hour;
    }
    
}
class DemoTimeHour {
    public static void main(String[] args) {
        Time t1 = new Time(11,59,55);
        Time t2 = new Time(0,0,5);

        t1.add(t2);

        System.out.println();
    }
}
