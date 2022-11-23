package recipe;

import java.util.HashMap;
import java.util.Map;

public class Task {
    private final Map<String, Integer> map = new HashMap<>();

    public void addToMap(String key, int value) {
        if (!map.containsKey(key)) {
            map.put(key, value);
        } else {
            int valueFromMap = map.get(key);
            if (valueFromMap == value) {
                throw new IllegalArgumentException();
            } else {
                map.put(key, valueFromMap + value);
            }
        }
    }
}
