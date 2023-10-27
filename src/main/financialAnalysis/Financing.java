package main.financialAnalysis;

import java.util.ArrayList;

public class Financing {
    // Based off monthly payments
    private double principal;
    private double interest;
    private int terms; // years
    private int numberOfPayments;
    private double totalMonthlyPayment;
    private ArrayList<MortgagePayment> monthlyPaymentBreakdown;
    private static final int MONTHSPERYEAR = 12;

    public Financing(double principal, double interest, int terms) {
        this.principal = principal;
        this.interest = interest;
        this.terms = terms;
        this.numberOfPayments = terms * 12;
        this.monthlyPaymentBreakdown = new ArrayList<>(numberOfPayments);
        calcPmt();
        fillMonthlyPaymentBreakdown();
    }

    public void calcPmt() { // monthly payments for mortgage
        double percentFix = 1;
        if (interest > 1) percentFix = 100;
        double p = principal;
        double r = interest / MONTHSPERYEAR / percentFix; // interest rate per period
        double n = terms * MONTHSPERYEAR; // number of payment periods
        totalMonthlyPayment = p * r / (1 - Math.pow(1 + r, -n));
    }
    private void fillMonthlyPaymentBreakdown() {
        double percentFix = 1;
        if (interest > 1) percentFix = 100;
        double remainingPrincipal = principal;
        double monthlyInterest = interest / percentFix / MONTHSPERYEAR;
        double interestPayment;
        double equityPaydown;
        for (int i = 0; i < numberOfPayments; i++) {
            interestPayment = remainingPrincipal * monthlyInterest;
            equityPaydown = totalMonthlyPayment - interestPayment;
            remainingPrincipal -= equityPaydown;
            interestPayment = Math.round(interestPayment);
            equityPaydown = Math.round(equityPaydown);
            monthlyPaymentBreakdown.add(new MortgagePayment(interestPayment, equityPaydown));
        }
    }

    public static void main(String argsp[]) {
        Financing f = new Financing(320000, 5.01, 30);
        MortgagePayment mp;
        for (int counter = 0; counter < f.monthlyPaymentBreakdown.size(); counter++) {
            mp = f.monthlyPaymentBreakdown.get(counter);
            System.out.println(counter + ":" + mp.getInterestPayment() + ":" + mp.getEquityPaydown());
        }
    }
}
