### List
List<Integer> l = ...
for (Integer i : l)
    System.out.println(i);

### Iterator
Iterator<Integer> i = ...
while(i.hasNext())
    System.out.println(i.next());

### Stream
Stream<Integer> s = ...
s.forEach(System.out::println);


### Convert collection to stream
Employee[] e = ...
Stream<Employee> s = Stream.of(e);

Streams from lists are ordered
Sterams from sets are unordered