package jinho.meetup._01_refactoring._02_change;

public class ListClass {
    private Object[] elements = new Object[10];
    private boolean readOnly;
    private int size = 0;

    public void add(Object element) {
        if (!readOnly) {
            int newSize = size + 1;

            if (newSize > elements.length) {
                Object[] newElements = new Object[elements.length + 10];
                for (int i = 0; i < size; i++) {
                    newElements[i] = elements[i];
                }

                elements = newElements;
            }

            elements[size] = element;
            size++;
        }
    }

    public int size() {
        return size;
    }

    public Object get(int index) {
        return elements[index];
    }

}
