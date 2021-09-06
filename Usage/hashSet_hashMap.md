### Set “Interface”

A Java Set interface represents a group of elements arranged like an array.
- It does not allow duplicate elements.
- When we try to pass the same element that is already available in the Set, then it will not store into the Set.
- It is used to model the mathematical set abstraction.
- You can use it when you want data/Elements with unique items

### HashSet “Class”
A Java HashSet class represents a set of elements (objects).
- It does not guarantee the order of elements.
- It is achieved by storing elements as keys with the same value always.
- It constructs a collection that uses a hash table for storing elements.
- It contains unique elements.
- It inherits the AbstractSet class.
- It also implements the Set interface.
- It uses a technique to store elements is called hashing.
- HashSet uses HashMap internally in Java.
- [Important Iterator] HashSet does not have any method to retrieve the object from the HashSet. There is only a way to get objects from the HashSet via Iterator.
- HashSet has default initial capacity = 16.
- The capacity may increase automatically when more elements to be store.

```java
HashSet<String> hs = new HashSet<>();
```
If you write syntax as below, then you can’t achieve polymorphism. Instantiation will be limited to MyClassA only. Similarly, you can compare for new HashSet<MyClassA>();

```java
List<MyClass> myList = new LinkedList<MyClassA>();
```

```java
		hs.add("Aabraa");
        hs.add("kaaa");
        hs.add("Daabra");
        Iterator it = hs.iterator(); //add an iterator to hs  
        while (it.hasNext()) //display elements by using iterator 
```


											HashSet 					HashMap 
Implements 									Set interface 				Map interface 
Duplicates									No 							Yes duplicates values are allowed but no duplicate key is allowed 
Dummy values 								Yes 						No
Objects required during an add operation	1							2
Speed										It is comparatively slower than HashMap	technique has been used here.
Null 										Have a single null value	Single null key and any number of null values
Insertion Method							Add()						Put()


### HashMap

- map.containsKey(key)
- map.containsValue(val)

What will happen if you try to store a key that is already present in HashMap?
- If you store an existing key in the HashMap, then it will override the old value with the new value, and put() will return the old value. There will not be any exception or error.

Find duplicate in map
```java
List<T> valuesList = map.values();
Set<T> valuesSet = new HashSet<T>(map.values);
```