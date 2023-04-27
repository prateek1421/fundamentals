package designpatterns.creational.builder;

public class Person {
    private String firstName;
    private int age;
    private String city;
    private String country;
    private String lastName;

    //Initialize everything in the constructor
    /*public Person(String firstName,int age,String city,String country,String lastName) {
        this.firstName = firstName;
        this.age = age;
        this.city = city;
        this.country = country;
        this.lastName = lastName;
    }*/

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

class PersonBuilder {
    private String firstName;
    private int age;
    private String city;
    private String country;
    private String lastName;

    public PersonBuilder(String firstName,int age,String lastName) {
        this.firstName = firstName;
        this.age = age;
        this.lastName = lastName;
    }

    public PersonBuilder addCity(String city) {
        this.city = city;
        return this;
    }

    public PersonBuilder addCountry(String country) {
        this.country = country;
        return this;
    }

    public Person build() {
        Person person = new Person();
        person.setFirstName(firstName);
        person.setLastName(lastName);
        person.setAge(age);
        person.setCity(city);
        person.setCountry(country);
        return person;
    }

}
