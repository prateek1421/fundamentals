package concurrency;

public class RunnableDemo {
    public static void mai(String args[]) {
        Thread t1 = new Thread(new RunnableMaker());
        Thread t2 = new Thread(new RunnableMaker());
        t1.start();
        t2.start();
    }
}
class RunnableMaker implements Runnable {

    @Override
    public void run() {

    }
}