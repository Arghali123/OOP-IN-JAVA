# Arrays and Collection Classes/Interfaces
An array is a group of liked-typed variables that are referred by a common name.Arrays in java work differently then they do in C/C++.Following are some important points about java arrays:
- dynamically allocated.
- Since arrays are objects in java,we can find their length using member length.This is different from C/C++ where we find length using sizeof.
- A Java array variable can also be declared like other variables with [] after the data type.
- The variables in the array are ordered and each have an index beginning from 0.
- Java array can be also be used as a static field,a local variable or a method parameter.
- The size of an array must be specified by an int value and not long or short.

## Collection Classes/Interfaces
A collection is a group of individual objects represented as a single unit.Java provides Collection Framework which defines several classes and interfaces to represent a group of objects as a single unit.

```
This means that Java Collections allow you to store, manage, and process multiple objects (like integers, strings, custom objects) as one object — like storing all books in a library into a List, or storing unique student IDs in a Set.
```

## Why Collections are Useful:
- No need to create separate variables for each object.
- Easy to add, remove, search, sort data.
- Efficient for data manipulation and data structure operations.

The Collection interface(**java.util.Collection**) and Map interface(**java.util.Map**) are the two main "root" interfaces of Java Collection classes.

### Advantages of Collection Framework
Before Collection Framework(or before JDK 1.2) was introduced,the standard method for grouping Java objects(or Collections) were **Arrays or Vectors or HashTables**.All of these collections had no common interface.

Accessing elements of these data structures was a hassle as each had a different method(and syntax) for accessing its members.
1. **Consistent API**: The API has a basic set of interfaces like Collection,Set,List or Map.All classes(ArrayList,LinkedList,Vector etc) that implements these interfaces have commen set of method.

1. **Reduces Programming Effort**: A programmer doesn't have to worry about the design of Collection,and he can focus on its best use in his program.

1. **Increases Program Speed and Quality**: Increases performance by providing high performance implementations of useful data structure and algorithm.

# Collection Interfaces
- Map Interface
- List Interface
- Set Interface

## Map Interface
The **java.util.Map** interface represents a mapping between a key and a value.Few characteristics of Map interface are as follow:
- **No Duplicate Keys, One Value per Key**
  - A **Map** cannot have duplicate keys. Each key maps to **at most one value**.
  - If you try to insert the same key again, it will overwrite the previous value.

**Example:**
```
Map<String, String> map = new HashMap<>();
map.put("Nepal", "Kathmandu");
map.put("India", "Delhi");
map.put("Nepal", "Pokhara"); // This will replace "Kathmandu" with "Pokhara"

System.out.println(map);
// Output: {India=Delhi, Nepal=Pokhara}

```

-  **Null Keys and Null Values**
   -  Some implementations **allow null keys and values**:
   - ✅ HashMap and LinkedHashMap allow one null key and multiple null values.
   - ❌ TreeMap does not allow null keys because it needs to compare keys (uses natural ordering).
**Example:**
```
Map<String, String> hashMap = new HashMap<>();
hashMap.put(null, "NullKeyAllowed");
hashMap.put("Fruit", null);
System.out.println(hashMap);
// Output: {null=NullKeyAllowed, Fruit=null}

Map<String, String> treeMap = new TreeMap<>();
treeMap.put(null, "Test");  // Throws NullPointerException

```

- **Order Depends on Implementation**
  - **HashMap**: No order of keys or values.
  - **LinkedHashMap**: Maintains insertion order.
  - **TreeMap**: Maintains natural sorted order of keys.

Example:
```
Map<String, Integer> hashMap = new HashMap<>();
hashMap.put("Banana", 3);
hashMap.put("Apple", 2);
hashMap.put("Cherry", 1);
System.out.println("HashMap: " + hashMap);

Map<String, Integer> linkedMap = new LinkedHashMap<>();
linkedMap.put("Banana", 3);
linkedMap.put("Apple", 2);
linkedMap.put("Cherry", 1);
System.out.println("LinkedHashMap: " + linkedMap);

Map<String, Integer> treeMap = new TreeMap<>();
treeMap.put("Banana", 3);
treeMap.put("Apple", 2);
treeMap.put("Cherry", 1);
System.out.println("TreeMap: " + treeMap);

//Output
HashMap: {Apple=2, Banana=3, Cherry=1}    // order may vary
LinkedHashMap: {Banana=3, Apple=2, Cherry=1} // preserves insertion order
TreeMap: {Apple=2, Banana=3, Cherry=1}   // sorted by key
```


- **Interfaces and Classes**
  - **Interfaces**:
    - Map<K, V> – the base interface for key-value pairs.
    - SortedMap<K, V> – maintains a sorted order (extended by NavigableMap).
  - **Classes**:
    - **HashMap** – no order, allows null.
    - **TreeMap** – sorted order, no null keys.
    - **LinkedHashMap** – insertion order, allows null.

