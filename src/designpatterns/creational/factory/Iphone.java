package designpatterns.creational.factory;

public class Iphone implements Phone{

    @Override
    public Double getPrice() {
        return 70000.00;
    }

    @Override
    public String getModelNo() {
        return "Iphone SE";
    }
}
