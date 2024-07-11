package _2024;

class Practice {
    private Boolean isOdd=true;
    synchronized void printEven(int number) {
        while (!isOdd) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println(Thread.currentThread().getName()+" : "+number);
        isOdd=false;
        notify();
    }
    synchronized void printOdd(int number) {
        while (isOdd) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println(Thread.currentThread().getName()+" : "+number);
        isOdd=true;
        notify();
    }
}
class EvenThread implements Runnable{
    private final Practice practice;

    EvenThread(Practice practice) {this.practice = practice;}

    @Override
    public void run() {
        for (int i=0;i<100;i+=2) {
            practice.printEven(i);
        }
    }
}
class OddThread implements Runnable {
    private final Practice practice;

    OddThread(Practice practice) {this.practice = practice;}

    @Override
    public void run() {
        for (int i=0;i<100;i+=2)
            practice.printOdd(i);
    }
}
public class ThreadExample2024 {
    public static void main(String[] args) {
        Practice practice = new Practice();
        Thread t1 = new Thread(new OddThread(practice), "Odd thread");
        Thread t2 = new Thread(new EvenThread(practice), "Even Thread");
        t1.start();
        t2.start();
    }
}
