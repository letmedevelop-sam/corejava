package thread;

import java.util.concurrent.*;

public class CallableTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Future futureFromCallable = executorService.submit(new Callable() {
            public String call() throws Exception {
                return "RESULT";
            }
        });
        System.out.println("futureFromCallable.get() = "
                + futureFromCallable.get());
    }
}
/*
OUTPUT:
futureFromCallable.get() = RESULT
 */
