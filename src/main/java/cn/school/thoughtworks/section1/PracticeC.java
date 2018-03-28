package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class PracticeC {
    List<String> collectSameElements(List<String> collection1, Map<String,List<String>> collection2) {
        //实现练习要求，并改写该行代码。
        if (collection1 != null && collection2 != null) {
            List<String> list = new ArrayList<>(collection1);
            List<String> list2 = new ArrayList<>(collection2.get("value"));
            list.retainAll(list2);
            return list;
        }
        return Collections.emptyList();
    }
}
