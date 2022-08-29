package co.edu.escuelaing.ApiGetter.ApiAlpha;

import co.edu.escuelaing.ApiGetter.APIClassGetter;

public class AlphaGetter extends APIClassGetter {

    private static final String ALPHA_URL = "https://www.alphavantage.co/query?";
    private static final String ALPHA_KEY = "&apikey=8US7JKS3WL37HQK9";

    /**
     * Constructor for AlphaGetter
     * 
     * @param function String with the function to be sent to the API
     * @param symbol   String with the symbol of the company
     */
    public AlphaGetter(String function, String symbol) {
        super(ALPHA_URL, ALPHA_KEY);
        buildParameters();
        input.add(function);
        input.add(symbol);
        buildQuery();
    }

    /**
     * Metodo que construye los parametros para la consulta
     *
     */
    public void buildParameters() {
        parameters.add("function=");
        parameters.add("&symbol=");
    }

}
