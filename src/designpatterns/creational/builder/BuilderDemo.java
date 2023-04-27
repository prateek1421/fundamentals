package designpatterns.creational.builder;

public class BuilderDemo {

    public static void main(String[] args) {
        Person person1 = new PersonBuilder("Prateek",25,"Srivastava").build();
        Person person2 = new PersonBuilder("Prateek",25,"Srivastava").addCity("Bangalore").build();
        Person person3 = new PersonBuilder("Prateek",25,"Srivastava")
                .addCity("Bangalore")
                .addCountry("India").build();
    }
}
