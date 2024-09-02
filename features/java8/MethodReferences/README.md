# Method References
Method references allow you to refer to methods or constructors without invoking them, making code more concise and readable.

## When to use
- When you want to pass a method as an argument to another method.
- To make code more readable and concise.
- To use existing methods as lambdas.

### Examples
Here are some examples of using method references:

1. Passing a static method as an argument:
```java
List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
names.forEach(System.out::println);
```

2. Using an instance method of an object:
```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
numbers.forEach(Integer::toString);
```

3. Referencing a constructor:
```java
Supplier<List<String>> listSupplier = ArrayList::new;
List<String> newList = listSupplier.get();
```

