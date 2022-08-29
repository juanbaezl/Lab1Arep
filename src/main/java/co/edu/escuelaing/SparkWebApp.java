package co.edu.escuelaing;

import static spark.Spark.*;

import java.io.IOException;

import co.edu.escuelaing.ApiGetter.ApiAlpha.Daily;
import co.edu.escuelaing.ApiGetter.ApiAlpha.IntraDay;
import co.edu.escuelaing.ApiGetter.ApiAlpha.Monthly;
import co.edu.escuelaing.ApiGetter.ApiAlpha.Weekly;
import co.edu.escuelaing.ApiGetter.ApiPolygon.Aggregates;
import co.edu.escuelaing.ApiGetter.ApiPolygon.OpenClose;
import co.edu.escuelaing.ApiGetter.ApiPolygon.PreviousClose;
import spark.Request;

public class SparkWebApp {

    public static void main(String[] args) {
        port(getPort());
        staticFiles.location("/public");
        post("/hello", (req, res) -> "Hello " + req.queryParams("name"));
        get("/hello", (req, res) -> "Hello " + req.queryParams("name"));
        get("/stock", (req, res) -> {
            res.type("application/json");
            return identifyFunction(req);
        });
    }

    /**
     * Identify the function to be executed
     * 
     * @param req request from the client
     * @return Response to be send
     */
    private static String identifyFunction(Request req) throws IOException {
        String res = "";
        switch (req.queryParams("function")) {
            case "intraday":
                res = new IntraDay(req.queryParams("symbol"), req.queryParams("interval")).getStock();
                break;
            case "daily":
                res = new Daily(req.queryParams("symbol")).getStock();
                break;
            case "weekly":
                res = new Weekly(req.queryParams("symbol")).getStock();
                break;
            case "monthly":
                res = new Monthly(req.queryParams("symbol")).getStock();
                break;
            case "aggregates":
                res = new Aggregates(req.queryParams("symbol"), req.queryParams("day1"), req.queryParams("day2"))
                        .getStock();
                break;
            case "openclose":
                res = new OpenClose(req.queryParams("symbol"), req.queryParams("day1")).getStock();
                break;
            case "previousclose":
                res = new PreviousClose(req.queryParams("symbol")).getStock();
                break;
            default:
                res = "Invalid function";
                break;
        }
        return res;
    }

    private static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 5000;
    }
}