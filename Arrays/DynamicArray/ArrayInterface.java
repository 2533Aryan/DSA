package Arrays.DynamicArray;

// ArrayInterface.java
public interface ArrayInterface<T> {
    void add(T element);               // Add an element to the end of the array
    void insert(int index, T element); // Insert an element at a specific index
    T get(int index);                 // Get an element at a specific index
    void set(int index, T element);   // Set an element at a specific index
    void remove(int index);           // Remove an element at a specific index
    int size();                       // Get the number of elements in the array
    boolean isEmpty();                // Check if the array is empty
    void clear();                     // Remove all elements from the array
}
