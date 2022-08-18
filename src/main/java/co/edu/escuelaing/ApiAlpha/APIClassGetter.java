package co.edu.escuelaing.ApiAlpha;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

public class APIClassGetter {

    // Request to the API
    private static final String USER_AGENT = "Mozilla/5.0";
    private static final String GET_URL = "https://www.alphavantage.co/query?";
    private static final String API_KEY = "&apikey=demo";

    // Attributes
    protected ArrayList<String> parameters = new ArrayList<>();
    protected ArrayList<String> input = new ArrayList<>();
    private StringBuilder query;

    public APIClassGetter(String function, String symbol) {
        buildParameters();
        input.add(function);
        input.add(symbol);
        buildQuery();
    }

    public APIClassGetter() {
    }

    public void buildParameters() {
        parameters.add("function=");
        parameters.add("&symbol=");
    }

    public void buildQuery() {
        query = new StringBuilder();
        byte counter = 0;
        query.append(GET_URL);
        for (String parameter : parameters) {
            query.append(parameter);
            try {
                query.append(input.get(counter));
            } catch (IndexOutOfBoundsException indexBounds) {
                System.out.println("Intended out of bounds error access. Skipping");
                System.out.println("In AlphaVantageQuery.java - buildQuery()");
            }
            counter++;
        }
        query.append(API_KEY);
    }

    public String getStock() throws IOException {
        URL obj = new URL(query.toString());
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("User-Agent", USER_AGENT);
        int responseCode = con.getResponseCode();
        System.out.println("GET Response Code :: " + responseCode);
        if (responseCode == HttpURLConnection.HTTP_OK) {
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            return response.toString();
        } else {
            System.out.println("GET request not worked");
            return "GET request not worked";
        }
    }

}
