package designpatterns.creational.singletonenum;

public enum Singleton {
    INSTANCE;

    private int value = 5;

    public void sayHello() {
        System.out.println("Inside enum:"+value);
    }
}
