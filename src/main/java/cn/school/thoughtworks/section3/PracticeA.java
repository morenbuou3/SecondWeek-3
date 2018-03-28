package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeA {
    Map<String, Integer> createUpdatedCollection(Map<String, Integer> collectionA, Map<String, List<String>> object) {
        //实现练习要求，并改写该行代码。
        if (collectionA != null && object != null) {
            for (String key : collectionA.keySet()) {
                if (object.get("value").contains(key)) {
                    collectionA.put(key, collectionA.get(key) - 1);
                }
            }
        }
        return collectionA;
    }
}
