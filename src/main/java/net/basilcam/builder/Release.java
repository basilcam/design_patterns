package net.basilcam.builder;

import com.google.common.collect.ImmutableList;
import org.jetbrains.annotations.Nullable;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Release {
    private final String name;
    private final String artist;
    @Nullable private final String country;
    @Nullable private final LocalDate releaseDate;
    @Nullable private final FormatType format;
    private final ImmutableList<Track> trackList;
    private final ImmutableList<StyleType> styles;
    @Nullable private final String label;
    @Nullable private final String labelId;

    private Release(String name,
                    String artist,
                    @Nullable String country, @Nullable LocalDate releaseDate,
                    @Nullable FormatType format, ImmutableList<Track> trackList, ImmutableList<StyleType> styles,
                    @Nullable String label,
                    @Nullable String labelId) {
        this.name = name;
        this.artist = artist;
        this.releaseDate = releaseDate;
        this.styles = styles;
        this.country = country;
        this.label = label;
        this.labelId = labelId;
        this.format = format;
        this.trackList = trackList;
    }

    public String getName() {
        return name;
    }

    public String getArtist() {
        return artist;
    }

    @Nullable
    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    @Nullable
    public ImmutableList<StyleType> getStyles() {
        return this.styles;
    }

    @Nullable
    public String getCountry() {
        return country;
    }

    @Nullable
    public String getLabel() {
        return label;
    }

    @Nullable
    public String getLabelId() {
        return labelId;
    }

    @Nullable
    public FormatType getFormat() {
        return format;
    }

    public ImmutableList<Track> getTrackList() {
        return this.trackList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Release release = (Release) o;
        return Objects.equals(name, release.name)
                && Objects.equals(artist, release.artist)
                && Objects.equals(releaseDate, release.releaseDate)
                && styles == release.styles
                && Objects.equals(country, release.country)
                && Objects.equals(label, release.label)
                && Objects.equals(labelId, release.labelId)
                && format == release.format
                && Objects.equals(trackList, release.trackList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, artist, releaseDate, styles, country, label, labelId, format, trackList);
    }

    @Override
    public String toString() {
        return "Release{" +
                "name='" + name + '\'' +
                ", artist='" + artist + '\'' +
                ", country='" + country + '\'' +
                ", releaseDate=" + releaseDate +
                ", format=" + format +
                ", trackList=" + trackList +
                ", styles=" + styles +
                ", label='" + label + '\'' +
                ", labelId='" + labelId + '\'' +
                '}';
    }

    public static class Builder {
        private final String name;
        private final String artist;
        @Nullable private String country;
        @Nullable private LocalDate releaseDate;
        @Nullable private FormatType format;
        private List<Track> trackList;
        private List<StyleType> styles;
        @Nullable private String label;
        @Nullable private String labelId;

        public Builder(String name, String artist) {
            this.name = name;
            this.artist = artist;
            this.country = null;
            this.releaseDate = null;
            this.format = null;
            this.trackList = new ArrayList<>();
            this.styles = new ArrayList<>();
            this.label = null;
            this.labelId = null;
        }

        public Release build() {
            return new Release(this.name,
                    this.artist,
                    this.country, this.releaseDate,
                    this.format, ImmutableList.copyOf(this.trackList), ImmutableList.copyOf(this.styles),
                    this.label,
                    this.labelId
            );
        }

        public Builder withCountry(String country) {
            this.country = country;
            return this;
        }

        public Builder withReleaseDate(LocalDate date) {
            this.releaseDate = date;
            return this;
        }

        public Builder withFormat(FormatType format) {
            this.format = format;
            return this;
        }

        public Builder addTrack(String trackNumber, String name) {
            this.trackList.add(new Track(trackNumber, name));
            return this;
        }

        public Builder addStyle(StyleType style) {
            this.styles.add(style);
            return this;
        }

        public Builder withLabel(String label) {
            this.label = label;
            return this;
        }

        public Builder withLabelId(String labelId) {
            this.labelId = labelId;
            return this;
        }
    }
}

