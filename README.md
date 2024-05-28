## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).


# Java


# 1 . Wrapper Class 
     -> Wrapper Class in java is a mechanism to convert primitive into object and object into Primitive. 
     -> In Java to represent the primitive data type as a object ,  we requered a class and that class is know as Wrapper class.
     -> * There are 8 Wrapper class {
                                        - Bytes ,
                                        - Short.
                                        - Integer.
                                        - Long 
                                        - Float
                                        - Double
                                        - Charactat
                                        - Boolean 
                                        * We also have  2 addition Wrapper class ( BigInteger and BigDecimal )
                                    }
    -> * Autoboxing 
        The automatic conversion of primitive data type into its corresponding wrapper class is known as autoboxing, for example, byte to Byte, char to Character, int to Integer, long to Long, float to Float, boolean to Boolean, double to Double, and short to Short.
    -> * Unboxing
        The automatic conversion of wrapper type into its corresponding primitive type is known as unboxing. It is the reverse process of autoboxing. Since Java 5, we do not need to use the intValue() method of wrapper classes to convert the wrapper type into primitives.

# 2 .  Java Garbage Collection
       -> Garbage Collection is process of reclaiming the runtime unused memory automatically. In other words, it is a way to destroy the unused objects.
       -> To do so, we were using free() function in C language and delete() in C++. But, in java it is performed automatically. So, java    provides better memory management.

# 3 .   Difference between final , finally and finalize in java ?
Ans    * final :- It's Keyword (Explain this).
       * Finally :- Always Escuting Block(Related to Exeption handling[Explain this With Example]).
       * Finalized :- It's a Methode of an Object Class in java. It is used as deconstructor (Garbage Collection) in java used to free       unused memory.


# 4 . Singleton Method Design Pattern in Java

     -> Java singleton class is a class that can have only one object (an instance of the class) at a time. After the first time, if we try to instantiate the Java Singleton classes, the new variable also points to the first instance created. So whatever modifications we do to any variable inside the class through any instance, affects the variable of the single instance created and is visible if we access that variable through any variable of that class type defined.

 *  Remember the key points while defining a class as a singleton class that is while designing a singleton class:

    -> Make a constructor private.
    -> Write a static method that has the return type object of this singleton class. Here, the concept of Lazy initialization is used to    write this static method.

  * Purpose of Singleton Class
     ->   The primary purpose of a java Singleton class is to restrict the limit of the number of object creations to only one. This often ensures that there is access control to resources, for example, socket or database connection.

     ->   Memory space wastage does not occur with the use of the singleton class because it restricts instance creation. As the object creation will take place only once instead of creating it each time a new request is made.

     ->   We can use this single object repeatedly as per the requirements. This is the reason why multi-threaded and database applications mostly make use of the Singleton pattern in Java for caching, logging, thread pooling, configuration settings, and much more.

     ->  For example, there is a license with us, and we have only one database connection or suppose our JDBC driver does not allow us to do multithreading, then the Singleton class comes into the picture and makes sure that at a time, only a single connection or a single thread can access the connection.

