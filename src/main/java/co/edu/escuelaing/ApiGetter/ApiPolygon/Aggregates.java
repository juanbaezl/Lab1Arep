package co.edu.escuelaing.ApiGetter.ApiPolygon;

public class Aggregates extends PolyGetter {

    // Query for the API
    private final static String finalQuery = "v2/aggs/ticker/";

    /**
     * Constructor for Aggregates
     * 
     * @param symbol Symbol of the company
     * @param day1   First day of the period
     * @param day2   Final day of the period
     */
    public Aggregates(String symbol, String day1, String day2) {
        super(finalQuery + symbol + "/range/1/day/" + day1 + "/" + day2);
    }

    @Override
    public void buildParameters() {
    }

}
