
import java.util.concurrent.*;

class Demo implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread());
    }

}

public class Program19 {
    public static void main(String args[]) {
        // ExecutorService ser = Executors.newFixedThreadPool(5);
        // using tradpoolexecutor return type
        ThreadPoolExecutor ser= (ThreadPoolExecutor)Executors.newFixedThreadPool(5);
        Demo obj = new Demo();
        for (int i = 0; i < 10; i++) {
            ser.execute(obj);
        }
        ser.shutdown();
    }

}
