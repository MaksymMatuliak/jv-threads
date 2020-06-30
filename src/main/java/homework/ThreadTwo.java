package homework;

public class ThreadTwo implements Runnable {
    private int counter = 0;

    @Override
    public void run() {
        while (counter < 100) {
            counter++;
            System.out.println(counter + " Thread2");
        }
        System.out.println("Second tread finished race!");
    }
}
