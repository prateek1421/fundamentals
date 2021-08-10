package designpatterns.creational.singletonthreadsafe;

public class SingletonDemo {

    public static void main(String args[]) {
        Singleton obj = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        if(obj == obj2)
            System.out.println("Hi I am thread safe singleton");
    }
}
