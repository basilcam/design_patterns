package net.basilcam.visitor;

public class PriceCalculator implements ItemVisitor {
    @Override
    public double visit(VinylRecord record) {
        return record.getPrice() * record.getCount();
    }

    @Override
    public double visit(Strawberry produce) {
        return produce.getPricePerPound() * produce.getWeightPounds();
    }

    @Override
    public double visit(Beer beer) {
        double volumeOz = beer.getVolumeOz();
        double price = beer.getPricePerOz() * volumeOz;


        if (volumeOz < 32) {
            return price;
        } else if (volumeOz >= 32 && volumeOz < 64) {
            return price * 0.90;
        } else {
            return price * 0.80;
        }
    }
}
