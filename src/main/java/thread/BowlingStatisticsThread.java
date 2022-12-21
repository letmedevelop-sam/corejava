package thread;

public class BowlingStatisticsThread implements Runnable {
    public static void main(String[] args) {
        BowlingStatisticsThread b = new BowlingStatisticsThread();
        Thread myThread = new Thread(b);
        myThread.start();
    }
    @Override
    public void run() {
        for (int i = 1; i < 4; i++) {
            System.out.println("Running Bowling Statistics Thread " + i);
        }
    }
}
