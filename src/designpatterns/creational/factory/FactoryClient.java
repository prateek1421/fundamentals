package designpatterns.creational.factory;

public class FactoryClient {

    public static void main(String args[]) {
        FactoryDemo demo = new FactoryDemo();
        Phone iPhone = demo.getPhone(Brand.IPHONE);
        Phone samsung = demo.getPhone(Brand.SAMSUNG);
        Phone onePlus = demo.getPhone(Brand.ONEPLUS);
        if(iPhone instanceof Iphone)
            System.out.println("Iphone created");
        if(samsung instanceof Iphone)
            System.out.println("Iphone created");
        else
            System.out.println("its samsung");
        if(onePlus instanceof OnePlus)
            System.out.println("OnePlus created");
        System.out.println("Iphone price : "+iPhone.getPrice()+" Model :"+iPhone.getModelNo());
    }
}
