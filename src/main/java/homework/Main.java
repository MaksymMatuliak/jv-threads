package homework;

public class Main {
    public static void main(String[] args) {
        Race race = new Race();
        ThreadOne threadOne = new ThreadOne(race);
        ThreadTwo runnable = new ThreadTwo(race);
        Thread threadTwo = new Thread(runnable);
        threadOne.start();
        threadTwo.start();
    }
}
