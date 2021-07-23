package oopsconcepts;

public class PassByValueDemo {

    public static void main(String args[]) {
        Dog s = new Dog("jimmy");
        System.out.println(s.getName());
        changeName(s);
        //if java was pass by reference , then below should have changed to Fluffy
        System.out.println(s.getName());
    }

    public static void changeName(Dog d){
        d.setName("Brocky");
        d = new Dog("Pluto");
        d.setName("Fluffy");
    }
}

class Dog {
    String name;
    public Dog(String n) {
        this.name = n;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
