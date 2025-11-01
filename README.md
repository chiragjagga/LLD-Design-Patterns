# LLD Design Patterns

- Low Level Design Patterns in Java and C#.
- Design with example and notes in individual folders.

## [Creational Patterns](CreationalPatterns)
 Provide object creation mechanisms that increase flexibility and reuse of existing code.
>### [Factory Method](CreationalPatterns/Factory%20Method)
>Provide an interface for creating objects in a superclass and allow subclasses to alter the types of objects.
>### [AbstractFactory](CreationalPatterns/AbstractFactory)
>Produces families of similar/related/dependent objects without specifying their concrete classes.
>### [Builder](/CreationalPatterns/Builder)
>Constructs complex objects step by step and allows to produce different kinds of objects with same code if the steps to create them are same.
>### [Prototype](/CreationalPatterns/Prototype)
>It allows to create new objects by cloning existing objects also know as prototypes.
>It clones the objects without coupling the concrete class using an interface with clone method and copy constructor in concrete classes.
>### [Singleton](/CreationalPatterns/Singleton)
>Class has only one instance with global access to that instance. Example - Loggers, thread pools, connection pools, caches, etc.

## [Structural Patterns](Structual-Patterns)
They help is assembling objects and classes into a larger structure while keeping them flexible and efficient.
>### [Adapter](/Structural-Patterns/Adapter)
>Allows objects with incompatible interfaces to collaborate by converting the interface of one class into another that is used in the client.
>### [Bridge](/Structural-Patterns/Bridge)
>It allows to split a large class or closely related classes into two different dimensions, where one is abstraction which acts as a high-level control layer and delegates the work to the other which is the implementation/platform which does the actual work and both can be developed independently.
>### [Composite](/Structural-Patterns/Composite)
>It helps in composing objects as tree structures and working with them as if they were individual objects.
>### [Decorator](/Structural-Patterns/Decorator)
>It allows to attach new behaviours to objects by creating special wrapper classes that contain the additional behaviours and a reference to the object it is decorating.
>### [Facade](/Structural-Patterns/Facade)
>It provides a simplified interface to a library, framework or any other complex set of classes or subsystems.
>### [Flyweight](/Structural-Patterns/Flyweight)
>This pattern lets us efficiently share the common state (same value high memory consuming fields) across multiple objects instead of duplicating it in every object to reduce RAM usage and boost the performance.
>### [Proxy](/Structural-Patterns/Proxy)
>It allows to provide a substitute or placeholder for another object. The control of the real object lies with the proxy which allows to perform actions either before/after the request goes to the original object.

## [Behavioural Patterns](Behavioural-Patterns)
Effective communication and assignment of responsibilities between objects.
>### [Chain Of Responsibility](/Behavioural-Patterns/ChainOfResponsibility)
>It lets us pass requests along a chain of handlers which decide either to process the request or pass it to the next handler in the chain.
>### [Command](/Behavioural-Patterns/Command)
>It lets you represent requests as stand-alone objects with all information about the request. This allows you to pass the request as method arguments, delay or queue the reqeust's execution or support different operations such as undo/redo.
>### [Iterator](/Behavioural-Patterns/Iterator)
>It is a design pattern that lets you traverse elements without exposing the underlying implementation such as trees, stack, list, etc.
>### [Mediator](/Behavioural-Patterns/Mediator)
>It lets you reduce chaotic dependencies between objects by restricting the direct communication between objects and forcing them to communicate via a mediator object.
>### [Memento](/Behavioural-Patterns/Memento)
>It lets you save and restore the previous state of an object without revealing the details of it's implementation.
>### [Observer](/Behavioural-Patterns/Observer)
>It lets you define a subscription mechanism to notify multiple objects about any events that happen to the objects they are observing.
>### [State](/Behavioural-Patterns/State)
>It let's an object alter it's behavior when it's internal state changes as if the object changed it's class.
>### [Strategy](/Behavioural-Patterns/Strategy)
>It lets you define a family of algorithms, put them into a separate class and make their objects interchangable.
>### [Template Method](/Behavioural-Patterns/TemplateMethod)
>It defines the skeleton of an algorithm in the superclass but lets subclasses override steps of the algorithm without changing it's structure.
>### [Visitor](/Behavioural-Patterns/Visitor)
>It lets you separate algorithms from the objects on which they operate.
