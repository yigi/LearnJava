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
Comparator byRanking = 
  (Player player1, Player player2) -> Integer.compare(player1.getRanking(), player2.getRanking());
```