package br.com.mariojp.solid.ocp;

public class NoDiscountPolicy implements DiscountPolicy {
    @Override
    public double apply(double amount) {
        return amount; // No discount
    }
}
