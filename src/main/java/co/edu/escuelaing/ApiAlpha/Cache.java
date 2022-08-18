package co.edu.escuelaing.ApiAlpha;

import java.util.HashMap;

public class Cache {

    private static final Cache _instance = new Cache();
    private HashMap<String, String> cache = new HashMap<>();

    private Cache() {
    }

    public void insert(String key, String value) {
        cache.put(key, value);
    }

    public String get(String key) {
        return cache.get(key);
    }

    public boolean contains(String key) {
        return cache.containsKey(key);
    }

    public static Cache getInstance() {
        return _instance;
    }
}
