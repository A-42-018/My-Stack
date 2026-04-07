# MyStack Implementation

A step-by-step evolution of a Stack data structure in Java, moving from a fixed-size integer array to a generic, theoretically infinite stack.

## Project Evolution

### Phase 1: Fixed-Size Integer Stack
- Implemented using a primitive `int[]` array.
- Managed by a `stackPointer`.
- Limited by the initial array size.

### Phase 2: Infinite Stack
- Refactored to use `java.util.ArrayList`.
- Removed capacity constraints to allow a theoretically infinite stack.
- Updated core methods to leverage dynamic list resizing.

### Phase 3: Generic Type Stack
- Refactored class to `MyStack<T>`.
- Supports any Object type (Strings, Integers, Custom Objects).
- Type safety ensured via Java Generics.

## Features
- **push(T item)**: Adds an element to the top of the stack.
- **pop()**: Removes the top element.
- **top()**: Returns the top element without removing it.
- **isEmpty()**: Returns true if the stack contains no elements.
- **getSize()**: Returns the current number of elements in the stack.

## Git Versioning Guidelines
Each phase was committed individually to demonstrate the development lifecycle:
1. `Initial commit: Fixed-size int stack`
2. `Refactor: Use ArrayList for infinite capacity`
3. `Feature: Convert stack to generic type T`
4. `Test: Add test cases for Generic MyStack`

## Usage Example
```java
MyStack<String> stack = new MyStack<>();
stack.push("Hello World");
System.out.println(stack.top()); // Outputs: Hello World
stack.pop();
System.out.println(stack.isEmpty()); // Outputs: true
