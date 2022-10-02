import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
public class TestLink {
    public static void main(String[] args) {
        LinkedHashSet<Integer> set = new LinkedHashSet();
        set.add(20);
        set.add(55);
        set.add(10);
        set.add(null);
        set.add(60);
        set.add(20);
        set.add(null);
        set.add(1);

        System.out.println(set);
    }
}