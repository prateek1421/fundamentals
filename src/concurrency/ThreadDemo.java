package concurrency;

public class ThreadDemo {

    public static void main(String args[]){
        ThreadMaker t1 = new ThreadMaker();
        ThreadMaker t2 = new ThreadMaker();
        ThreadMaker t3 = new ThreadMaker();
        t1.start();
        t2.start();
        t3.start();
    }
}
class ThreadMaker extends Thread {

    @Override
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+" : i="+i);
        }
    }

}