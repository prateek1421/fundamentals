package designpatterns.creational.singleton;

public class SingletonDemo {

    public static void main(String args[]) {
        Singleton obj = Singleton.getInstance();
        obj.sayHello();
        Singleton obj2 = Singleton.getInstance();
        if(obj == obj2) {
            System.out.println("both objects are equal");
        }
    }
}
