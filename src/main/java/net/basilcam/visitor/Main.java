package net.basilcam.visitor;

public class Main {
    public static void main(String[] args) {
        VinylRecord record = new VinylRecord(20.0, 1, "Nujabes", "Modal Soul");
        Strawberry strawberry = new Strawberry(4.0, 3.2);
        Beer beer = new Beer("Peroni", "Lager", 0.10, 64);

        PriceCalculator calculator = new PriceCalculator();
        double totalPrice = 0.0;
        totalPrice += calculator.visit(record);
        totalPrice += calculator.visit(strawberry);
        totalPrice += calculator.visit(beer);

        System.out.println("total price: " + totalPrice);
    }
}
