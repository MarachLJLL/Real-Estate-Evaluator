package financialAnalysis;

import java.util.ArrayList;

public class Mortgage {
    private float interest;
    private double percentDownPayment;
    private int terms;
    private int months;
    private float monthlyPayment;
    private ArrayList<PaymentBreakdown> monthlyPaymentBreakdown;
    public Mortgage (float interest, double percentDownPayment, int terms) {
        this.interest = interest;
        this.percentDownPayment = percentDownPayment;
        this.terms = terms;
        this.months = terms * 12;
        this.monthlyPaymentBreakdown = new ArrayList<PaymentBreakdown>(months);
    }

    private class PaymentBreakdown {
        public float interest;
        public float equityPaydown;
        public float obligation;
    }



}
