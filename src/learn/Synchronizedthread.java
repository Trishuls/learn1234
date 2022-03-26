package learn;

public class Synchronizedthread {
	public void send(String msg){
        System.out.println("Sending\t"+msg);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("\n"+msg+"sent");
    }
}

class Threadsent extends Thread{
    private final String msg;
    private final Synchronizedthread send;

    public Threadsent(String msg,Synchronizedthread send){
        this.msg=msg;
        this.send=send;
    }

    @Override
    public void run() {
        synchronized (send){
            send.send(msg);
        }
    }
}

class demo{
    public static void main(String[] args) {
        Synchronizedthread send=new Synchronizedthread();
        Threadsent t1=new Threadsent("hi",send);
        Threadsent t2=new Threadsent("bye",send);

        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        }catch (InterruptedException e){
            System.out.println("interupted..");
        }
    }
}
