package designpatterns.creational.singletondoublecheck;

public class SingletonDemo {

    public static void main(String args[]) {
        Singleton obj = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        if(obj == obj2)
            System.out.println("Hi I am double check singleton");
    }
}
