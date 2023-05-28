package entities;

public class Payment {

    private DiscountStrategy discountStrategy;

    public Payment(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public double calculateFinalPrice(Double value){
        return discountStrategy.discountAplly(value);
    }
}
