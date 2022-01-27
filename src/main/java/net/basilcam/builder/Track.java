package net.basilcam.builder;

public class Track {
    private String trackNumber;
    private String name;

    public Track(String trackNumber, String name) {
        this.trackNumber = trackNumber;
        this.name = name;
    }

    public String getTrackNumber() {
        return this.trackNumber;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Track{" +
                "trackNumber='" + trackNumber + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
