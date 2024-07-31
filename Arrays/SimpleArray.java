package Arrays;

public class SimpleArray<T> implements SimpleArrayInterface<T> {

    private int size;
    private T[] array;

    
    public SimpleArray(int capacity){
        array = (T[]) new Object[capacity];
        size = 0;
    }


    @Override
    public void add(T element) {
        if (size == array.length){
            throw new ArrayIndexOutOfBoundsException("Arrat is full");
        }

        array[size++] = element;
    }


    @Override
    public T get(int index) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }

    @Override
    public void set(int index, T element) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'set'");
    }

    @Override
    public void remove(int index) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'size'");
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isEmpty'");
    }
    

}