package co.edu.escuelaing.ApiGetter.ApiAlpha;

public class IntraDay extends AlphaGetter {

    /**
     * Constructor for IntraDay
     * 
     * @param symbol   Symbol of the company
     * @param interval Interval of the data
     */
    public IntraDay(String symbol, String interval) {
        super("TIME_SERIES_INTRADAY", symbol);
        parameters.add(2, "&interval=");
        input.add(2, interval);
        buildQuery();
    }

}
