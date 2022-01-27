package net.basilcam.builder;

public enum StyleType {
    BUBBLEGUM(GenreType.POP),
    DANCE(GenreType.POP),
    KPOP(GenreType.POP),
    ELECTRO(GenreType.ELECTRONIC),
    HARDCORE(GenreType.ELECTRONIC),
    EXPERIMENTAL(GenreType.ELECTRONIC),
    PHONK(GenreType.HIP_HOP),
    BOOM_BAP(GenreType.HIP_HOP),
    BOSSA_NOVA(GenreType.JAZZ),
    MODAL(GenreType.JAZZ);

    private final GenreType genre;

    StyleType(GenreType genre) {
        this.genre = genre;
    }

    public GenreType getGenre() {
        return this.genre;
    }
}
