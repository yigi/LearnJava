Although multithreading is a powerful feature, it comes at a price. In multithreaded environments, we need to write implementations in a thread-safe way. This means that different threads can access the same resources without exposing erroneous behavior or producing unpredictable results. This programming methodology is known as “thread-safety”.

```java
/*
 * Non Thread-Safe Class in Java
 */
public class Counter {
  
    private int count;
  
    /*
     * This method is not thread-safe because ++ is not an atomic operation
     */
    public int getCount(){
        return count++;
    }
}
```

The above example is not thread-safe because ++ (the increment operator) is not an atomic operation and can be broken down into reading, update, and write operations.If multiple thread call getCount() approximately same time each of these three operations may coincide or overlap with each other for example while thread 1 is updating value, thread 2 reads and still gets old value, which eventually let thread 2 override thread 1 increment and one count is lost because multiple threads called it concurrently.


1) Use the synchronized keyword in Java and lock the getCount() method so that only one thread can execute it at a time which removes the possibility of coinciding or interleaving.

2) use Atomic Integer, which makes this ++ operation atomic and since atomic operations are thread-safe and saves the cost of external synchronization.

```java
/*
 * Thread-Safe Example in Java
 */
public class Counter {
  
    private int count;
    AtomicInteger atomicCount = new AtomicInteger( 0 );

  
    /*
     * This method thread-safe now because of locking and synchornization
     */
    public synchronized int getCount(){
        return count++;
    }
  
    /*
     * This method is thread-safe because count is incremented atomically
     */
    public int getCountAtomically(){
        return atomicCount.incrementAndGet();
    }
}
```

1) Immutable objects are by default thread-safe because their state can not be modified once created. Since String is immutable in Java, it's inherently thread-safe.

2) Read-only or final variables in Java are also thread-safe in Java.

3) Locking is one way of achieving thread-safety in Java.

4) Static variables if not synchronized properly become a major cause of thread-safety issues.

5) Example of thread-safe class in Java: Vector, Hashtable, ConcurrentHashMap, String, etc.

6) Atomic operations in Java are thread-safe like reading a 32-bit int from memory because it's an atomic operation it can't interleave with other threads.

7) local variables are also thread-safe because each thread has there own copy and using local variables is a good way to write thread-safe code in Java.

8) In order to avoid thread-safety issues minimize the sharing of objects between multiple threads.

9) Volatile keyword in Java can also be used to instruct thread not to cache variables and read from main memory and can also instruct JVM not to reorder or optimize code from threading perspective.
