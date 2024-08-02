## Array - Data Structure

### Definition
- **Array:** A collection of elements, each identified by an array index or key, stored in contiguous memory locations.

### Types of Arrays
1. **One-dimensional array:** A linear sequence of elements.
   - Syntax: `int[] arr = new int[5];`
2. **Multi-dimensional array:** Arrays of arrays, like matrices.
   - Syntax: `int[][] matrix = new int[3][4];`

### Characteristics
- **Fixed Size:** The size of the array is determined at the time of creation and cannot be changed.
- **Contiguous Memory Allocation:** Elements are stored in continuous memory locations.
- **Indexing:** Access to elements is done using indices (zero-based index).

### Common Operations
1. **Accessing Elements:**
   - `element = array[index];`
   - Time Complexity: O(1)

2. **Modifying Elements:**
   - `array[index] = value;`
   - Time Complexity: O(1)

3. **Inserting Elements:**
   - At the end: `array[size++] = value;`
   - At a specific index: Shift elements to the right to make space.
   - Time Complexity: O(1) for end, O(n) for specific index

4. **Deleting Elements:**
   - From the end: `size--;`
   - From a specific index: Shift elements to the left to fill the gap.
   - Time Complexity: O(1) for end, O(n) for specific index

5. **Searching Elements:**
   - Linear Search: O(n)
   - Binary Search (only for sorted arrays): O(log n)

### Dynamic Arrays
- **Dynamic Array:** A resizable array that grows or shrinks as needed.
- Implemented using arrays, but automatically resize when the capacity is reached.
- Common in programming languages like Java (ArrayList), Python (list), and C++ (vector).

### Advantages
- **Direct Access:** Constant time access using index.
- **Cache Friendliness:** Due to contiguous memory allocation, arrays have better cache performance.

### Disadvantages
- **Fixed Size:** Cannot change size once created (for static arrays).
- **Costly Insertions/Deletions:** Shifting elements for insertions/deletions at specific indices can be time-consuming.
- **Wastage of Memory:** Predefined size may lead to unused allocated memory.

### Applications
- Used in implementing other data structures like stacks, queues, heaps, and hash tables.
- Useful in scenarios requiring constant-time access to elements, such as lookup tables and adjacency matrices.

### Interview Questions
1. **Reverse an Array:**
   - Problem: Reverse the elements of an array.
   - Approach: Swap elements from both ends moving towards the center.
   - Complexity: O(n)

2. **Find the Maximum Subarray Sum (Kadane's Algorithm):**
   - Problem: Find the contiguous subarray with the maximum sum.
   - Approach: Use a dynamic programming approach to keep track of the current subarray sum and the maximum sum found so far.
   - Complexity: O(n)

3. **Merge Sorted Arrays:**
   - Problem: Merge two sorted arrays into a single sorted array.
   - Approach: Use two pointers to merge the arrays.
   - Complexity: O(n + m), where n and m are the sizes of the arrays.

### Key Points to Remember
- Arrays provide O(1) access time but O(n) time for insertion and deletion (except at the end).
- Dynamic arrays automatically resize to accommodate new elements, providing the flexibility of size but with a potential cost of resizing (usually O(n) time for resizing).
- Understanding array manipulation techniques and their time complexities is crucial for solving various algorithmic problems in interviews.


