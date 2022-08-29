package co.edu.escuelaing.ApiGetter.ApiPolygon;

import co.edu.escuelaing.ApiGetter.APIClassGetter;

public abstract class PolyGetter extends APIClassGetter {

    private final static String POLY_URL = "https://api.polygon.io/";
    private final static String POLY_KEY = "&apiKey=bjbp6YiIVJyxfKtvI4BsfKUQMVUxnMWd";

    /**
     * Constructor for PolyGetter
     * 
     * @param finalQuery String with the final query to be sent to the API
     */
    public PolyGetter(String finalQuery) {
        super(POLY_URL + finalQuery + "?", POLY_KEY);
        buildQuery();
    }

    /**
     * Metodo que construye los parametros para la consulta
     *
     */
    public abstract void buildParameters();
}
