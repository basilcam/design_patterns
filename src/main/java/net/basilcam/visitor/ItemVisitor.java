package net.basilcam.visitor;

public interface ItemVisitor {
    double visit(VinylRecord record);
    double visit(Strawberry produce);
    double visit(Beer beer);
}
