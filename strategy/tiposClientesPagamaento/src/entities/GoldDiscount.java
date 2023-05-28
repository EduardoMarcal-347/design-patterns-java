package entities;

public class GoldDiscount implements DiscountStrategy{

    @Override
    public Double discountAplly(Double value) {
        return value*0.85; //15% de desconto
    }
}
