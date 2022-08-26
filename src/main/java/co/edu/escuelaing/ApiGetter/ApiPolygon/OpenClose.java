package co.edu.escuelaing.ApiGetter.ApiPolygon;

public class OpenClose extends PolyGetter {

    private final static String finalQuery = "v1/open-close/";

    public OpenClose(String symbol, String day) {
        super(finalQuery + symbol + "/" + day);
    }

    @Override
    public void buildParameters() {
    }

}
