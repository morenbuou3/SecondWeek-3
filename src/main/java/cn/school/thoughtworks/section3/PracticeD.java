package cn.school.thoughtworks.section3;

import cn.school.thoughtworks.section2.PracticeB;

import java.util.List;
import java.util.Map;

public class PracticeD {
    Map<String, Integer> createUpdatedCollection(List<String> collectionA, Map<String, List<String>> object) {
        //实现练习要求，并改写该行代码。
        PracticeB section2PracticeB = new PracticeB();
        cn.school.thoughtworks.section3.PracticeB section3PracticeB = new cn.school.thoughtworks.section3.PracticeB();
        Map<String, Integer> collection3 = section2PracticeB.countSameElements(collectionA);
        collection3 = section3PracticeB.createUpdatedCollection(collection3, object);
        return collection3;
    }
}
