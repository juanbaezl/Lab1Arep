package co.edu.escuelaing.ApiGetter.ApiAlpha;

public class Daily extends AlphaGetter {

    /**
     * Constructor for Daily
     * 
     * @param symbol Symbol of the company
     */
    public Daily(String symbol) {
        super("TIME_SERIES_DAILY", symbol);
    }

}
