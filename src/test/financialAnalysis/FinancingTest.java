package test.financialAnalysis;

import main.financialAnalysis.Financing;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FinancingTest {
    //private Financing lynndale55 = new Financing();
    @Test
    void lynndale55MonthlyPayment() {
        Financing downPayment = new Financing(90000, 3.9, 30);
        Financing downPayment = new Financing(3000000, 5.01, 30);
    }

}