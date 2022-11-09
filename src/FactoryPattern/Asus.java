package FactoryPattern;

public class Asus extends Laptop{

    String Processor, ModelName, Price;

    public Asus() {
        Processor = "Core i5";
        ModelName = "asus1234";
        Price = "50000";
    }

    @Override
    public void laptopBuild() {
        System.out.println("Asus");
        System.out.println(Processor);
        System.out.println(ModelName);
        System.out.println(Price);
    }
}
