package br.com.mariojp.solid.ocp;

public class RegularCustomerDiscountPolicy implements DiscountPolicy {
    @Override
    public double apply(double amount) {
        return amount * 0.95; // 5% discount
    }
}
