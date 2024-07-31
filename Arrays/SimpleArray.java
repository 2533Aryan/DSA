package Arrays;

public class SimpleArray<T> implements SimpleArrayInterface<T> {

    private int size;
    private T[] array;

    
    @SuppressWarnings("unchecked")
    public SimpleArray(int capacity){
        array = (T[]) new Object[capacity];
        size = 0;
    }


    // Add an element to the array
    @Override
    public void add(T element) {
        if (size == array.length){
            throw new ArrayIndexOutOfBoundsException("Array is full");
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
        if(index < 0 && index >= size){
            throw new ArrayIndexOutOfBoundsException("Out of Bound");
        }

        for(int i = index; i < size-1; i++){
            array[i] = array[i+1];
        }

        array[--size] = null;  // remove last element
    }


    // Get the number of elements in the array
    @Override
    public int size() {
        return size;
    }


    // Check if the array is empty
    @Override
    public boolean isEmpty() {
        return size == 0;
    }
}