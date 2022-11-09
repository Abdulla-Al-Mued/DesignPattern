package VisitorPattern;

public class Fruit implements ItemElement{

    String name;
    double weight, weightPerPrice;

    public Fruit(String name, double weight, double weightPerPrice) {
        this.name = name;
        this.weight = weight;
        this.weightPerPrice = weightPerPrice;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public double getWeightPerPrice() {
        return weightPerPrice;
    }

    @Override
    public double accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}
