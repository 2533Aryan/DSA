package Arrays;

public class SimpleArray<T> implements SimpleArrayInterface<T> {

    private int size;
    private T[] array;

    
    public SimpleArray(int capacity){
        array = (T[]) new Object[capacity];
        size = 0;
    }


    // Add an element to the array
    @Override
    public void add(T element) {
        if (size == array.length){
            throw new ArrayIndexOutOfBoundsException("Arrat is full");
        }

        array[size++] = element;
    }


    // Get an element at a specific index
    @Override
    public T get(int index) {
        if(index < 0 && index >= size){
            throw new ArrayIndexOutOfBoundsException("Out of Bound");
        }

        return array[index];
    }


    // Set an element at a specific index
    @Override
    public void set(int index, T element) {
        if(index < 0 && index >= size){
            throw new ArrayIndexOutOfBoundsException("Out of Bound");
        }

        array[index] = element;
    }


    // Remove an element at a specific index
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