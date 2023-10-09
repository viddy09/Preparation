package Prototype;

import java.util.HashMap;
import java.util.Map;

public class CarRegistry {
    Map<String,Car> registry = new HashMap<>();

    Car getEntry(String key){
       return registry.get(key);
    }

    void register(String key, Car car){
        registry.put(key, car);
    }

}
