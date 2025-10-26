# Observer/Event-Subscriber/Listener Pattern Design - GUI Event Handling
![Observer Pattern](Observer.png)

# Overview
- It lets you define a subscription mechanism to notify multiple objects about any events that happen to the objects they are observing.

# Problem
- One of the objects needs to constantly poll for the event states in the other object leading to tight coupling and inefficiency.
- The object sending the events has to spam all the other objects such as broadcasting which is again inefficient.

# Solution
- The object which has some state that is interesting to other objects is called subject but since it also notifies the other objects it can be called publisher as well.
- All objects that want to track changes to the publisher's state are called subscribers/observers.
- A subscription mechanism is added to the publisher class with a list of subscribers and public methods to subscribe/unsubscribe.
- All subscribers should implement the same interface and the publisher communicates with them only via that interface.
- Interface method should have some parameters to pass the contextual data, usually the parameter is the publisher object.
- If there are multiple publishers, publisher interface can be created to avoid coupling between subscribers and publishers.

# Applicability
- When changes to the state of one object may require changes in other objects, and the actual set of objects in unknown beforehand or changes dynamically.
- When some objects need to observe other objects but only for a limited time or in specific cases as subscribers of an object can be updated dynamically.

# Implementation
1. Distinguish the publisher classes and the subscriber classes.
2. Declare the subscriber interface with atleast an update method with some parameters.
3. Declare the publisher interface and a pair of methods to subscribe/unsubscribe and publishers only refer the subscribers interface objects.
4. The actual implementation of the subscription methods and the list can be put in an abstract class derived from the publisher interface and then all real publishers become subclasses of that abstract class. When dealing with existing class hierarchies, create the implementation as a separate object and use composition to use it in all real publishers.
5. Implement concrete publisher classes which notify the subscribers on important events.
6. Implement the update notification method in all concrete subscribers and get required data via parameter or get publisher object as the parameter and fetch the data using that object.
7. Client creates all necessary subscribers and registers them with the publishers.

# Benefits and Pitfalls
Benefits:
- Open/Closed Principle: New subscriber classes can be added without having to change the publisher's code.
- Relations b/w publishers and subscribers can be established during runtime.

Pitfalls:
- Subscribers are notified in random order.

# Relation with Other Patterns
- Chain Of Responsibility, Command and Mediator and Observer address various ways of connecting senders and receivers:
    - CoR passes a request sequentially along a dynamic chain of potential receivers until one of them handles the request.
    - Command establishes unidirectional connection between the sender and receiver.
    - Mediator eliminates direct communication and forces them to communicate indirectly via the mediator object.
    - Observer lets dynamic receivers subscribe/unsubscribe from receiving objects.

- The difference between mediator and observer pattern is very bleak. Mostly either pattern can be implemented but sometimes they may be applied simultaneously:
    - Mediator object plays the role of the publishers and the components act as the subscribers which subscribe/unsubscribe the mediator's events. In this scenario, mediator looks very similar to observer.
    - Mediator can be implemented in other ways as well so don't get confused between these two patterns.