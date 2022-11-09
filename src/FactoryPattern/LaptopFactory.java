package FactoryPattern;

public class LaptopFactory {

    public Laptop getLaptopByName(String name){
        if(name.equals("Hp"))
            return new Hp();
        else if(name.equals("Asus"))
            return new Asus();
        else return null;
    }

}
