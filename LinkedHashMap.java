import java.util.*;
class LinkedHashMap {
    public static void main(String args[]) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(5, "five");
        map.put(1, "one");
        map.put(2,"two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(7, "seven");
        map.put(9, "nine");
        map.put(10, "ten");
        map.put(6, "six");
        //System.out.println(map);
        //System.out.println(map.get(9));
        for(Map.Entry<Integer,String> m:map.entrySet()){
            //System.out.println(m.getKey()+" "+m.getValue());
            String value=m.getValue();
            if(value.equals("seven")) {
                Object key = m.getKey();
                System.out.println(key);
                break;
            }
        }
    }

}