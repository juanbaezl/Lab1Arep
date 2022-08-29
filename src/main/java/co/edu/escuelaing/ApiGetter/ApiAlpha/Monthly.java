package co.edu.escuelaing.ApiGetter.ApiAlpha;

public class Monthly extends AlphaGetter {

    /**
     * Constructor for Monthly
     * 
     * @param symbol Symbol of the company
     */
    public Monthly(String symbol) {
        super("TIME_SERIES_MONTHLY", symbol);
    }

}
