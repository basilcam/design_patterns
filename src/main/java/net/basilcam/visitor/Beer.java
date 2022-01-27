package net.basilcam.visitor;

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
}
