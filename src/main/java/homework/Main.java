package homework;

public class Main {
    public static void main(String[] args) {
        ThreadOne threadOne = new ThreadOne();
        ThreadTwo runnable = new ThreadTwo();
        Thread threadTwo = new Thread(runnable);
        threadOne.start();
        threadTwo.start();
    }
}
