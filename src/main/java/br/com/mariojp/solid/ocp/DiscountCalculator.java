package br.com.mariojp.solid.ocp;

import java.util.Map;

public class DiscountCalculator {
    private final Map<CustomerType, DiscountPolicy> discountPolicies;
    
    public DiscountCalculator() {
        this.discountPolicies = Map.of(
            CustomerType.REGULAR, new RegularCustomerDiscountPolicy(),
            CustomerType.PREMIUM, new PremiumCustomerDiscountPolicy(),
            CustomerType.PARTNER, new PartnerCustomerDiscountPolicy()
        );
    }
    
    public DiscountCalculator(Map<CustomerType, DiscountPolicy> discountPolicies) {
        this.discountPolicies = discountPolicies;
    }
    
    public double apply(double amount, CustomerType type) {
        DiscountPolicy policy = discountPolicies.getOrDefault(type, new NoDiscountPolicy());
        return policy.apply(amount);
    }
}
