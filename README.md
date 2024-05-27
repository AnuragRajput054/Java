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


* 1 . Wrapper Class 
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

