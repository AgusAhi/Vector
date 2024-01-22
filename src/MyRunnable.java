import java.util.List;
public class MyRunnable implements Runnable {


    private List<Integer> list;


    public MyRunnable(List<Integer> list) {
        this.list = list;
    }


    @Override
    public void run() {
        for (int i = 1; i <= 2_000_000; i++) {
            addValue(i);
        }
    }


    public void addValue(int i) {
        synchronized (list) {
            list.add(i);
        }
    }
}

