package Arrays;

// SimpleArrayInterface.java
public interface SimpleArrayInterface<T> {
    void add(T element);        // Add an element to the array
    T get(int index);          // Get an element at a specific index
    void set(int index, T element);  // Set an element at a specific index
    void remove(int index);    // Remove an element at a specific index
    int size();                // Get the number of elements in the array
    boolean isEmpty();         // Check if the array is empty
}
