# Default Methods
Default methods allow interfaces to have method implementations, reducing the need for abstract classes and enabling backward compatibility.

## When to use
- When you want to add new methods to interfaces without breaking existing implementations.
- To provide default behavior in interfaces.
- To avoid the need for utility classes.

### Examples
Here are some examples of using default methods in Java:

```java
public interface Vehicle {
    void start();

    default void stop() {
        System.out.println("Stopping the vehicle");
    }
}

public class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Starting the car");
    }
}

public class Bike implements Vehicle {
    @Override
    public void start() {
        System.out.println("Starting the bike");
    }

    @Override
    public void stop() {
        System.out.println("Stopping the bike");
    }
}
```

In the above example, the `Vehicle` interface defines a default method `stop()` which provides a default implementation for stopping the vehicle. The `Car` class implements the `Vehicle` interface and provides its own implementation for the `start()` method. The `Bike` class also implements the `Vehicle` interface but overrides the `stop()` method to provide a custom implementation.

