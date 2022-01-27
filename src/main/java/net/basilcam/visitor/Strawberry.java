package net.basilcam.visitor;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Strawberry strawberry = (Strawberry) o;

        return Double.compare(strawberry.pricePerPound, pricePerPound) == 0
                && Double.compare(strawberry.weightPounds, weightPounds) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pricePerPound, weightPounds);
    }

    @Override
    public String toString() {
        return "Strawberry{" +
                "pricePerPound=" + pricePerPound +
                ", weightPounds=" + weightPounds +
                '}';
    }
}
