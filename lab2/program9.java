package lab2;

class OnlineExam{
    static double duration = 0.0d; //Duration in Hours
    static double intervalBetweenUpdate = 0.0d; //Update time in hours
    static double timer = 0.0d;
    static {
        duration = 3.0d; // Default time of 3 hours
        intervalBetweenUpdate = (1.0d/60.0d); //Update time of 1 min
    }
    static void startTimer(){
        timer = duration;
    }
    static void updateTimer(){
        timer-=intervalBetweenUpdate;
        System.out.println("Remaining time is: "+timer+" hours"+);
    }
}

public class program9 {
    public static void main(String[] args) {
        OnlineExam.startTimer();
        OnlineExam.updateTimer();
        OnlineExam.updateTimer();
    }
}
