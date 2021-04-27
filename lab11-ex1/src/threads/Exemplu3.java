package threads;

import java.util.concurrent.*;

public class Exemplu3 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.submit(() -> { //a implementation of Runnable
            System.out.println(Thread.currentThread().getName());
            for(int i = 1; i <= 20; i++) {
                System.out.println(i);
            }
        });
    }
}
