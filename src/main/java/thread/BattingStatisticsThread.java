package thread;

public class BattingStatisticsThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i < 4; i++) {   //will assume 3 threads at same time
            System.out
                    .println("Running Batting Statistics Thread "
                            + i);
        }
    }
    public static void main(String[] args) {
        BattingStatisticsThread t = new BattingStatisticsThread();
        t.start();  //this will trigger run method
    }
}
//OUTPUT
/*
Running Batting Statistics Thread 1
Running Batting Statistics Thread 2
Running Batting Statistics Thread 3
 */


