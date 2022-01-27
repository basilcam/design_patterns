package net.basilcam.visitor;

public interface ItemVisitable {
    double accept(ItemVisitor visitor);
}
