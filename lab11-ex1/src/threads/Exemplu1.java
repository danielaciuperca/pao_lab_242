package threads;

public class Exemplu1 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + " hello");

        PrintNumbersThread thread = new PrintNumbersThread(); //thread is in the "new"status
        thread.start(); // runnable -> running

        System.out.println(Thread.currentThread().getName() + " goodbye");
    }
}
