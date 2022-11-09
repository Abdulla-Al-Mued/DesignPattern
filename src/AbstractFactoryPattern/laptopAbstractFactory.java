package AbstractFactoryPattern;

import FactoryPattern.Laptop;

public class laptopAbstractFactory {

    public Laptop getLaptop(abstractLaptop laptop){
        return laptop.buildLaptop();
    }

}
