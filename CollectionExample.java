import java.util.*;

public class CollectionExample {
    public static void main(String[] args) {
        // 1. Initialize and add (Basic Operations)
        Collection<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // 2. Bulk Operations
        Collection<String> tropical = new ArrayList<>();
        tropical.add("Mango");
        tropical.add("Pineapple");
        
        fruits.addAll(tropical); // Adds all from tropical to fruits
        
        // 3. Inspection Methods
        System.out.println("Size: " + fruits.size()); // Size: 5
        System.out.println("Contains Mango? " + fruits.contains("Mango")); // true
        System.out.println("Is Empty? " + fruits.isEmpty()); // false

        // 4. Removal Operations
        fruits.remove("Apple"); // Removes one element
        
        Collection<String> toRemove = Arrays.asList("Banana", "Cherry");
        fruits.removeAll(toRemove); // Removes both Banana and Cherry

        // 5. Retain (Intersection)
        // fruits currently has [Mango, Pineapple]
        Collection<String> set = new ArrayList<>();
        set.add("Mango");
        fruits.retainAll(set); // Keeps only "Mango", removes "Pineapple"

        // 6. Conversion & Iteration
        Object[] fruitArray = fruits.toArray(); // To Array
        
        // forEach (from Iterable)
        fruits.forEach(f -> System.out.println("Fruit: " + f));

        // 7. Clear
        fruits.clear();
        System.out.println("Size after clear: " + fruits.size()); // 0
    }
}
