package financialAnalysis;

import java.util.ArrayList;

public class Mortgage {
    private double interest;
    private double percentDownPayment;
    private int terms;
    private int months;
    private double monthlyPayment;
    private ArrayList<PaymentBreakdown> monthlyPaymentBreakdown;
    public Mortgage (double interest, double percentDownPayment, int terms) {
        this.interest = interest;
        this.percentDownPayment = percentDownPayment;
        this.terms = terms;
        this.months = terms * 12;
        this.monthlyPaymentBreakdown = new ArrayList<PaymentBreakdown>(months);
    }

    private class PaymentBreakdown {
        public double interest;
        public double equityPaydown;
        public double obligation;
    }



}
