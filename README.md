# IntList Project

This project implements a simple `IntList` interface with two different storage strategies: `IntArrayList` and `IntVector`.

## Interface: IntList

- `add(int number)`: Adds a number to the list.
- `get(int id)`: Retrieves the number at the specified index.

## Implementations

### IntArrayList
- Default size: 10
- Growth strategy: Grows by 50% when full.
- More efficient when:
  - You're working with small to medium datasets.
  - You want slower memory growth to save space.

### IntVector
- Default size: 20
- Growth strategy: Doubles in size when full.
- More efficient when:
  - You're adding a lot of elements frequently.
  - You want to reduce the number of resizes.

## Example

```java
IntList list = new IntArrayList();
list.add(5);
System.out.println(list.get(0)); // prints 5

IntList vector = new IntVector();
vector.add(100);
System.out.println(vector.get(0)); // prints 100
