package AbstractFactoryPattern;

import FactoryPattern.Asus;
import FactoryPattern.Laptop;

public class AsusLaptopFactory implements abstractLaptop {
    @Override
    public Laptop buildLaptop() {
        return new Asus();
    }
}
