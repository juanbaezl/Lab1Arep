package co.edu.escuelaing.ApiGetter.ApiPolygon;

public class PreviousClose extends PolyGetter {

    private final static String finalQuery = "v2/aggs/ticker/";

    public PreviousClose(String symbol) {
        super(finalQuery + symbol + "/prev");
    }

    @Override
    public void buildParameters() {
    }

}
