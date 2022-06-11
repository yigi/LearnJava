Optional<Object> empty = Optional.empty();
print empty.isPresent() // false
print empty.isEmpty() // true

Optional<String> empty = Optional.of("Hello");
print empty.isPresent() // true
print empty.isEmpty() // false

Optional<String> o = Optional.ofNullable(null);
String s = o.orElse("hello"); //returns value when optional has no value in it
print s // hello


Optional<Integer> numExists = Optional.of(5);
Optional<Integer> numDoesNotExists = Optional.empty();

if(numExists.isPresent) 
    print numExists.get() // 5
if(numDoesNotExists.isPresent)
    print numDoesNotExists.get() // 


String name = Optional.<String>ofNullable(null).orElse("Other"); //other
Chaining can cause "Object cannot be converted to Optional" error