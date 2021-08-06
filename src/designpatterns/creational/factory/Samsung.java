package designpatterns.creational.factory;

public class Samsung implements Phone {
    @Override
    public Double getPrice() {
        return 35000.00;
    }

    @Override
    public String getModelNo() {
        return "Galaxy M31";
    }
}
