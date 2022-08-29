package co.edu.escuelaing.ApiGetter.ApiAlpha;

public class Weekly extends AlphaGetter {

    /**
     * Constructor for Weekly
     * 
     * @param symbol
     */
    public Weekly(String symbol) {
        super("TIME_SERIES_WEEKLY", symbol);
    }

}
