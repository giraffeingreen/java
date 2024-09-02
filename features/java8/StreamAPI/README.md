# Stream API
The Stream API provides a powerful way to process collections of data in a functional style, allowing for parallel and sequential operations.

## When to use
- When you need to perform bulk operations on collections.
- To leverage parallel processing for performance improvements.
- To write more readable and maintainable code.

## Examples
Here are some examples of using the Stream API:

1. Filtering elements:
```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
List<Integer> evenNumbers = numbers.stream()
                                   .filter(n -> n % 2 == 0)
                                   .collect(Collectors.toList());
```

2. Mapping elements:
```java
List<String> names = Arrays.asList("John", "Jane", "Alice");
List<Integer> nameLengths = names.stream()
                                 .map(String::length)
                                 .collect(Collectors.toList());
```

3. Reducing elements:
```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
int sum = numbers.stream()
                 .reduce(0, Integer::sum);
```

