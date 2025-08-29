package br.com.mariojp.solid.ocp;

public class PremiumCustomerDiscountPolicy implements DiscountPolicy {
    @Override
    public double apply(double amount) {
        return amount * 0.90; // 10% discount
    }
}
