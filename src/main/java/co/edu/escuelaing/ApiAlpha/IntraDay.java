package co.edu.escuelaing.ApiAlpha;

public class IntraDay extends APIClassGetter {

    public IntraDay(String symbol, String interval) {
        super("TIME_SERIES_INTRADAY", symbol);
        parameters.add(2, "&interval=");
        input.add(2, interval);
        buildQuery();
    }

}
