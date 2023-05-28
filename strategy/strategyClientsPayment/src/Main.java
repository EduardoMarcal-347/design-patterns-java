import entities.*;

public class Main {
    public static void main(String[] args) {
        DiscountStrategy gold = new GoldDiscount();
        DiscountStrategy silver = new SilverDiscount();
        DiscountStrategy bronze = new BronzeDiscount();
        Payment goldClient = new Payment(gold);
        Payment silverClient = new Payment(silver);
        Payment bronzeClient = new Payment(bronze);

        // testes usando um produto que teria o valor original de $100
        System.out.printf("Preço final para cliente com acesso ao gold: $%.2f\n",
                goldClient.calculateFinalPrice(100D));
        System.out.printf("Preço final para cliente com acesso ao silver: $%.2f\n",
                silverClient.calculateFinalPrice(100D));
        System.out.printf("Preço final para cliente com acesso ao bronze: $%.2f\n",
                bronzeClient.calculateFinalPrice(100D));
    }
}