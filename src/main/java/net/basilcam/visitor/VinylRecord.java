package net.basilcam.visitor;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        VinylRecord record = (VinylRecord) o;

        return Double.compare(record.price, price) == 0
                && count == record.count
                && Objects.equals(artistName, record.artistName)
                && Objects.equals(albumName, record.albumName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, count, artistName, albumName);
    }

    @Override
    public String toString() {
        return "VinylRecord{" +
                "price=" + price +
                ", count=" + count +
                ", artistName='" + artistName + '\'' +
                ", albumName='" + albumName + '\'' +
                '}';
    }
}