## Methods in Map Interface:
1. put(key,value): This method is used to insert an entry in this map.
1. pullAll(Map map): This method is used to insert the specified map in this map.
1. remove(key): This method is used to delete an entry for the specified key.
1. get(key): This method is used to return the value for the specified key.
1. containsKey(key): This method is used to search the specified key from this map.
1. clear(): This method is used to clear all the elements.
1. size(): This method returns the number of components.

## List Interface
The **java.util.List** is a child interface of Collection.It is **an ordered collection of objects in which duplicate values can be stored**.Since List preserves the insertion order,it allows positional access and insertion of elements.**List interface is implemented by ArrayList,LinkedList,Vector and Stack classes**.

List is an interface,and the instances of List can be created in the following ways:
```
List a=new ArrayList();
List b=new LinkedList();
List c=new Vector();
List d=new Stack();
```

### Methods in List Interface:
1. **add(element)**: This method is used to add elements in the list.
1. **get(index)**: This method is used to retrieve elements on the basis of index number.
1. **isEmpty()**: This method tests if this List has no Components.
1. **remove(index)**: This method removes a single elements on the basis of index number.
1. **clear()**: This method is used to clear all the elements from the List.
1. **size()**: This method returns the number of components in the List.
1. **removeAllElements()**: This method removes all the components from the List ans sets its size to zero.
1. **indexOf(element)**: This method returns first occurance of given element or -1 if the element is not present in the List.
1. **lastIndexOf(element)**: This method returns the last occurance of given element or -1 if the element is not present in the List.

## Set Interface
- Set is an  interface which extends Collection.It is an **unordered collection of objects in which duplicate values cannot be stored**.
- Basically,Set is implemented by **HashSet,LinkedHashSet or TreeSet(sorted representation)**.
- Set has various methods to add,remove,clear,size etc to enhance the usage of this interface.


###  Methods in Set Interface
1. **add(element)**: This method is used to add element in Set.
1. **get(index)**: This method is used to retrieve elements on the basis of index number.
1. **isEmpty()**: This method tests if this Set has no components.
1. **remove(index)**: This method removes a single element on the basis of index number.
1. **clear()**: This method is used to clear all the elements from the Set.
1. **size()**: This method returns the number of components in this Set.
1. **removeAllElements()**: This method removes all components from this Set and sets its size to zero.
1. **indexOf(element)**: This method returns first occurance of given element or -1 if the element is not present in Set.
1. **lastIndexOf(element)**: This method returns the last occurance of given element or -1 if the element is not present in Set.

# Collection Classes
## Array List
The ArrayList class extends AbstractList and implements the List interface.ArrayList supports dynamic arrays that can grow as needed.
Standard Java arrays are of fixed length.After arrays are created,they cannot grow or shrink,which means you must know in advance how many elements an array will hold.
ArrayList are created with initial size.When the size is exceeded ,the collection is automatically enlarged.When objects are removed,the array may be shrunk.

### Methods of ArrayList
add(),get(),remove(),size(),clear(),isEmpty(),indexOf(),lastIndexOf(),contains().

## Linked List
Like arrays,Linked List is a linear data structure.Unlike arrays,linked list elements are not stored at the contiguous location,the elements are linked using pointers.

//Methods are same as ArrayList


## Hash Map
HashMap is part of Java's collection since Java 1.2.It provides the basic implementation of Map interface of Java.It stores the data in (Key,Value) pairs.To access value one must know its key.It uses technique called hashing.Hashing is a technique of converting a large String to small String that represents the same String.A shorter value helps in indexing and faster search.

//Methods is same as Hash Set

## Hash Set
The HashSet class implements the Set interface,backed by hash table which is actually a HashMap instance.Few important features of HashSet are:
- Implements HashSet.
- Underlying data structure for HashSet is hashTable.
- As it implements the Set interface,duplicate values are not allowed.
- Objects that you insert in HashSet are not guaranteed to be inserted in same order.
- Objects are inserted based on their hash key.
- NULL elements are allowed in HashSet.

//Methods are similar to map set interface.

## Tree Set
TreeSet is one of the most important implementations of the SortedSet interface in java that uses a Tree for storage.The ordering of the elements is maintained by a set using their natural ordering wheather or not an explicit comparator is provided.This must be consistent with equals if it is to correctly implement the Set interface.

Few important features of TreeSet are as follow:
- TreeSet implements the SortedSet interface so duplicate values are not allowed.
- Objects in a TreeSet are stored in sorted and ascending order.
- TreeSet doesnot preserve the insertion order of elements but elements are stored by keys.
- TreeSet doesnot allow to insert Heterogeneous objects.It will throw classCastException at Runtime if trying to add heterogeneous objects.
- TreeSet serves as an excellent choice for storing large amounts of sorted information which are supposed to be accessed quickly because of its faster access and retrieval time.

//Methods are same as Set interface

# Comparator in Java
Comparator in Java are very useful for sorting the collections of objects.Java provides some inbult methods for sort primitive types arrays or Wrapper classes array or list.

