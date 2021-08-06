package designpatterns.creational.factory;

public class FactoryDemo {

        Phone phone;
        public Phone getPhone(Brand brand) {
            if(brand == Brand.IPHONE)
                phone = new Iphone();
            else if (brand == Brand.SAMSUNG)
                   phone = new Samsung();
            else if(brand == Brand.ONEPLUS)
                    phone = new OnePlus();
           return phone;
        }
}
