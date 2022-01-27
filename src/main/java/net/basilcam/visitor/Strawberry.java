package net.basilcam.visitor;

public class Strawberry implements ItemVisitable {
    private final double pricePerPound;
    private final double weightPounds;

    public Strawberry(double pricePerPound, double weightPounds) {
        this.pricePerPound = pricePerPound;
        this.weightPounds = weightPounds;
    }

    public double getPricePerPound() {
        return this.pricePerPound;
    }

    public double getWeightPounds() {
        return this.weightPounds;
    }

    @Override
    public double accept(ItemVisitor visitor) {
        return visitor.visit(this);
    }
}
