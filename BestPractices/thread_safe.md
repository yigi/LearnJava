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