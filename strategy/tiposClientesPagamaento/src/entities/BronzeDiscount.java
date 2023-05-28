package entities;

public class BronzeDiscount implements DiscountStrategy {

    @Override
    public Double discountAplly(Double value) {
        return value*0.95; //5% de ddesconto
    }

}
