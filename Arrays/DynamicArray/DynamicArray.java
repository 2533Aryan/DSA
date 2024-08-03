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
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Out of Bound");
        }

        array[index] = element;
    }


    @Override
    public void remove(int index) {
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Out of Bound");
        }

        for(int i = index; i < (size-1); i--){
            array[i] = array[i+1];
        }

        array[size--] = null;
    }


    @Override
    public int size() {
        return size;
    }


    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    
    @Override
    public void clear() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'clear'");
    }

    private void resize(){
        
    }
        
}
