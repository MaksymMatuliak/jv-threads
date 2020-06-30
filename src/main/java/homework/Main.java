package homework;

public class Main {
    public static void main(String[] args) {
        Race race = new Race();
        ThreadClass threadOne = new ThreadClass(race);
        RunnableClass runnable = new RunnableClass(race);
        Thread threadTwo = new Thread(runnable);
        threadOne.start();
        threadTwo.start();
    }
}
