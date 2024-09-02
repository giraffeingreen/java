# Lambdas
Lambdas allow you to write more concise and expressive code by enabling functional programming in Java.

## When to use
- When you need to pass behavior as a parameter.
- To make code more readable and concise.
- To use functional interfaces.

## Examples
Here are some examples of using lambdas in Java:

1. Sorting a list of strings in ascending order:
```java
List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
names.sort((a, b) -> a.compareTo(b));
```

2. Filtering a list of numbers to get only the even ones:
```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
List<Integer> evenNumbers = numbers.stream()
                                   .filter(n -> n % 2 == 0)
                                   .collect(Collectors.toList());
```

3. Mapping a list of objects to a list of their names:
```java
List<Person> people = Arrays.asList(new Person("Alice"), new Person("Bob"), new Person("Charlie"));
List<String> names = people.stream()
                           .map(Person::getName)
                           .collect(Collectors.toList());
```

