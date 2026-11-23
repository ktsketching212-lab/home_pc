import java.util.ArrayList;

public class W2A5Padecio {
	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<>();
		
		// Add initial items
		fruits.add("Mango");
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Grapes");
		
		// 1. get() - access an item
		System.out.println("First Fruit(): " + fruits.get(0));
		
		// 2. set() = update an item
		System.out.println("After Set(): " + fruits);
		
		// 3. Contains() - Check if an item exist
		System.out.println("Contains Banana?" + fruits.contains("Banana"));
		
		// 4. IndexOF()	- find the position of an item
		System.out.println("Index of Grapes: " + fruits.indexOf("Grapes"));
		
		// 5. 5. Remove an item using its index
		fruits.remove(2);
		System.out.println("After remove():" + fruits);
		
		// 6. size() - get the number of items
		System.out.println("Number of fruits: " + fruits.size());
		
		// 7. isEmpty()	- check if the list is empty
		System.out.println("Is the list empty? " + fruits.isEmpty());
		
		// 8. clear()	- remove all items
		fruits.clear();
		System.out.println("After clear():	" + fruits);
		System.out.println("Is the list empty now? " + fruits.isEmpty());
	}

}
