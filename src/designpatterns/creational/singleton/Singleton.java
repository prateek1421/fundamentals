package designpatterns.creational.singleton;

public class Singleton {

    private static Singleton INSTANCE = null;
    private Singleton() {

    }
    public void sayHello() {
        System.out.println("Hi I am singleton");
    }
    public static Singleton getInstance() {
        if(INSTANCE == null){
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }
}
