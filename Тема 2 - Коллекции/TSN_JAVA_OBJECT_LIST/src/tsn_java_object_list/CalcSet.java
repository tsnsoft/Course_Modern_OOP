package tsn_java_object_list;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CalcSet {

    private final Set<String> data = new HashSet<>();

    public Set<String> getData() {
        return data;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        Iterator<String> i = data.iterator();
        while (i.hasNext()) {
            s.append(i.next()).append("\n");
        }
        return s.toString();
    }
}
