package cn.school.thoughtworks.section3;

import java.util.List;
import java.util.Map;

public class PracticeB {
    Map<String, Integer> createUpdatedCollection(Map<String, Integer> collectionA, Map<String, List<String>> object) {
        //实现练习要求，并改写该行代码。
        if (collectionA != null && object != null) {
            for (String key : collectionA.keySet()) {
                if (object.get("value").contains(key)) {
                    Integer number = collectionA.get(key);
                    collectionA.put(key, number - number / 3);
                }
            }
        }
        return collectionA;
    }
}
