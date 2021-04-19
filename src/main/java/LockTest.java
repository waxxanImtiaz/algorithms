import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockTest {
    static Lock lock = new ReentrantLock();
    static int count = 0;
    public static void main(String[] args) {


        System.out.println(count);

        increment();
        increment();
        increment();
        increment();

        System.out.println(count);

        System.out.println("After lock");

     }

    static void increment() {
        lock.lock();
        try {
            count++;
        } finally {
            lock.unlock();
        }
    }
}
