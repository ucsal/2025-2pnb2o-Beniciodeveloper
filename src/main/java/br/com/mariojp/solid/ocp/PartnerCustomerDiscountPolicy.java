package br.com.mariojp.solid.ocp;

public class PartnerCustomerDiscountPolicy implements DiscountPolicy {
    @Override
    public double apply(double amount) {
        return amount * 0.88; // 12% discount
    }
}
