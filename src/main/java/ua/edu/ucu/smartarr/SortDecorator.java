package ua.edu.ucu.smartarr;

import lombok.Getter;
import lombok.Setter;
import ua.edu.ucu.functions.MyComparator;

import java.util.Arrays;

// Sorts elements using MyComparator to compare them
public class SortDecorator extends SmartArrayDecorator {
    @Setter @Getter
    private MyComparator cmp;

    public SortDecorator(SmartArray arr, MyComparator cmp) {
        super(arr);
        setCmp(cmp);
        sort();
    }

    public Object[] sort(Object[] arr) {
        Object[] sorted = arr.clone();
        Arrays.sort(sorted, cmp);
        return sorted;
    }

    public void sort() {
        setData(sort(smartArray.toArray()));
    }

    public String operationDescription() {
        return "Sort";
    }
    
}
