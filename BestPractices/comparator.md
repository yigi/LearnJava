```java
Comparator<Employee> byName = new Comparator<Employee>() {
    public int compare(Employee e1, Employee e2) {
        return e1.getName().compareTo(e2.getName());
    }
}

byName.compare(mick,nick);
```

or with lambdas

```java
Comparator<Employee> byName = 
    (Employee e1, Employee e2) -> {
        return e1.getName().compareTo(e2.getName());
    }
```

even you can remove parameter types and curly braces

```java
Comparator<Employee> byName =
    (e1,e2) -> {
        return e1.getName().compareTo(e2.getName());
    }
```

also you can remove return statement with braces

```java
Comparator<Employee> byName = 
    (e1,e2) -> e1.getName().compareTo(e2.getName());
```