# Iterator Pattern Design - DJ Playlist
![Iterator Pattern](Iterator.png)

# Overview
- It is a design pattern that lets you traverse elements without exposing the underlying implementation such as trees, stack, list, etc.

# Problem
- Collection and it's traversal algorithms should not be added to the same class as they might be application specific and violate Single Responsibiltiy Principle.
- Client code should not be coupled with the specific collection classes.

# Solution
- Traversal behaviour of a collection should be extracted into a separate class called iterator.
- Several iterator objects can traverse the collection independently at the same time as they encapsulate all the traversal details along with the traversal algorithms.
- All iterators must implement the same interface which makes the client code compatible with any collection type or any traversal algorithm. New iterator classes can be added without having to change the collection or the client.

# Applicability
- When the collection has an underlying complex data structure and we want to hide it's complexity from the client either for conveinience or for security reasons.
- When we want to reduce the duplication of non-trivial bulky iteration algorithms across different business logic of the app as it violates Single Responsibility Principle.
- Use the iterator pattern when you want your code to work with different data structure traversals or if the types of structure may not be known beforehand. 

# Implementation
1. Declare the iterator interface with methods to fetch the elements, tracking current position, checking for end of iterator, etc.
2. Declare the collection interface with a method to get the iterators with the return type of the interator interface. Similar methods could be declared for distinct group of iterators.
3. Implement concrete iterator classes for collections with each iterator object linked to a single collection instance usually via the interator's constructor.
4. Implement the collection interface in your collection classes to provide a method for creating iterators for the specific collection and pass the collection to the iterator's constructor to create a link between them.
5. Update the client code to use iterators instead of traversal code. Client will create a new iterator object each time it needs to traverse the collection elements.

# Benefits and Pitfalls
Benefits:
- Single Responsibility Principle: Bulky traversal algorithms are moved to separate classes.
- Open/Closed Principle: New type of iterators and collections can be created and passed to the existing client code without breaking anything.
- Same collections can be traversed in parallel as each iterator object contains it's own iteration state.
- Individual iterations can be delayed and continued as needed.

Pitfalls:
- Overkill for simple collections.
- It may be less efficient than direct traversals of specialised collections.

# Relation with Other Patterns
- Iterators may be used to traverse the composite trees.
- Factory method can be used in collection classes to return different type of iterators that are compatible with the collections.