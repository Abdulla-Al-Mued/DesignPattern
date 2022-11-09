package AbstractFactoryPattern;

import FactoryPattern.Hp;
import FactoryPattern.Laptop;

public class hpLaptopFactory implements abstractLaptop {
    @Override
    public Laptop buildLaptop() {
        return new Hp();
    }
}
