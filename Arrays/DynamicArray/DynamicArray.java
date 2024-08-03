package Arrays.DynamicArray;

public class DynamicArray<T> implements ArrayInterface<T> {
    
    private int size;
    private T[] array;
    private static final int CAPACITY = 10;


    @SuppressWarnings("unchecked")
    DynamicArray(){
        array = (T[]) new Object[CAPACITY];
        size = 0;
    }


    @Override
    public void add(T element) {
        if(size == array.length){
            resize();
        }

        array[size++] = element; 
    }


    @Override
    public void insert(int index, T element) {
        if (index < 0 || index > size){
            throw new IndexOutOfBoundsException("Out of Bound");
        }

        if (index > array.length){
            resize();
        }

        for(int i = size; i <= index; i--){
            array[i+1] = array[i];
        }

        array[index] = element;
        size++;
    }


    @Override
    public T get(int index) {
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Out of Bound");
        }

        return array[index];
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

    @Override
    public void clear() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'clear'");
    }

    private void resize(){
        
    }
        
}
