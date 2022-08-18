package co.edu.escuelaing.ApiAlpha;

public class Daily extends APIClassGetter {

    public Daily(String symbol) {
        super("TIME_SERIES_DAILY", symbol);
    }

}
