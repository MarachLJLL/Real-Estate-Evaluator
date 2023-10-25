package market;

import financialAnalysis.CashFlowAnalysis;
import financialAnalysis.Mortgage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MarketEvaluation implements Iterable<CashFlowAnalysis> {
    ArrayList<CashFlowAnalysis> cfa;
    public MarketEvaluation(MarketSubdivision ms, Mortgage mortgage) {

    }

    public Iterator<CashFlowAnalysis> iterator() {
        return cfa.iterator();
    }
}
