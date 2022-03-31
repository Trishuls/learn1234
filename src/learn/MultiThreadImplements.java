package learn;

class DemoMul implements Runnable{

    @Override
    public void run() {
        try {
            System.out.println("Thread "+Thread.currentThread().getName()+" is running");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
public class MultiThreadImplements {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            Thread obj = new Thread(new DemoMul());
            obj.start();
        }
    }
}
