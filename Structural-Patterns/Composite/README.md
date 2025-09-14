# Composite Pattern Design - Browser DOM(Document Object Model)
![Composite Pattern](Composite.png)

# Overview
- It helps in composing objects as tree structures and working with them as if they were individual objects.

# Problem
- Handling the complexities of different classes and levels in representing objects as tree-like models.

# Solution
- Work with the different objects i.e composite which contain other objects or simple which are leaf nodes, through a common interface.
- All objects can be treated as same via the interface. 
- Call the methods recursively over all components of the object tree.

# Applicability
- When we have to implement a tree-like structure.
- When the client can work with composite (complex) objects and simple(leaf) objects uniformly using the component interface.

# Implementation
1. Verify that the core model can be represented as a tree and break it down into leaf elements and containers and ensure that containers can contain both leaf nodes and other containers.
2. Declare the component interface with methods that are common for both leaf and composite objects.
3. Create leaf classes that do not contain other elements.
4. Create container class to represent composite objects using an array of interface objects with add and remove methods in the interface.
5. Implement the interface in all the classes with containers class delegating most of the work to leaf nodes.

# Benefits and Pitfalls
Benefits:
- Easy to work with complex tree structure using polymorphism and recursion.
- Open/Closed Principle : New elements that work with the object tree can be added without breaking existing code.

Pitfalls:
- It might be required to over-generalize the component interface when working with classes that differ highly in functionality.

# Relation with Other Patterns
- Builder pattern can be used while creating complex composite trees as construction steps can be called recursively.
- Designs using composite pattern can benefit from Prototype pattern as complex structures can be reused instead of re-constructing them from scratch.