package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeB {
    public Map<String, Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        Map<String, Integer> map = new HashMap<>();
        if (collection1 != null) {
            for (String key : collection1) {
                int value = 1;
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
