Immutable objects are simply objects whose state (the object's data) cannot change after construction. Examples of immutable objects from the JDK include String and Integer.
Immutable objects greatly simplify your program, since they:

- are simple to construct, test, and use
- are automatically thread-safe and have no synchronization issues
- don't need a copy constructor
- don't need an implementation of clone
- allow hashCode to use lazy initialization, and to cache its return value
- don't need to be copied defensively when used as a field
- make good Map keys and Set elements (these objects must not change state while in the collection)
- have their class invariant established once upon construction, and it never needs to be checked again
- always have "failure atomicity" (a term used by Joshua Bloch): if an immutable object throws an exception, it's never left in an undesirable or indeterminate state

Immutable objects have a very compelling list of positive qualities. Without question, they are among the simplest and most robust kinds of classes you can possibly build. When you create immutable classes, entire categories of problems simply disappear.

Make a class immutable by following these guidelines:

- ensure the class cannot be overridden - make the class final, or use static factories and keep constructors private
- make fields private and final
- force callers to construct an object completely in a single step, instead of using a no-argument constructor combined with subsequent calls to setXXX methods (that is, avoid the Java Beans convention)
- do not provide any methods which can change the state of the object in any way - not just setXXX methods, but any method which can change state
- if the class has any mutable object fields, then they must be defensively copied when they pass between the class and its caller