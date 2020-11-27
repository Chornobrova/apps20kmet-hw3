package ua.edu.ucu.smartarr;


import lombok.Getter;
import lombok.Setter;
import ua.edu.ucu.functions.MyPredicate;

import java.util.LinkedList;

// Tests every element and removes
// it if it doesn't satisfy MyPredicate
public class FilterDecorator extends SmartArrayDecorator {
    @Getter @Setter
    private MyPredicate pred;

    public FilterDecorator(SmartArray arr, MyPredicate pred) {
        super(arr);
        setPred(pred);
        filter();
    }

    public Object[] filter(Object[] arr) {
        LinkedList<Object> filtered = new LinkedList<>();
        for (Object object: arr) {
            if (pred.test(object)) {
                filtered.add(object);
            }
        }
        return filtered.toArray();
    }

    public void filter() {
        setData(filter(smartArray.toArray()));
    }

    public String operationDescription() {
        return "Filter";
    }

}
