package oopsconcepts;

public class RuntimePoly {

    public static void main(String args[]) {
        Animal a = new Cat();
        a.run();
    }
}

class Animal {
    public void run(){
        System.out.println("Inside Animal");
    }
}
class Cat extends Animal {
    public void run(){
        System.out.println("Inside Cat");
    }
}
