import AbstractFactoryPattern.hpLaptopFactory;
import AbstractFactoryPattern.laptopAbstractFactory;
import FacadePattern.ShapeMaker;
import FactoryPattern.Laptop;
import FactoryPattern.LaptopFactory;
import VisitorPattern.*;

public class Main {
    public static void main(String[] args) {

        //visitor pattern

//        ItemElement[] itemElements = new ItemElement[]{
//          new Book("Bangla", 100),
//          new Book("English", 120),
//          new Fruit("Apple", 1, 300),
//          new Fruit("Orange", 2, 200)
//        };
//
//        double totalAmount = calculateTotalAmount(itemElements);
//        System.out.println(totalAmount);
//
//    }
//
//    private static double calculateTotalAmount(ItemElement[] itemElements) {
//
//        ShoppingCartVisitor visitor = new ShoppingCartVisitorImp();
//
//        double sum = 0;
//        for (ItemElement sh : itemElements){
//
//            sum = sum + sh.accept(visitor);
//
//        }
//
//        return sum;
//


      // facade pattern
//        ShapeMaker shapeMaker = new ShapeMaker();
//        shapeMaker.drawCircle();
//        shapeMaker.drawRectangle();
//        shapeMaker.drawTriangle();


///  Factory Pattern

        LaptopFactory laptopFactory = new LaptopFactory();
        Laptop laptop = laptopFactory.getLaptopByName("Asus");
        laptop.laptopBuild();
// AbstractFactory

        laptopAbstractFactory laptopFactory2 = new laptopAbstractFactory();
        Laptop laptop2 = laptopFactory2.getLaptop(new hpLaptopFactory());
        laptop2.laptopBuild();



    }




}