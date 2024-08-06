package Strings;

public interface StringInterface {
    
    void initialize(String initialString);  // Initialize the string with an initial value
    int length();   // Returns the length of the string

    // Returns the character at the given index
    char charAt(int index);

    // Sets the character at the given index
    void setCharAt(int index, char value);

    // Returns the string representation
    String toString();

    // Appends a character to the end of the string
    void append(char c);

    // Inserts a character at the given index
    void insert(int index, char c);

    // Deletes the character at the given index
    void delete(int index);

    // Returns a substring from start to end index
    String substring(int start, int end);

    // Finds the first occurrence of the substring
    int find(String substring);

    // Replaces all occurrences of old substring with new substring
    void replace(String oldSubstring, String newSubstring);

    // Splits the string by the given delimiter
    String[] split(String delimiter);

    // Joins elements of an iterable with the string as the delimiter
    String join(String[] elements);
}
