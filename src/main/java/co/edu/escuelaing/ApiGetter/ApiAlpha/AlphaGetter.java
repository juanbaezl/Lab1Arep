package co.edu.escuelaing.ApiGetter.ApiAlpha;

import co.edu.escuelaing.ApiGetter.APIClassGetter;

public class AlphaGetter extends APIClassGetter {

    private static final String ALPHA_URL = "https://www.alphavantage.co/query?";
    private static final String ALPHA_KEY = "&apikey=8US7JKS3WL37HQK9";

    public AlphaGetter(String function, String symbol) {
        super(ALPHA_URL, ALPHA_KEY);
        buildParameters();
        input.add(function);
        input.add(symbol);
        buildQuery();
    }

    public void buildParameters() {
        parameters.add("function=");
        parameters.add("&symbol=");
    }

}
