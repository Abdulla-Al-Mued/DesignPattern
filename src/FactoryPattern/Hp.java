package FactoryPattern;

public class Hp extends Laptop {

    String Processor, ModelName, Price;

    public Hp() {
        Processor = "Core i7";
        ModelName = "Hp123";
        Price = "120000";
    }

    @Override
    public void laptopBuild() {

        System.out.println("This is php laptop");
        System.out.println(Processor);
        System.out.println(ModelName);
        System.out.println(Price);

    }
}
