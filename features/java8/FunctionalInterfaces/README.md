# Functional Interfaces
Functional interfaces are interfaces that have a single abstract method, enabling the use of lambda expressions.

## When to use
- When you need to define a contract for a single method.
- To use lambda expressions and method references.
- To create custom functional interfaces.

### Examples
Here are some more detailed examples of functional interfaces:

1. `Runnable`: Represents a task that can be executed. For example, running a background thread. It does not accept any arguments and does not return any value.

```java
Runnable runnable = () -> {
    // Code to be executed
};
```

2. `Comparator`: Compares two objects for ordering. For example, sorting a list of objects based on a specific criteria. It accepts two arguments and returns an integer value indicating the order.

```java
Comparator<String> comparator = (str1, str2) -> str1.compareTo(str2);
```

3. `Predicate`: Tests a value and returns a boolean. For example, checking if a number is even or odd. It accepts one argument and returns a boolean value.

```java
Predicate<Integer> isEven = num -> num % 2 == 0;
```

4. `Function`: Transforms an input into an output. For example, converting a string to uppercase. It accepts one argument and returns a transformed value.

```java
Function<String, String> toUpperCase = str -> str.toUpperCase();
```
