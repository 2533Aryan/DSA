### 1. Core Differences Between `array.length`, `size`, and `INT_CAPACITY`

- **`array.length`**:
  - Represents the total capacity of the underlying array.
  - It's the maximum number of elements the array can hold before needing to resize.
  - Usage: Check if the array is full or when resizing the array.

- **`size`**:
  - Represents the current number of elements stored in the array.
  - It's how many elements are actually in the array at any given time.
  - Usage: Looping through elements, adding elements, removing elements, etc.

- **`INT_CAPACITY`**:
  - Represents the initial capacity of the dynamic array when it is first created.
  - Typically defined as a constant.
  - Usage: Set the starting size of the underlying array.

**Where not to use them**:
- **`array.length`**: Do not use it to get the number of elements currently stored (use `size` instead).
- **`size`**: Do not use it to refer to the total capacity of the array (use `array.length` instead).
- **`INT_CAPACITY`**: Do not use it dynamically after array creation; it's a fixed initial value.


### 2. Keywords

- **`final` Keyword**:
  - **Variable**: Prevents reassignment after initial assignment.
  - **Method**: Prevents overriding in subclasses.
  - **Class**: Prevents inheritance.

- **`static` Keyword**:
  - **Variable**: Belongs to the class, shared among all instances.
  - **Method**: Can be called without creating an instance of the class.
  - **Block**: Executes once when the class is loaded.

- **`abstract` Keyword**:
  - **Method**: Declares a method without an implementation (to be implemented in subclasses).
  - **Class**: Cannot be instantiated, used as a base class.

- **`synchronized` Keyword**:
  - Ensures that a method or block is accessed by only one thread at a time, useful in concurrent programming.

- **`volatile` Keyword**:
  - Indicates that a variable's value will be modified by different threads, ensuring visibility of changes across threads.


### 3. Why Use `final static` on `INT_CAPACITY` Instead of `int capacity`?

- **`final static`**:
  - `final`: Ensures the initial capacity value cannot be changed after it's set.
  - `static`: Ensures the initial capacity is a class-level constant, not instance-specific.

- **`int capacity`**: 
  - An instance variable that can be changed.
  - Does not represent a constant value.


### 4. What is `Arrays.copyOf`?

- **`Arrays.copyOf`**: A utility method in Java that creates a new array by copying the original array's contents up to a specified length.
- **Usage in `resize` Method**:
  ```java
  private void resize() {
      capacity = capacity * 2;
      array = Arrays.copyOf(array, capacity);
  }
  ```
  - It doubles the capacity and creates a new array with the new capacity, copying all elements from the old array into the new one.


### 5. What is `System.arraycopy`?

- **`System.arraycopy`**: A native method that copies elements from one array to another more efficiently than a manual loop.
  - **Syntax**:
    ```java
    System.arraycopy(sourceArray, sourcePos, destArray, destPos, length);
    ```
  - **Usage in `remove` Method**:
    ```java
    System.arraycopy(array, index + 1, array, index, size - index - 1);
    array[--size] = null; // clear last element
    ```
    - More efficient than a loop for shifting elements, as it is optimized at a lower level.
  
- **Why not use a loop?**
  - A loop can be less efficient, especially for large arrays. `System.arraycopy` is optimized and faster.


### 6. Syntax for `Arrays.copyOf` and Related Methods

- **Syntax**:
  ```java
  T[] newArray = Arrays.copyOf(array, newCapacity);
  ```
  - **Parameters**:
    - `array`: The original array.
    - `newCapacity`: The length of the new array.

- **Import Statement**:
  ```java
  import java.util.Arrays;
  ```

- **Other Useful Methods in `Arrays` Class**:
  - **`Arrays.sort(array)`**: Sorts the array.
  - **`Arrays.fill(array, value)`**: Fills the array with a specified value.
  - **`Arrays.equals(array1, array2)`**: Compares two arrays for equality.
  - **`Arrays.toString(array)`**: Returns a string representation of the array.


### 7. Why Use `>` in Insert Method If Statement Instead of `>=` Like in Get and Set Methods?

- **Insert Method**:
  - **Condition**: `if (index > size)`
  - **Reason**: Ensures the index for insertion is within the valid range (0 to `size`). Inserting at `size` means adding an element at the end, which is valid.

- **Get and Set Methods**:
  - **Condition**: `if (index >= size)`
  - **Reason**: Ensures the index is within the range of existing elements (0 to `size - 1`). Accessing `size` would be out of bounds as it's the next available position.


### 8. Your Resize Method

Your resize method manually copies elements from the old array to the new array. Here's a more concise version using `Arrays.copyOf`:

```java
private void resize() {
    array = Arrays.copyOf(array, array.length * 2);
}
```

This method is functionally equivalent to your implementation but is simpler and utilizes the built-in `Arrays.copyOf` method for clarity and efficiency.


