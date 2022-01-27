package net.basilcam.visitor;

import java.util.Objects;

public class Beer implements ItemVisitable {
    private final String brewery;
    private final String flavor;
    private final double pricePerOz;
    private final double volumeOz;

    public Beer(String brewery, String flavor, double pricePerOz, int volumeOz) {
        this.brewery = brewery;
        this.flavor = flavor;
        this.pricePerOz = pricePerOz;
        this.volumeOz = volumeOz;
    }

    public String getBrewery() {
        return this.brewery;
    }

    public String getFlavor() {
        return this.flavor;
    }

    public double getPricePerOz() {
        return this.pricePerOz;
    }

    public double getVolumeOz() {
        return this.volumeOz;
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

        Beer beer = (Beer) o;

        return Double.compare(beer.pricePerOz, pricePerOz) == 0
                && Double.compare(beer.volumeOz, volumeOz) == 0
                && Objects.equals(brewery, beer.brewery)
                && Objects.equals(flavor, beer.flavor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brewery, flavor, pricePerOz, volumeOz);
    }

    @Override
    public String toString() {
        return "Beer{" +
                "brewery='" + brewery + '\'' +
                ", flavor='" + flavor + '\'' +
                ", pricePerOz=" + pricePerOz +
                ", volumeOz=" + volumeOz +
                '}';
    }
}
