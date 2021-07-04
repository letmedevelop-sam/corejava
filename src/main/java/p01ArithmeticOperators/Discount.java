package p01ArithmeticOperators;

public class Discount {
    public static void main(String[] args) {
        // This program calculates the sale price of an item,
        // that is regularly priced at $59, with a %20 discount on it

        int regularPrice = 59;
        double discount;
        double salesPrice;

        discount = regularPrice*0.2;
        salesPrice = regularPrice-discount;

        System.out.println("regular Price : $ " + regularPrice);
        System.out.println("Discount Amount %20 : $ " + discount);
        System.out.println("Sales Price with a %20 discount : $ " + salesPrice);

    }
}
