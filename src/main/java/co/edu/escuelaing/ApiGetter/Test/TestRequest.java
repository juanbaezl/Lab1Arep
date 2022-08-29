package co.edu.escuelaing.ApiGetter.Test;

import java.io.IOException;
import java.util.List;
import java.util.Random;

import co.edu.escuelaing.ApiGetter.ApiAlpha.Daily;
import co.edu.escuelaing.ApiGetter.ApiAlpha.IntraDay;
import co.edu.escuelaing.ApiGetter.ApiAlpha.Monthly;
import co.edu.escuelaing.ApiGetter.ApiAlpha.Weekly;
import co.edu.escuelaing.ApiGetter.ApiPolygon.Aggregates;
import co.edu.escuelaing.ApiGetter.ApiPolygon.OpenClose;
import co.edu.escuelaing.ApiGetter.ApiPolygon.PreviousClose;

public class TestRequest implements Runnable {

    private static final List<String> category = List.of("intraday", "daily", "weekly", "monthly", "aggregates",
            "openclose", "previousclose");

    @Override
    public void run() {
        Random rand = new Random();
        String randomElement = category.get(rand.nextInt(category.size()));
        String res = "";
        try {
            if (randomElement.equals("intraday")) {
                IntraDay intraDay = new IntraDay("MSFT", "1min");
                res = intraDay.getStock();
            } else if (randomElement.equals("daily")) {
                Daily daily = new Daily("MSFT");
                res = daily.getStock();
            } else if (randomElement.equals("weekly")) {
                Weekly weekly = new Weekly("MSFT");
                res = weekly.getStock();
            } else if (randomElement.equals("monthly")) {
                Monthly monthly = new Monthly("MSFT");
                res = monthly.getStock();
            } else if (randomElement.equals("aggregates")) {
                Aggregates aggregates = new Aggregates("AAPL", "2020-10-14", "2020-10-15");
                res = aggregates.getStock();
            } else if (randomElement.equals("openclose")) {
                OpenClose openClose = new OpenClose("AAPL", "2020-10-14");
                res = openClose.getStock();
            } else if (randomElement.equals("previousclose")) {
                PreviousClose previousClose = new PreviousClose("AAPL");
                res = previousClose.getStock();
            }
            System.out.println(randomElement + ": " + res.substring(0, 20));
        } catch (IOException e) {
            System.out.println("error: " + e);
            e.printStackTrace();
        }
    }
}
