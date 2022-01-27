package net.basilcam.builder;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        Release release = new Release.Builder("1000 Gecs", "100 Gecs")
                .withCountry("United States")
                .withReleaseDate(LocalDate.of(2020, Month.JULY, 2))
                .withFormat(FormatType.VINYL_12)
                .addTrack("A1", "745 Sticky")
                .addTrack("A2", "Money Machine")
                .addTrack("A3", "800db Cloud")
                .addTrack("A4", "I Need Help Immediately")
                .addTrack("A5", "Stupid Horse")
                .addTrack("B6", "xXXi_wud_nvrstøp_ÜXXx")
                .addTrack("B7", "Ringtone")
                .addTrack("B8", "gecgecgec")
                .addTrack("B9", "Hand Crushed By A Mallet")
                .addTrack("B10", "gec 2 Ü")
                .addStyle(StyleType.BUBBLEGUM)
                .addStyle(StyleType.ELECTRO)
                .addStyle(StyleType.DANCE)
                .addStyle(StyleType.EXPERIMENTAL)
                .withLabel("Dog Show Records")
                .withLabelId("MDS003V")
                .build();

        System.out.println("created album...");
        System.out.println(release);
    }
}
