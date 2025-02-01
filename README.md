# ModArrayList
ModArrayList is a custom extension of Java's ArrayList that allows for retrieving elements using modular arithmetic. This ensures valid indexing even with negative indices or numbers larger than the list size.

## Features

Inherits all functionality from ArrayList<D>.

Implements getUsingMod(int num), which retrieves elements using modular arithmetic.

Supports negative indices by wrapping around the list correctly.

Prevents division by zero when the list is empty.

## Explanation

Modular Indexing: Ensures that indices always map to a valid position in the list.

Negative Index Handling: Uses (num % size + size) % size to wrap around correctly.

Empty List Handling: Throws an IndexOutOfBoundsException if accessed when empty.

## Requirements

Java 8 or later
