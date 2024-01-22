import java.util.*;
public class Main {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> list = new ArrayList<>();
        Runnable r1 = new MyRunnable(list);
        Runnable r2 = new MyRunnable(list);
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(list);
        System.out.println("Size: " + list.size());
    }
}
