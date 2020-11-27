package ua.edu.ucu.smartarr;

import lombok.Getter;
import lombok.Setter;
import ua.edu.ucu.functions.MyFunction;

// Map every element to another object using MyFunction
public class MapDecorator extends SmartArrayDecorator {
    @Setter @Getter
    private MyFunction func;


    public MapDecorator(SmartArray arr, MyFunction func) {
        super(arr);
        setFunc(func);
        map();
    }

    public Object[] map(Object[] arr) {
        Object[] mapped = arr.clone();
        for (int i = 0; i < arr.length; i++) {
            mapped[i] = func.apply(mapped[i]);
        }
        return mapped;
    }

    public void map() {
        setData(map(smartArray.toArray()));
    }

    public String operationDescription() {
        return "Map";
    }

}
