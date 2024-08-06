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

### 2. What is `Arrays.copyOf`?

- **`Arrays.copyOf`**: A utility method in Java that creates a new array by copying the original array's contents up to a specified length.
- **Usage in `resize` Method**:
  ```java
  private void resize() {
      capacity = capacity * 2;
      array = Arrays.copyOf(array, capacity);
  }
  ```
  - It doubles the capacity and creates a new array with the new capacity, copying all elements from the old array into the new one.

### 3. What is the `final` Keyword and Other Keywords?

- **`final` Keyword**:
  - **Variables**: Prevents reassignment. Once assigned a value, it cannot be changed.
  - **Methods**: Prevents overriding. The method cannot be overridden in subclasses.
  - **Classes**: Prevents inheritance. The class cannot be subclassed.

- **Other Keywords**:
  - **`static`**: Belongs to the class rather than instances of the class.
  - **`abstract`**: Declares a method without an implementation (to be implemented in subclasses) or a class that cannot be instantiated.
  - **`synchronized`**: Ensures that a method or block of code is accessed by only one thread at a time.
  - **`volatile`**: Indicates that a variable's value will be modified by different threads.

### 4. What is the `static` Keyword and Other Keywords?

- **`static` Keyword**:
  - **Variables**: Shared among all instances of the class.
  - **Methods**: Can be called without creating an instance of the class.
  - **Blocks**: Static initialization blocks are used to initialize static variables.

- **Other Keywords**:
  - **`final`**: See above.
  - **`abstract`**: See above.
  - **`synchronized`**: See above.
  - **`volatile`**: See above.

### 5. Why Use `final static` on `INT_CAPACITY` Instead of `int capacity`?

- **`final static`**:
  - `final`: Ensures the initial capacity value cannot be changed after it's set.
  - `static`: Ensures the initial capacity is a class-level constant, not instance-specific.

- **`int capacity`**: 
  - An instance variable that can be changed.
  - Does not represent a constant value.

### 6. What is `System.arraycopy`?

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

### 7. Why Use `>` in Insert Method If Statement Instead of `>=` Like in Get and Set Methods?

- **Insert Method**:
  - **Condition**: `if (index > size)`
  - **Reason**: Ensures the index for insertion is within the valid range (0 to `size`). Inserting at `size` means adding an element at the end, which is valid.

- **Get and Set Methods**:
  - **Condition**: `if (index >= size)`
  - **Reason**: Ensures the index is within the range of existing elements (0 to `size - 1`). Accessing `size` would be out of bounds as it's the next available position.

### Summary

- **`array.length`**: Capacity of the array.
- **`size`**: Number of elements currently in the array.
- **`INT_CAPACITY`**: Initial capacity, typically a constant.
- **`Arrays.copyOf`**: Creates a new array with copied elements.
- **`final` and `static` Keywords**: Used for constants and class-level variables.
- **`System.arraycopy`**: Efficient method to copy array elements.
- **Insert Method Index Check**: Ensures valid insertion point, considering valid range.



