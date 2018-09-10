import java.util.*;

public class CollectionTest {
    public static void main(String[] args) {
        Map<String, String> tmpMap = new HashMap<String, String>();
        tmpMap.put("1","nice");
        tmpMap.put("7","bad");
        tmpMap.put("3","bad");
//        for(String item:tmpMap.keySet()){
//            System.out.println(tmpMap.get(item));
//        }
        for(Map.Entry<String, String> item :tmpMap.entrySet())
        {
            System.out.println(item.getKey());
            System.out.println(item.getValue());
        }
        Map<String, String> tmpMap2 = new LinkedHashMap<String, String>();
        tmpMap2.put("1","nice");
        tmpMap2.put("7","bad");
        tmpMap2.put("3","bad");
        for(Map.Entry<String, String> item :tmpMap2.entrySet())
        {
            System.out.println(item.getKey());
            System.out.println(item.getValue());
        }

//        new Comparator<String>() {
//            public int compare(String o1, String o2) {
//                return 0;
//            }}.compare("123","efe");

        Map<String, String> tmpMap3 = new TreeMap<String, String>();
        Map<String, String> tmpMap4 = new TreeMap<String, String>(new Comparator<String>() {
            public int compare(String o1, String o2) {
                return 0;
            }
        });

        tmpMap3.put("1","nice");
        tmpMap3.put("7","bad");
        tmpMap3.put("3","bad");
        for(Map.Entry<String, String> item :tmpMap.entrySet())
        {
            System.out.println(item.getKey());
            System.out.println(item.getValue());
        }

    }


}
