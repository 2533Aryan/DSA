### 1. Using the `this` Keyword
**What does `this` mean?**
- `this` is a reference to the current object, meaning the instance of the class in which the code is currently running.
- It is often used to refer to instance variables and methods of the current object, especially when there is a naming conflict between instance variables and parameters or local variables.

**Why haven't we used `this` here?**
- In the code provided, there were no naming conflicts that required the use of `this`.
- If the parameter names and instance variable names were the same, we would use `this` to differentiate them. For example:

  ```java
  private T[] array;
  private int size;
  
  public SimpleArray(int capacity) {
      this.array = (T[]) new Object[capacity];
      this.size = 0;
  }
  ```
- Here, `this.array` and `this.size` clearly indicate that we are referring to the instance variables.


### 2. Using `array.length` to Check if the Array is Full
**Why use `array.length`?**
- `array.length` gives the total capacity of the array (i.e., the maximum number of elements it can hold).
- When we check `if (size == array.length)`, we are comparing the current number of elements (`size`) to the total capacity (`array.length`) to determine if the array is full.

**How can we use `.length` if we don't have an array yet?**
- When we say "building an array from scratch," it means we are implementing custom methods for operations like adding, removing, etc.
- However, the underlying storage (the actual array) still uses Java's built-in array, which has a `length` property. 
- In the constructor, we create this underlying array: `array = (T[]) new Object[capacity];`.


### 3. Properties `size` and `array`
**What is `array`?**
- `array` is the underlying storage for our custom array data structure. It is a Java array that holds the elements of our custom array.
- Think of `array` as the container where we store the elements.
- `size` keeps track of how many elements are currently in this custom array.

**Intuition:**
- `array` (the container) has a fixed size (capacity), determined when we create it.
- `size` tells us how many elements are actually stored in the `array` at any given time.


### 4. Constructor: `array = (T[]) new Object[capacity];`
**Simpler Explanation and Intuition:**
- **Purpose:** To create the underlying storage (container) for our custom array.
- **`(T[]) new Object[capacity]`:**
  - `new Object[capacity]` creates a Java array of type `Object` with the specified capacity.
  - `(T[])` is a cast to convert this `Object` array to an array of the generic type `T`.
- **Why do we need this?**
  - Java doesn't allow direct creation of generic arrays (`new T[capacity]`), so we create an `Object` array and cast it to `T[]`.
- **Intuition:**
  - Imagine we want a box (array) that can hold a specific number of items (capacity).
  - Since Java won't let us create a box labeled generically (like `T`), we create a generic box (Object) and then label it (cast it) to `T`.

### Summary
- `this` keyword: Used to reference the current object’s instance variables and methods.
- `array.length`: Used to get the total capacity of the underlying array.
- `array`: The underlying storage container for elements.
- Constructor: Creates and initializes the underlying storage array with the given capacity.