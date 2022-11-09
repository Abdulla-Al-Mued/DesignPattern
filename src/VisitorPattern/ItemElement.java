package VisitorPattern;

public interface ItemElement {
    public double accept(ShoppingCartVisitor visitor);
}
