package cn.school.thoughtworks.section3;

import cn.school.thoughtworks.section2.PracticeA;

import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String, Integer> createUpdatedCollection(List<String> collectionA, Map<String, List<String>> object) {
        //实现练习要求，并改写该行代码。
        PracticeA section2PracticeA = new PracticeA();
        PracticeB section3PracticeB = new PracticeB();
        Map<String, Integer> collection3 = section2PracticeA.countSameElements(collectionA);
        collection3 = section3PracticeB.createUpdatedCollection(collection3, object);
        return collection3;
    }
}
