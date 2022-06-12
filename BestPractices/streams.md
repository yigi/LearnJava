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

List<Person> females = people.stream()
    .filter(person -> person.getGender().equals(Gender.FEMALE))
    .collect(Collectors.toList())

List<Person> females = people.stream()
    .map(person -> person.setGender(Gender.MALE))
    .collect(Collectors.toList())

Optional<Product> result = productRepo.findAll() //find min price
    .stream()
    .filter(p -> p.getCategory().equalsIgnoreCase("Books"))
    .min(Comparator.comparing(Product::getPrice));

List<Order> result = orderRepo.findAll() //stream in stream to match category 
        .stream()
        .filter(o -> 
          o.getProducts()
          .stream()
          .anyMatch(p -> p.getCategory().equalsIgnoreCase("Baby"))
        )
        .collect(Collectors.toList());  

