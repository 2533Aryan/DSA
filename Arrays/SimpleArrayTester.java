package Arrays;

// SimpleArrayTester.java
public class SimpleArrayTester {
    public static void main(String[] args) {
        // Create a SimpleArray with a capacity of 10
        SimpleArray<Integer> array = new SimpleArray<>(10);

        // Test adding elements
        System.out.println("Adding elements:");
        for (int i = 0; i < 5; i++) {
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
        array.set(2, 99);
        System.out.println("Set index 2 to 99");
        for (int i = 0; i < array.size(); i++) {
            System.out.println("Element at index " + i + ": " + array.get(i));
        }

        // Test removing elements
        System.out.println("\nRemoving elements:");
        array.remove(2);
        System.out.println("Removed element at index 2");
        for (int i = 0; i < array.size(); i++) {
            System.out.println("Element at index " + i + ": " + array.get(i));
        }

        // Test size and isEmpty
        System.out.println("\nTesting size and isEmpty:");
        System.out.println("Size: " + array.size());
        System.out.println("Is array empty? " + array.isEmpty());

        // Test clearing the array
        System.out.println("\nClearing the array:");
        while (!array.isEmpty()) {
            array.remove(0);
        }
        System.out.println("Array cleared. Size: " + array.size());
        System.out.println("Is array empty? " + array.isEmpty());

        // Attempt to add elements beyond capacity to test error handling
        System.out.println("\nAdding elements beyond capacity:");
        try {
            for (int i = 0; i < 11; i++) {
                array.add(i);
                System.out.println("Added " + i + ", Size: " + array.size());
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}