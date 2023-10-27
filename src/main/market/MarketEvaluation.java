package main.market;

import main.financialAnalysis.CashFlowAnalysis;

import java.util.ArrayList;
import java.util.Iterator;

public class MarketEvaluation implements Iterable<CashFlowAnalysis> {
    ArrayList<CashFlowAnalysis> cfa;
    public MarketEvaluation(MarketSubdivision ms, Mortgage mortgage) {

    }

    public Iterator<CashFlowAnalysis> iterator() {
        return cfa.iterator();
    }
}
