Most programmers prefer the Java Collections Framework to arrays, Vector, and Hashtable, for the following reasons:
- the intent of the Collections Framework is to replace the older, less comprehensive tools
- synchronization can be easily controlled (while Hashtable and Vector are always synchronized)
- immutability can be easily controlled
- search and sort algorithms are ready-made
- the type of a reference to a Collection can be generic, while underlying implementation can be easily changed
- arrays are of fixed size, and are more error prone - off-by-one errors with array indexes have always been a fruitful source of error
- Arrays.asList may be used to pass an array to a method expecting a Collection or a List
- Collection.toArray may be used to convert a Collection to an Object[] or a T[]
- Collections.enumeration and Collections.list may be used to convert between enumerations and collections

```java
import java.util.*;

public final class ArrayInit {

  /** Initialize arrays and Lists.  */
  public static void main(String... args){
    //Array initializers are compact
    String[] paintings = {"oil", "watercolour"};

    //Build a List using Arrays.asList(T...)
    //This works for any type, not just for String
    List<String> languages = Arrays.asList(
      "urdu", "hindi", "pali", "sanskrit"
    );
    
    //Build a List in a more verbose way 
    List<String> nicePlaces = new ArrayList<>();
    nicePlaces.add("luxembourg gardens");
    nicePlaces.add("sea side");
    nicePlaces.add("large magellanic cloud");
    
    //this is compact, but the returned list is not modifiable
    List<Integer> years = List.of(1915, 1925, 1957);
    //years.add(1984); //fails
  }
} 
```