"Anytime you find yourself writing code of the form "if the object is of type T1, then do something, but if it's of type T2, then do something else," slap yourself.

Here's an example of the type of abuse Scott Meyers is speaking of:

```java
/**
* Naive, incorrect use of instanceof.
*/
public final class BadInstanceOf {

  public static void doSomething(Animal animal){
    if (animal instanceof Fish){
      Fish fish = (Fish)animal;
      fish.swim();
    }
    else if (animal instanceof Spider){
      Spider spider = (Spider)animal;
      spider.crawl();
    }
  }
```

```java 
  // PRIVATE
  private static class Animal {}

  private static final class Fish extends Animal {
    void swim(){}
  }
  private static final class Spider extends Animal {
    void crawl(){}
  }
} 
```

The mistake is corrected by using an overridable method:

```java 
/**
* Using polymorphism to call different methods.
* Does not use instanceof.
*/
public final class BadInstanceOfFixed {

  public static void main(String... aArgs){

     Animal animal = new Animal();
     doSomething(animal);
     
     //repoint the same 'animal' reference to other objects:
     
     animal = new Fish();
     doSomething(animal);
     
     animal = new Spider();
     doSomething(animal);
     
     log("Done.");
  }
```

```java
/**
  * This method implementation doesn't care at all 
  * about Fish/Spider. It just knows that it has 
  * been passed an Animal. Different versions of 
  * 'move' are called, specific to each Animal. 
  */
  public static void doSomething(Animal aAnimal){
    aAnimal.move();
  }

  // PRIVATE 
  private static class Animal {
    void move(){
      log("Move like an animal...");
    }
  }

  private static final class Fish extends Animal {
    @Override void move(){
      log("Move like a fish...");
    }
  }
  private static final class Spider extends Animal {
    @Override void move(){
      log("Move like a spider...");
    }
  }
}
```