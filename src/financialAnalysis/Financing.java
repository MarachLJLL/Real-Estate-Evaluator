package financialAnalysis;

public class Financing {
    // Based off monthly payments
    private double principal;
    private double interest;
    private int terms; // years
    public Financing(double principal, double interest, int terms) {
        this.principal = principal;
        this.interest = interest;
        this.terms = terms;
    }

    public double getPmt() { // monthly payments for mortgage
        double percentFix = 1;
        if (interest > 1) percentFix = 100;
        double p = principal;
        double r = interest/12/percentFix; // interest rate per period
        double n = terms * 12; // number of payment periods
        return -p * r / (1 - Math.pow(1 + r, -n));
    }

    public static void main() {
        Financing f = new Financing(320000, 5.01, 30);
        System.out.println(f.getPmt());
    }
}
