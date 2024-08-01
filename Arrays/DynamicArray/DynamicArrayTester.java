package Arrays.DynamicArray;

// DynamicArrayTester.java
public class DynamicArrayTester {
    public static void main(String[] args) {
        // Create a DynamicArray with an initial capacity of 5
        DynamicArray<Integer> array = new DynamicArray<>();

        // Test adding elements
        System.out.println("Adding elements:");
        for (int i = 0; i < 10; i++) {
            array.add(i);
            System.out.println("Added " + i + ", Size: " + array.size());
        }

        // Test getting elements
        System.out.println("\nGetting elements:");
        for (int i = 0; i < array.size(); i++) {
            System.out.println("Element at index " + i + ": " + array.get(i));
        }

        // Test setting elements
        System.out.println("\nSetting elements:");
        array.set(5, 99);
        System.out.println("Set index 5 to 99");
        for (int i = 0; i < array.size(); i++) {
            System.out.println("Element at index " + i + ": " + array.get(i));
        }

        // Test inserting elements
        System.out.println("\nInserting elements:");
        array.insert(3, 50);
        System.out.println("Inserted 50 at index 3");
        for (int i = 0; i < array.size(); i++) {
            System.out.println("Element at index " + i + ": " + array.get(i));
        }

        // Test removing elements
        System.out.println("\nRemoving elements:");
        array.remove(3);
        System.out.println("Removed element at index 3");
        for (int i = 0; i < array.size(); i++) {
            System.out.println("Element at index " + i + ": " + array.get(i));
        }

        // Test size and isEmpty
        System.out.println("\nTesting size and isEmpty:");
        System.out.println("Size: " + array.size());
        System.out.println("Is array empty? " + array.isEmpty());

        // Test clearing the array
        System.out.println("\nClearing the array:");
        array.clear();
        System.out.println("Array cleared. Size: " + array.size());
        System.out.println("Is array empty? " + array.isEmpty());

        // Test resizing by adding elements beyond the initial capacity
        System.out.println("\nAdding elements beyond initial capacity:");
        for (int i = 0; i < 15; i++) {
            array.add(i);
            System.out.println("Added " + i + ", Size: " + array.size());
        }
    }
}
