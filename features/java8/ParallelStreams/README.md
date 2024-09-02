# Parallel Streams
Parallel streams allow for efficient parallel processing of data, leveraging multi-core processors to improve performance.

## When to use
- When you need to process large collections of data in parallel.
- To improve performance by leveraging multi-core processors.
- To write more efficient and scalable code.

## Examples
Here are some examples of using parallel streams:

1. Parallelizing a list of numbers:
```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

int sum = numbers.parallelStream()
                 .mapToInt(Integer::intValue)
                 .sum();

System.out.println("Sum of numbers: " + sum);
```

2. Filtering a list of strings:
```java
List<String> names = Arrays.asList("John", "Jane", "Adam", "Eve", "Mike");

List<String> filteredNames = names.parallelStream()
                                 .filter(name -> name.startsWith("J"))
                                 .collect(Collectors.toList());

System.out.println("Filtered names: " + filteredNames);
```

3. Performing calculations on a large dataset:
```java
List<Integer> data = new ArrayList<>();
// populate the list with a large dataset

double average = data.parallelStream()
                     .mapToInt(Integer::intValue)
                     .average()
                     .orElse(0.0);

System.out.println("Average: " + average);
```

These examples demonstrate how parallel streams can be used to process data in parallel, improving performance and allowing for more efficient and scalable code.
