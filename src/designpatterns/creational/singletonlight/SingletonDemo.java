package designpatterns.creational.singletonlight;

public class SingletonDemo {

    public static void main(String args[]) {
        Singleton obj = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        if(obj == obj2) {
            System.out.println("both objects are equal");
        }
    }
}
