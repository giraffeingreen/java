# Optional
The Optional class provides a way to handle null values more effectively, reducing the chances of NullPointerExceptions.

## When to use
- When a method might not return a value.
- To avoid null checks and NullPointerExceptions.
- To make the absence of a value explicit.

### Examples
Here are some examples of using the Optional class:

1. Using `Optional` to handle a potentially null value:
```java
Optional<String> optionalValue = Optional.ofNullable(getValue());
if (optionalValue.isPresent()) {
    String value = optionalValue.get();
    // Do something with the value
} else {
    // Handle the absence of a value
}
```

2. Using `Optional` with `orElse` to provide a default value:
```java
Optional<String> optionalValue = Optional.ofNullable(getValue());
String value = optionalValue.orElse("Default Value");
// Use the value, either the actual value or the default value
```

3. Using `Optional` with `orElseThrow` to throw an exception if no value is present:
```java
Optional<String> optionalValue = Optional.ofNullable(getValue());
String value = optionalValue.orElseThrow(() -> new RuntimeException("Value not found"));
// Use the value, or throw an exception if no value is present
```

