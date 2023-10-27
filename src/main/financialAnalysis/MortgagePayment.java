package main.financialAnalysis;

public class MortgagePayment {
    private double interestPayment;
    private double equityPaydown;
    public MortgagePayment(double interestPayment, double equityPaydown) {
        this.interestPayment = interestPayment;
        this.equityPaydown = equityPaydown;
    }

    public double getInterestPayment() {
        return interestPayment;
    }

    public double getEquityPaydown() {
        return equityPaydown;
    }
}
