package threads;

import java.util.*;
import java.util.concurrent.*;

public class Exemplu4 {
    public static List<Integer> numbers = new ArrayList<>();

    public static void main(String[] args) {
        //Producer - Consumer = race condition
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.submit(new ProducerTask());
        executorService.submit(new ConsumerTask());
        executorService.submit(new ProducerTask());
        executorService.submit(new ConsumerTask());
    }
}
