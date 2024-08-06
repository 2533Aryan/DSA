package Strings;

public interface StringInterface {
    
    void initialize(String initialString); // Initialize the string with an initial value
    int length(); // Returns the length of the string
    char charAt(int index); // Returns the character at the given index
    void setCharAt(int index, char value); // Sets the character at the given index
    String toString(); // Returns the string representation
    void append(char c); // Appends a character to the end of the string
    void insert(int index, char c); // Inserts a character at the given index
    void delete(int index); // Deletes the character at the given index
    String substring(int start, int end); // Returns a substring from start to end index
    int find(String substring); // Finds the first occurrence of the substring
    void replace(String oldSubstring, String newSubstring); // Replaces all occurrences of old substring with new substring
    String[] split(String delimiter); // Splits the string by the given delimiter
    String join(String[] elements); // Joins elements of an iterable with the string as the delimiter
}

