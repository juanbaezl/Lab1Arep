package co.edu.escuelaing.ApiGetter.ApiPolygon;

public class Aggregates extends PolyGetter {

    private final static String finalQuery = "v2/aggs/ticker/";

    public Aggregates(String symbol, String day1, String day2) {
        super(finalQuery + symbol + "/range/1/day/" + day1 + "/" + day2);
    }

    @Override
    public void buildParameters() {
    }

}
