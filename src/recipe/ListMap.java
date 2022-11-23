package recipe;

import map.FullName;

import java.util.*;

public class ListMap {
    private static final Random RANDOM = new Random();
    private final Map<String, List<Integer>> listMap = new HashMap<>();

    public ListMap() {
        for (int i = 0; i < 5; i++) {
            listMap.put(String.valueOf(i), generateList());
        }
    }

    public Set<Map.Entry<String, List<Integer>>> getOriginalMapEntries() {
        return listMap.entrySet();
    }

    public Map<String, Integer> getTransformedCollection() {
        Map<String, Integer> result = new HashMap<>();
        for (Map.Entry<String, List<Integer>> entry : listMap.entrySet()) {
            int sum = 0;
            for (Integer number : entry.getValue()) {
                sum += number;
            }
            result.put(entry.getKey(), sum);
        }
        return result;
    }

    private List<Integer> generateList() {
        List<Integer> List = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            List.add(RANDOM.nextInt(1001));
        }
        return List;
    }
}
