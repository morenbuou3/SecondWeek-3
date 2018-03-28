package cn.school.thoughtworks.section1;

import java.util.*;

public class PracticeB {
    List<String> collectSameElements(List<String> collection1, List<List<String>> collection2) {
        //实现练习要求，并改写该行代码。
        /*去除重复元素*/
        Set<String> set = new LinkedHashSet<>();
        if (collection1 != null && collection2 != null) {
            for (String aCollection1 : collection1) {
                boolean flag = false;
                for (List<String> aCollection2 : collection2) {
                    for (String anACollection2 : aCollection2) {
                        if (aCollection1.equals(anACollection2)) {
                            set.add(anACollection2);
                            flag = true;
                            break;
                        }
                    }
                    if (flag) {
                        break;
                    }
                }
            }
            return new ArrayList<>(set);
        }
        return Collections.emptyList();
    }
}
