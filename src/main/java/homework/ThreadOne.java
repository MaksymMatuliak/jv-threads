package homework;

public class ThreadOne extends Thread {
    private int counter = 0;

    @Override
    public void run() {
        while (counter < 100) {
            counter++;
            System.out.println(counter + " Thread1");
        }
        System.out.println("First tread finished race!");
    }
}
