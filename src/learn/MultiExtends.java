package learn;

class DemoThread extends Thread{
    @Override
    public void run() {
        try {
            System.out.println("Thread "+Thread.currentThread().getName()+" is running");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
public class MultiExtends {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            DemoThread obj = new DemoThread();
            obj.start();
        }
    }
}
