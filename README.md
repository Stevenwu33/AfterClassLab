Summary:

1. n Java, upcasting refers to the process of converting a subclass object to a superclass type,allowing access to the methods and properties defined in the superclass.
    Downcasting is the reverse operation, where a superclass reference is cast to a subclass type, but it requires an explicit cast and can throw a ClassCastException if the object is not actually an instance of the subclass.

2. Polymorphism in Java is when one method can work with different types of objects, allowing the same method to behave differently depending on the object’s actual class.
   It usually happens through method overriding, where a subclass gives its own version of a method that’s already defined in the superclass

3. The instanceof operator in Java is used to check if an object is an instance of a particular class or subclass. It returns true if the object is of the specified type or a type that is a subclass of it, and false otherwise.
    This operator is useful for ensuring type safety when downcasting, preventing ClassCastException by confirming the object's type before performing the cast.

4. Abstraction in Java is a concept that hides the complex implementation details of a class and only exposes the necessary features to the user. It is achieved using abstract classes and interfaces,
    where an abstract class can have both abstract (no implementation) and concrete (with implementation) methods, while an interface only contains abstract methods.

5. In Java, an interface is a reference type that defines a contract of methods that a class must implement, without providing the method implementation itself. A class can implement multiple interfaces,
   allowing it to inherit behaviors from multiple sources, which is Java’s way of supporting multiple inheritanc
