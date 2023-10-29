package main.financialAnalysis;

import java.util.ArrayList;

public class CashFlowAnalysis {
    private double acqusitionCost;
    private IncomeStatement incomeStatement;
    private ArrayList<Financing> financingSources;
    private double totalFinancingPayments;
    private double annualCashFlow;
    private double capRate;
    // include pre-conditions to this kid
    private void assertNInitialize(double acquisitionCost, IncomeStatement incomeStatement,
                                   ArrayList<Financing> financingSources) {
        this.acqusitionCost = acquisitionCost;
        this.incomeStatement = incomeStatement;
        this.financingSources = financingSources;
        totalFinancingPayments = 0;
        for (Financing loan : financingSources) {
            totalFinancingPayments += loan.getMonthlyPayment();
        }
        annualCashFlow = incomeStatement.getEBITDA() - totalFinancingPayments;
        capRate = incomeStatement.getEBITDA() / acquisitionCost;
    }
    public CashFlowAnalysis(double acquisitionCost, IncomeStatement incomeStatement,
                            ArrayList<Financing> financingSources) {
        assertNInitialize(acquisitionCost, incomeStatement, financingSources);
    }
    public CashFlowAnalysis(double acquisitionCost, IncomeStatement incomeStatement, Financing financingSource) {
        ArrayList<Financing> financingSources = new ArrayList<>();
        financingSources.add(financingSource);
        assertNInitialize(acquisitionCost, incomeStatement, financingSources);
    }
    private double getTotalProfit() {
        return 0;
    }

    private double getTotalProfit(int years) {
        return 0;
    }



}
