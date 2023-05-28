package entities;

public class SilverDiscount implements DiscountStrategy {

    @Override
    public Double discountAplly(Double value) {
        return value*0.90; //10% de desconto
    }
}
