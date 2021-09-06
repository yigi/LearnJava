## List.of and Arrays.asList

Arrays.asList returns a mutable list while the list returned by List.of is immutable:

```java
List<Integer> list = Arrays.asList(1, 2, null);
list.set(1, 10); // OK

List<Integer> list = List.of(1, 2, 3);
list.set(1, 10); // Fails with UnsupportedOperationException
```

Arrays.asList allows null elements while List.of doesn't:

```java
List<Integer> list = Arrays.asList(1, 2, null); // OK
List<Integer> list = List.of(1, 2, null); // Fails with NullPointerException
```

contains behaves differently with nulls:

```java
List<Integer> list = Arrays.asList(1, 2, 3);
list.contains(null); // Returns false

List<Integer> list = List.of(1, 2, 3);
list.contains(null); // Fails with NullPointerException
```

Arrays.asList returns a view of the passed array, so the changes to the array will be reflected in the list too. For List.of this is not true:

```java
Integer[] array = {1,2,3};
List<Integer> list = Arrays.asList(array);
array[1] = 10;
System.out.println(list); // Prints [1, 10, 3]

Integer[] array = {1,2,3};
List<Integer> list = List.of(array);
array[1] = 10;
System.out.println(list); // Prints [1, 2, 3]
```