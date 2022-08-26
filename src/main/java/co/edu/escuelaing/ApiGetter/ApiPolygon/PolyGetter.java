package co.edu.escuelaing.ApiGetter.ApiPolygon;

import co.edu.escuelaing.ApiGetter.APIClassGetter;

public abstract class PolyGetter extends APIClassGetter {

    private final static String POLY_URL = "https://api.polygon.io/";
    private final static String POLY_KEY = "&apiKey=bjbp6YiIVJyxfKtvI4BsfKUQMVUxnMWd";

    public PolyGetter(String finalQuery) {
        super(POLY_URL + finalQuery + "?", POLY_KEY);
        buildQuery();
    }

    public abstract void buildParameters();
}
