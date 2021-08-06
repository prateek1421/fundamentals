package designpatterns.creational.factory;

public class OnePlus implements Phone {
    @Override
    public Double getPrice() {
        return 25000.0;
    }

    @Override
    public String getModelNo() {
        return "Oneplus 7+";
    }
}
