# Balanced Brackets algorithm using Deque

This project uses Java 1.8 , JUnit 4.13 and Maven 3.6.3

#### Tests with Maven
```mvn clean test``` - normal maven test  

#### Challenges

* Balanced Brackets: Used a Deque (instead of Stack) to solve the problem where each closing bracket will pop out the opening bracket of the same type. If the Stack ends up empty then we know that the brackets were balanced.

An ArrayDeque is a special kind of a growable array that allows us to add or remove an element from both sides.

An ArrayDeque implementation can be used as a Stack (Last-In-First-Out) or a Queue(First-In-First-Out).

According to https://docs.oracle.com/javase/8/docs/api/java/util/Deque.html: Deques can also be used as LIFO (Last-In-First-Out) stacks. This interface should be used in preference to the legacy Stack class.
