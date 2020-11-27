package ua.edu.ucu.smartarr;


import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;


// Remove duplicates from SmartArray. Use method equals() to compare objects
public class DistinctDecorator extends SmartArrayDecorator {

    public DistinctDecorator(SmartArray arr) {
        super(arr);
        set();
    }

    public Object[] set(Object[] arr) {
        LinkedList<Object> set = new LinkedList<>();
        for (Object obj: arr) {
            if (!set.contains(obj)) {
                set.add(obj);
            }
        }
        return set.toArray();
    }

    public void set() {
        setData(set(smartArray.toArray()));
    }

    public String operationDescription() {
        return "Set";
    }

}
