package main.financialAnalysis;

public class IncomeStatement {
    private double grossRentalRevenue;
    private double expenses;
    private static final double estimatedOperatingExpenses = 0.35;
    public IncomeStatement(double grossRentalRevenue, double expenses) {
        this.grossRentalRevenue = grossRentalRevenue;
        this.expenses = expenses;
    }

    public static double estimateExpenses(double grossRentalRevenue) {
        return grossRentalRevenue - grossRentalRevenue * estimatedOperatingExpenses;
    }
    public double getEBITDA() {
        return grossRentalRevenue - expenses;
    }



}
