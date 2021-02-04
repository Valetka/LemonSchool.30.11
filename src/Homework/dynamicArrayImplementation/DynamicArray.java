package homework.dynamicArrayImplementation;


import java.util.Collection;
import java.util.Iterator;


public class DynamicArray implements Collection {

    private Object [] array;
    private int size;
    private int initialCapacity = 10;

    public DynamicArray(){
        this.array = new Object[initialCapacity];
    }

    public DynamicArray(int userInitialCapacity){
        if (userInitialCapacity >= 0){
            this.array = new Object[userInitialCapacity];
        }
        else {
            throw new IllegalStateException("Capacity can't be less than 0!");
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return (size == 0);
    }

    @Override
    public boolean contains(Object o) {
        for(Object i: array) {
            if (i.equals(o))
               return true;
            break;
        }
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }
    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        if (size == array.length){
            array = increaseCapacity();
        }
        array[size] = o;
        size++;
        return true;
    }

    private Object[] increaseCapacity() {
        Object [] temp = new Object[(array.length * 2)];
        System.arraycopy(array, 0, temp, 0, array.length);
        return temp;
    }
    public Object set(Object value, int index){
        isIndexExist(index);
        Object temp = array[index];
        array[index] = value;
        return temp;
    }

    private int isIndexExist(int index){
        if (index >= size || index < 0){
            throw new IndexOutOfBoundsException("Element can't be found! "
                    + "Number of elements in array = " + size
                    + ". Total size of array = " + array.length);
        }
        return index;
    }

    public Object remove (int index){
        isIndexExist(index);
        Object [] temp = array;
        array = new Object[temp.length-1];
        Object value = temp[index];
        System.arraycopy(temp, 0, array, 0, index);
        System.arraycopy(temp, index + 1, array, index, temp.length - index - 1);
        size--;
        return value;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

}
