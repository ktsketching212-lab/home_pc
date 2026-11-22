import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CHATGPTHELPER {
    public static void main(String[] args) {

        // ==========================================
        // 1. INITIALIZATION (Creating an ArrayList)
        // ==========================================
        // Standard empty list (Note: Must use Wrapper classes like Integer, Double, Boolean—not int/double)
        ArrayList<String> fruits = new ArrayList<>();

        // Shortcut: Initialize with values right away
        ArrayList<String> extraFruits = new ArrayList<>(Arrays.asList("Pineapple", "Watermelon"));


        // ==========================================
        // 2. CREATE / ADD ITEMS
        // ==========================================
        fruits.add("Mango");          // Index 0 (adds to the end)
        fruits.add("Apple");          // Index 1
        fruits.add("Banana");         // Index 2
        fruits.add("Grapes");         // Index 3
        
        // Insert at a specific index (shifts existing items to the right)
        fruits.add(1, "Orange");      // Inserts "Orange" at Index 1
        
        // Add all items from another list
        fruits.addAll(extraFruits);   
        System.out.println("Current List: " + fruits);


        // ==========================================
        // 3. READ / ACCESS ITEMS
        // ==========================================
        String first = fruits.get(0);                    // Gets item at index 0 ("Mango")
        String last = fruits.get(fruits.size() - 1);     // Pro-tip: Always gets the LAST item
        System.out.println("First: " + first + " | Last: " + last);


        // ==========================================
        // 4. UPDATE ITEMS
        // ==========================================
        // set(index, newValue) -> Replaces the item at that index
        fruits.set(1, "Strawberry");  // Replaces "Orange" with "Strawberry"
        System.out.println("After set(1): " + fruits);


        // ==========================================
        // 5. SEARCH / CHECK ITEMS
        // ==========================================
        boolean hasBanana = fruits.contains("Banana");   // true (Case-sensitive!)
        int grapeIndex = fruits.indexOf("Grapes");       // Returns index (or -1 if NOT found)
        int lastIndex = fruits.lastIndexOf("Apple");     // Useful if there are duplicate items
        System.out.println("Has Banana? " + hasBanana + " | Grapes at index: " + grapeIndex);


        // ==========================================
        // 6. SORTING & MANIPULATION (Collections)
        // ==========================================
        Collections.sort(fruits);                        // Sorts A-Z (or smallest to largest)
        System.out.println("Sorted A-Z: " + fruits);

        Collections.reverse(fruits);                     // Reverses current order (Z-A if sorted)
        System.out.println("Reversed: " + fruits);


        // ==========================================
        // 7. LOOPING (3 Ways to Iterate)
        // ==========================================
        System.out.println("\n--- Looping ---");
        
        // Way A: Enhanced For-Loop (Best when you just need the values)
        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }
        System.out.println();

        // Way B: Standard For-Loop (Best when you need the index number)
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println("Index " + i + ": " + fruits.get(i));
        }


        // ==========================================
        // 8. REMOVE / DELETE ITEMS
        // ==========================================
        fruits.remove(2);             // Removes by INDEX (Caution: shifts remaining items left!)
        fruits.remove("Banana");      // Removes by VALUE (first matching occurrence)
        System.out.println("\nAfter removals: " + fruits);


        // ==========================================
        // 9. SIZE & CLEANUP
        // ==========================================
        int count = fruits.size();                       // Total number of items
        boolean empty = fruits.isEmpty();                // true if size == 0
        System.out.println("Count: " + count + " | Is empty? " + empty);

        fruits.clear();                                  // Wipes everything out
        System.out.println("After clear(), is empty? " + fruits.isEmpty());
    }
}