package VisitorPattern;

public class ShoppingCartVisitorImp implements ShoppingCartVisitor{
    @Override
    public double visit(Book book) {
        double price = 0;
        if (book.getPrice() > 50)
            price = book.getPrice() - 5;
        else
            price = book.getPrice();
        System.out.println("Book Name is "+book.getName()+"  price is "+price);

        return price;
    }

    @Override
    public double visit(Fruit fruit) {

        double price = 0;
        price = fruit.getWeight()* fruit.getWeightPerPrice();
        System.out.println(fruit.getName()+" price is "+price);

        return price;
    }
}
