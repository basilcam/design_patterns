package net.basilcam.visitor;

public class VinylRecord implements ItemVisitable {
    private final double price;
    private final int count;
    private final String artistName;
    private final String albumName;

    public VinylRecord(double price, int count, String artistName, String albumName) {
        this.price = price;
        this.count = count;
        this.artistName = artistName;
        this.albumName = albumName;
    }

    public double getPrice() {
        return this.price;
    }

    public int getCount() {
        return this.count;
    }

    public String getArtistName() {
        return this.artistName;
    }

    public String getAlbumName() {
        return this.albumName;
    }

    @Override
    public double accept(ItemVisitor visitor) {
        return visitor.visit(this);
    }
}
