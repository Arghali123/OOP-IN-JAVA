# java.io.Package
This package provides for system input and output through data streams,serialization and the file system.Unless otherwise noted,passing a null argument to a custructor or method in any class or interface in this package will cause a **NullPointerException** to be thrown.Some important class of this packages are:
- BufferedInputStream
- BufferedOutputStream
- BufferedReader
- BufferedWriter
- File
- FileDescripter
- FileInputStream
- FileOutputStream
- FilePermission
- FileReader and FileWriter
- StringBufferedInputStream
- StringReader
- StringWriter
- Writer

## Stream Classes
A stream is a method to sequentially access a file.I/O stream means an input source or output destination representing different types of sources eg disk files.The java.io package provides classes that allows you to convert between Unicode character streams and byte streams of non-unicode text.
- **Stream:** A sequence of data.
- **Input Stream:** reads data from source.
- **Output Stream:** writes data to destination.

### Character Stream
In java, characters are stored using unicode conventions.Character stream automatically allows us to read/write data character by character.For example,**FileReader** and **FileWriter** are character streams used to read from the source and write to destination.

### Byte Stream
Byte Stream process data byte by byte(8 bits).For example **FileInputStream** is used to read from the source and **FileOutputStream** to write to the destination.

**When to use Character Stream over Byte Stream?**

In java,characters are stored using unicode conventions.Character stream is useful when we want to process text files.These text files can be processed character by character.A character is typically 16 bits.

**When to use Byte Stream over Character Stream?**

Byte Stream reads byte by byte.A byte stream is suited for processing raw data like binary files.

## Serialization Interface
Seializable is a marker interface(has no data member and method).It is used to mark Java classes so that objects of these classes may get certain capability.The cloneable and Remote are also marker interface.

It must be implemented by the class whose objects you want to persist.The String class and all the wrapper classes implement the **java.io.Serializable** interface by default.

## Serialization and Deserialization
**Serialization** is a mechanism of converting the state of an object into a byte stream.

**Deserialization** is the reverse process where the byte stream is used to recreate the actual Java object in memory.This machanism is used to persist the object.

![Serialization and deseialization](serialize-deserialize-java.png)

The byte stream created in platform independent.so,the object serialized on one platform can be deserialized on a different platform.

**Line**
```
private static final long serialVersionUID = 1L;
```
Meaning:


This line defines a unique identifier for your class during serialization and deserialization.

✅ **Why is it used?**


In Java, when you serialize an object (i.e., save it to a file), the JVM records the class structure — including field types, method signatures, etc. When you later deserialize it, the JVM checks if the class definition matches what was used when the object was serialized.

This is where *serialVersionUID** helps.

🧠 **Without serialVersionUID:**

If you make any change to the class later (e.g., add a new field) and try to deserialize an old object, Java may throw:
```
InvalidClassException: ...local class incompatible...
```
**Because it automatically generates a version ID that no longer matches.**

💡 **With serialVersionUID:**
You tell Java:

> "Hey, even if I make some small changes to the class, I still want this version to be considered compatible."

**As long as you don't change the class drastically, deserialization will still work.**