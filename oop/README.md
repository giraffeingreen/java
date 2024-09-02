# Object-Oriented Programming Principles
## Table of Contents
1. [Introduction](#introduction)
2. [Encapsulation](#encapsulation)
3. [Inheritance](#inheritance)
4. [Polymorphism](#polymorphism)
5. [Abstraction](#abstraction)

## Introduction

Object-Oriented Programming (OOP) is a programming paradigm that organizes code into objects, which are instances of classes. OOP focuses on the concepts of objects that contain data and code, rather than functions and logic. This paradigm is designed to increase flexibility and maintainability in programming, and is widely used in large-scale software engineering.

## Encapsulation

Encapsulation is the bundling of data and the methods that operate on that data within a single unit, or object. This concept is used to hide the internal representation, or state, of an object from the outside. This is called information hiding.

### Key aspects of encapsulation:
- Data protection: By using access modifiers like private, we can control the access to the data members of a class.
- Controlled access to data: Encapsulation allows us to define getter and setter methods to access and modify the data members of a class.
- Flexibility to change internal implementation: Encapsulation provides a way to change the internal implementation of a class without affecting the code that uses the class.

Here's an example of encapsulation in Java:

```java
public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
```

## Inheritance

Inheritance is a mechanism where you can derive a class from another class for a hierarchy of classes that share a set of attributes and methods. It's one of the most important features of OOP.

### Benefits of inheritance:
- Code reusability: Inheritance allows you to reuse code from a base class in derived classes, reducing code duplication.
- Method overriding: Inheritance enables you to override methods defined in the base class to provide specialized implementations in derived classes.
- Establishment of a class hierarchy: Inheritance helps in organizing classes into a hierarchical structure, representing relationships between classes.

Here's an example of inheritance in Java:

```java
public class Animal {
    public void eat() {
        System.out.println("Animal is eating");
    }
}

public class Dog extends Animal {
    public void bark() {
        System.out.println("Dog is barking");
    }
}
```

## Polymorphism

Polymorphism allows objects of different classes to be treated as objects of a common base class. It provides a way to perform a single action in different forms and a way to invoke methods of a derived class through a base class reference during runtime.

Here's an example of polymorphism in Java:

```java
public class Shape {
    public void draw() {
        System.out.println("Drawing a shape");
    }
}

public class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

public class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}
```

## Abstraction

Abstraction is the process of hiding the implementation details from the user and showing only the functionality. It deals with the outside view of an object, separating its essential behavior from the details of how it actually does its work.

Here's an example of abstraction in Java:

```java
public abstract class Animal {
    public abstract void makeSound();
}

public class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog is barking");
    }
}

public class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat is meowing");
    }
}
```

By understanding and applying these principles, developers can create more efficient, maintainable, and scalable software systems.
