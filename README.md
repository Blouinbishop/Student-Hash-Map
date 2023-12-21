# Hash Map Implementation in Java

This Java program implements a basic hash map with a linked list to handle collisions. It consists of two classes: `HashNode` and `Map`.

## `HashNode` Class

The `HashNode` class represents a node in the hash map, containing a key, a value, and a reference to the next node in case of collisions.

### Methods

- `getKey()`: Returns the key of the node.
- `getValue()`: Returns the value associated with the key.
- `setValue(V value)`: Updates the value associated with the key.

## `Map` Class

The `Map` class implements the hash map, which uses an array of chains (linked lists) to handle collisions.

### Fields

- `bucketArray`: An ArrayList of HashNode to store the array of chains.
- `numBuckets`: The current capacity of the array list.
- `size`: The current size of the array list.

### Methods

- `size()`: Returns the size of the hash map.
- `isEmpty()`: Checks if the hash map is empty.
- `remove(K key)`: Removes a key-value pair from the hash map.
- `get(K key)`: Retrieves the value associated with a given key.
- `add(K key, V value)`: Adds a key-value pair to the hash map.

### Load Factor and Resizing

The hash map dynamically resizes itself when the load factor exceeds a threshold (0.7), doubling the size of the array and rehashing existing elements.

## Usage

To use this hash map implementation, create an instance of the `Map` class and use its methods to add, retrieve, or remove key-value pairs.

```java
Map<String, Integer> hashMap = new Map<>();
hashMap.add("one", 1);
int value = hashMap.get("one");
hashMap.remove("one");
