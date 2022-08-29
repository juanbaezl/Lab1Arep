package co.edu.escuelaing.ApiGetter.Test;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class APITestConcurrency {

    /**
     * Metodo que ejecuta el test de concurrencia
     */
    public static void main(String[] args) throws IOException {
        int numThreads = Integer.parseInt(args[0]);
        ExecutorService poolDeHilos = Executors.newFixedThreadPool(10);
        while (numThreads > 0) {
            numThreads--;
            poolDeHilos.execute(new TestRequest());
        }
        poolDeHilos.shutdown();
    }

}
