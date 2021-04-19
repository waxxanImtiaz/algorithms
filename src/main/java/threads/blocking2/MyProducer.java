package threads.blocking2;

import threads.blocking.Message;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;

public class MyProducer implements Runnable {
    private BlockingQueue<Message> queue = new ArrayBlockingQueue<Message>(10);

    public MyProducer(BlockingQueue<Message> queue) {
        this.queue = queue;
    }


    @Override
    public void run() {
//        for (int i = 0; i < 100; i++) {
//            Message message = new Message(""+i);
//            try{
//
//            }catch (Exception e){
//                e.printStackTrace();`
//            }
//        }
    }
}
