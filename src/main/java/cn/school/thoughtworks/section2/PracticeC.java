package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String, Integer> countSameElements(List<String> collection1) {
        Map<String, Integer> map = new HashMap<>();
        if (collection1 != null) {
            for (String key : collection1) {
                int value = 1;
                key = key.replace(":", "-")
                        .replace("[", "-")
                        .replace("]", "");
                if (key.contains("-")) {
                    String[] strings = key.split("-");
                    key = strings[0];
                    value = Integer.parseInt(strings[1]);
                }
                if (!map.containsKey(key)) {
                    map.put(key, value);
                } else {
                    map.put(key, map.get(key) + value);
                }
            }
        }
        return map;
    }
}
