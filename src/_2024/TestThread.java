package _2024;
class Practice1 {
    private Boolean isOdd = true;
     synchronized void printEven(int num){
         while (!isOdd) {
             try {
                 wait();
             } catch (InterruptedException e) {
                 Thread.currentThread().interrupt();
             }
         }
         System.out.println(Thread.currentThread().getName()+":"+num);
         isOdd=false;
         notify();
     }
     synchronized void printOdd(int num) {
         while (isOdd) {
             try {
                 wait();
             } catch (InterruptedException e) {
                 Thread.currentThread().interrupt();
             }
         }
         System.out.println(Thread.currentThread().getName()+":"+num);
         isOdd=true;
         notify();
     }
}
class EvenThread1 implements Runnable {
    private final Practice1 practice1;

    EvenThread1(Practice1 practice1) {
        this.practice1 = practice1;
    }

    @Override
    public void run() {
        for (int i=0;i<10;i++){
                practice1.printEven(i);
        }
    }
}
class OddThread1 implements Runnable {
    private final Practice1 practice1;

    OddThread1(Practice1 practice1) {
        this.practice1 = practice1;
    }

    @Override
    public void run() {
        for (int i=0;i<10;i++) {
            practice1.printOdd(i);
        }
    }
}
public class TestThread {
    public static void main(String[] args) {
        Practice1 practice1 = new Practice1();
        Thread t1 = new Thread(new EvenThread1(practice1), "Even Thread");
        Thread t2 = new Thread(new OddThread1(practice1), "Odd Thread");
        t1.start();
        t2.start();
    }
}
