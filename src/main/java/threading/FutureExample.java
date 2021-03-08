package threading;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureExample {
    private static ExecutorService executorService = Executors.newSingleThreadExecutor();

    public static Future<Integer> getSquare(Integer integer) {
        return executorService.submit(() -> {
            try {
                Thread.sleep(1000);
            }catch (Exception e){
                System.out.println("Thread awake");
            }
            return integer * integer;
            });

    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Future<Integer> square = getSquare(100*100);

        while (!square.isDone()){
            System.out.println("Not done");
        }
        System.out.println(square.get());
        System.out.println("Done");
    }

}
