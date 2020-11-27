package ua.edu.ucu.smartarr;

// Base array for decorators
public class BaseArray implements SmartArray {
    private Object[] data;
    private int size;

    public BaseArray(Object[] objects) {
        setData(objects);
    }

    public Object[] toArray() {
        return data.clone();
    }

    public String operationDescription() {
        return null;
    }

    public int size() {
        return size;
    }

    public void setData(Object[] objects) {
        data = objects.clone();
        size = objects.length;

    }

}
